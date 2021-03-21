package my_stopwatch.swForms;

import my_stopwatch.enums.SWStatus;
import my_stopwatch.exceptions.*;

import java.util.LinkedList;
import java.util.List;

public abstract class AbstractStopwatch {

    long sTime = -1L,                           //开始时间
             pSTime = 0L,                       //暂停开始时间
             timeVal = 0L;                      //秒表维护的计时结果
    SWStatus currentStatus = SWStatus.stopped;  //计时器当前状态

    List<Long> pauseTimes = new LinkedList<>(); //秒表存储的所有暂停时间段

    /**
     * 读秒表
     * @param eTime 结束时间
     * @return 返回秒表当前时间
     */
    public long Time(long eTime){
        //计时结果 = 结束时间-开始时间-暂停时间
        timeVal = eTime-sTime;
        for(long i : pauseTimes){
            timeVal -= i;
        }

        return  timeVal;
    }

    /**
     * 读秒表字符串版
     * @param eTime 读秒表时时间
     * @param a 单位
     * @return 返回秒表当前时间的字符串版本
     */
    public String Time(long eTime ,String a){
        //通过普通读秒表方法计算计时结果再加上单位
        return ((Time(eTime))+a);
    }

    /**
     * 开始计时
     * 当前状态为停止时，开始计时；当前状态为暂停时，强制开始新一轮计时。
     * @throws SWAlreadyRunningException 状态已为运行异常
     */
    public abstract void startSW() throws SWAlreadyRunningException;

    /**
     * 停止计时
     * 当前状态为运行时，停止计时；当前状态为暂停时，强制停止计时。
     * @throws SWAlreadyStoppedException 当前状态已经为停止异常
     */
    public abstract void stopSW() throws SWAlreadyStoppedException;


    /**
     * 继续计时
     * 当前状态为暂停，继续计时
     * @throws SWAlreadyRunningException 当前状态为运行，未暂停，异常
     * @throws SWAlreadyStoppedException 当前状态为停止，未开始计时，异常
     */
    public abstract void continueSW() throws SWAlreadyRunningException,SWAlreadyStoppedException;

    /**
     * 暂停计时
     * 当前状态为运行，继续计时
     * @throws SWAlreadyPausedException 当前状态为暂停，异常
     * @throws SWAlreadyStoppedException 当前状态为停止，未开始计时，异常
     */
    public abstract void pauseSW() throws SWAlreadyPausedException,SWAlreadyStoppedException;
}
