package my_stopwatch.swForms;

import my_stopwatch.enums.SWStatus;
import my_stopwatch.exceptions.*;

public abstract class AbstractStopwatch {

     long sTime = 0L, //开始时间
             eTime = 0L,//结束时间
             pSTime = 0L,//暂停开始时间
             pETime = 0L;//暂停结束时间
     SWStatus currentStatus = SWStatus.stopped; //计时器当前状态

    /**
     * 计算时间
     * @param changeSTime 是否更新开始时间值
     * @param changeTarget 更新目标
     * @return 时间计算结果
     * @throws SWTimeOverflowException 时间溢出（过长）异常
     */
    public abstract long Time(boolean changeSTime, long changeTarget) throws SWTimeOverflowException;

    /**
     * 开始计时，会将计时归零
     */
    public abstract void startSW();

    /**
     * 停止计时，会将计时归零
     * @return 计时器记录的时间
     * @throws SWTimeOverflowException 时间溢出（过长）异常
     */
    public abstract long stopSW() throws SWTimeOverflowException;

    /**
     * 继续计时，不会将计时归零
     */
    public abstract void continueSW();

    /**
     * 暂停计时，不会将计时归零
     * @return 计时器记录的时间
     * @throws SWTimeOverflowException 时间溢出（过长）异常
     */
    public abstract long pauseSW() throws SWTimeOverflowException;


}
