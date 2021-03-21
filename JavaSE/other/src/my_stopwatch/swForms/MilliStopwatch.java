package my_stopwatch.swForms;

import my_stopwatch.enums.SWStatus;
import my_stopwatch.exceptions.*;

public class MilliStopwatch extends AbstractStopwatch {
    public MilliStopwatch() { }
    /**
     * 读秒表
     * @return 返回秒表当前时间
     */

    public long Time() {
        //直接调用父类方法得到结果
        return super.Time(System.currentTimeMillis());
    }

    /**
     * 读秒表字符串版
     * @param a 单位
     * @return 返回秒表当前时间的字符串版本
     */
    public String Time(String a){
        //直接调用父类方法得到结果
        return super.Time(System.currentTimeMillis(), a);
    }

    /**
     * 开始计时
     * 当前状态为停止时，开始计时；当前状态为暂停时，强制开始新一轮计时。
     * @throws SWAlreadyRunningException 状态已为运行异常
     */
    public void startSW() throws SWAlreadyRunningException {
        switch (currentStatus){
            //判断状态异常
            case running:
                throw new SWAlreadyRunningException("计时器已在运行！",Time(System.currentTimeMillis(),"ms"));
            default:
                //记录计时开始时间并更新状态
                sTime = System.currentTimeMillis();
                currentStatus = SWStatus.running;
                //清空暂停时间段
                pauseTimes.clear();
        }
    }

    /**
     * 停止计时
     * 当前状态为运行时，停止计时；当前状态为暂停时，强制停止计时。
     * @throws SWAlreadyStoppedException 当前状态已经为停止异常
     */
    public void stopSW() throws SWAlreadyStoppedException {
        switch (currentStatus){
            //判断状态异常
            case stopped:
                throw new SWAlreadyStoppedException("计时器已经停止了！",Time(System.currentTimeMillis(),"ms"));
            default:
                //更新状态
                currentStatus = SWStatus.stopped;
        }
    }

    /**
     * 继续计时
     * 当前状态为暂停，继续计时
     * @throws SWAlreadyRunningException 当前状态为运行，未暂停，异常
     * @throws SWAlreadyStoppedException 当前状态为停止，未开始计时，异常
     */
    public void continueSW() throws SWAlreadyRunningException, SWAlreadyStoppedException {
        switch (currentStatus){
            //判断状态异常
            case stopped:
                throw new SWAlreadyStoppedException("计时器未启动！",Time(System.currentTimeMillis(),"ms"));
            case running:
                throw new SWAlreadyRunningException("计时器已在运行！",Time(System.currentTimeMillis(),"ms"));
            default:
                //将本段暂停时间加入所有暂停时间段列表
                pauseTimes.add(System.currentTimeMillis()-pSTime);
                //更新状态
                currentStatus = SWStatus.running;
        }
    }

    /**
     * 暂停计时
     * 当前状态为运行，继续计时
     * @throws SWAlreadyPausedException 当前状态为暂停，异常
     * @throws SWAlreadyStoppedException 当前状态为停止，未开始计时，异常
     */
    public void pauseSW() throws SWAlreadyPausedException, SWAlreadyStoppedException {
        switch (currentStatus) {
            //判断状态异常
            case paused:
                throw new SWAlreadyPausedException("计时器已暂停！", Time(System.currentTimeMillis(), "ms"));
            case stopped:
                throw new SWAlreadyStoppedException("计时器未启动！", Time(System.currentTimeMillis(), "ms"));
            default:
                //记录暂停开始时间并更新状态
                pSTime = System.currentTimeMillis();
                currentStatus = SWStatus.paused;
        }
    }
}
