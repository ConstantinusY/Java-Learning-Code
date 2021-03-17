package my_stopwatch.test;

import my_stopwatch.exceptions.*;
import my_stopwatch.swForms.*;

public class Test {
    private static void doSomething() {
        long temp = 0L;
        for (int i = 0; i < 100000; i++) {
            temp += (Math.sin(Math.cbrt(Math.sqrt(i) + Math.cbrt(i))));
        }
    }

    public static void main(String[] args) {
        AbstractStopwatch SW1 = new Stopwatch(),
                SW2 = new MiliStopwatch(),
                SW3 = new NanoStopwatch();

        try{
            SW3.pauseSW();
        }catch (SWAlreadyStoppedException e) {
            System.err.println(e.getMessage());
            System.err.println("异常发出者获取的最后时间：" + e.currentTime);
        }

        try {
            SW3.startSW();
            SW2.startSW();
            SW1.startSW();
            SW3.startSW();
        } catch (SWAlreadyRunningException e) {
            System.err.println(e.getMessage());
            System.err.println("异常发出者获取的最后时间：" + e.currentTime);
        }

        try {
            System.out.println("暂停计时！当前：" +
                    SW1.pauseSW() + "秒 ≈ " +
                    SW2.pauseSW() + "毫秒 ≈ " +
                    SW3.pauseSW() + "纳秒。");
            SW3.pauseSW();
        } catch (SWAlreadyPausedException e) {
            System.err.println(e.getMessage());
            System.err.println("异常发出者获取的最后时间：" + e.currentTime);
        } catch (SWTimeOverflowException SWOFException) {
            System.err.println(SWOFException.getMessage());
            System.err.println("异常发出者获取的最后时间：" + SWOFException.currentTime);
        }


        doSomething();

        System.out.println("继续计时！");
        try {
            SW3.continueSW();
            SW2.continueSW();
            SW1.continueSW();
            SW3.continueSW();
        } catch (SWAlreadyRunningException e) {
            System.err.println(e.getMessage());
            System.err.println("异常发出者获取的最后时间：" + e.currentTime);
        }

        doSomething();

        try {
            System.out.println("结束计时！结果：" +
                    SW1.stopSW() + "秒 ≈ " +
                    SW2.stopSW() + "毫秒 ≈ " +
                    SW3.stopSW() + "纳秒。");
            SW3.stopSW();
        } catch (SWAlreadyStoppedException e) {
            System.err.println(e.getMessage());
            System.err.println("异常发出者获取的最后时间：" + e.currentTime);
        } catch (SWTimeOverflowException SWOFException) {
            System.err.println(SWOFException.getMessage());
            System.err.println("异常发出者获取的最后时间：" + SWOFException.currentTime);
        }
    }
}
