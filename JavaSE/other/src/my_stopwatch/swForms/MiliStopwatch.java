package my_stopwatch.swForms;

import my_stopwatch.enums.SWStatus;
import my_stopwatch.exceptions.*;

public class MiliStopwatch extends AbstractStopwatch {
    public MiliStopwatch() { }

    public long Time(boolean changeSTime, long changeTarget) throws SWTimeOverflowException{
        long resTime = eTime - sTime;
        if (changeSTime){
            sTime = changeTarget;
        }
        if (resTime >= Long.MAX_VALUE){
            throw new SWTimeOverflowException("记录时间过长，计时器爆掉了。",resTime);
        }else{
            return resTime;
        }
    }

    /**
     * 开始计时，会将计时归零
     */
    public void startSW(){
        if (currentStatus == SWStatus.running){
            throw new SWAlreadyRunningException("计时器已在运行！",System.currentTimeMillis()-sTime);
        }
        else {
            sTime = System.currentTimeMillis();
            currentStatus = SWStatus.running;
        }
    }

    /**
     * 停止计时，会将计时归零
     * @return 计时器记录的纳秒数
     * @throws SWTimeOverflowException 时间溢出（过长）异常
     */
    public long stopSW() throws SWTimeOverflowException {
        if(currentStatus == SWStatus.stopped){
            throw new SWAlreadyStoppedException("计时器已停止！",System.currentTimeMillis()-sTime);
        }else{
            eTime = System.currentTimeMillis();
            currentStatus = SWStatus.stopped;
            return Time(true,System.currentTimeMillis());

        }
    }

    /**
     * 继续计时，不会将计时归零
     */
    public void continueSW(){
        if(currentStatus == SWStatus.running){
            throw new SWAlreadyRunningException("计时器已在运行！",System.currentTimeMillis()-sTime);
        }else if(currentStatus == SWStatus.stopped) {
            throw new SWAlreadyStoppedException("计时器未开始！", (System.currentTimeMillis() - sTime));
        }else {
            pETime = System.currentTimeMillis();
            //去掉暂停的时间
            sTime -= (pSTime-pETime);
            currentStatus = SWStatus.running;
        }
    }

    /**
     * 暂停计时，不会将计时归零
     * @return 计时器记录的时间
     * @throws SWTimeOverflowException 时间溢出（过长）异常
     */
    public long pauseSW() throws SWTimeOverflowException {
        if (currentStatus == SWStatus.paused){
            throw new SWAlreadyPausedException("计时器已暂停！",System.currentTimeMillis()-sTime);
        }else if(currentStatus == SWStatus.stopped) {
            throw new SWAlreadyStoppedException("计时器未开始！", (System.currentTimeMillis() - sTime));
        } else{
            pSTime = System.currentTimeMillis();
            currentStatus = SWStatus.paused;
            eTime = System.currentTimeMillis();
            return Time(false,sTime);
        }
    }
}
