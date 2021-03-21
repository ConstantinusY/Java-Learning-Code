package my_stopwatch.test;

import my_stopwatch.exceptions.SWException;
import my_stopwatch.swForms.*;

import java.util.concurrent.TimeUnit;

public class TestSW {
    public static void doSomething(){
        try {
            TimeUnit.SECONDS.sleep(2);
        }catch (Exception e){}
    }

    public static void main(String[] args) {
        System.out.println("——————————————创建对象测试————————————\n");
        //NanoStopwatch SW = new NanoStopwatch(); String a = "ns";
        MilliStopwatch SW = new MilliStopwatch(); String a = "ms";
        //Stopwatch SW = new Stopwatch(); String a = "sec";

        System.out.println("————————————正常运行过程测试——————————\n");
        SW.startSW();
        System.out.println("计时开始");
        System.out.println("SW记录的时间："+SW.Time(a+"\n"));

        doSomething();

        SW.pauseSW();
        System.out.println("计时暂停");
        System.out.println("SW记录的时间："+SW.Time(a+"\n"));

        doSomething();

        SW.continueSW();
        System.out.println("计时继续");
        System.out.println("SW记录的时间："+SW.Time(a+"\n"));

        doSomething();

        SW.stopSW();
        System.out.println("计时停止");
        System.out.println("SW记录的时间："+SW.Time(a+"\n"));

        System.out.println("——————————————异常测试——————————————\n");
        try{
            SW.startSW();
            SW.startSW();
        }catch (SWException e){
            System.err.println(e.toString()+"\n");
        }
        try{
            SW.pauseSW();
            SW.pauseSW();
        }catch (SWException e){
            System.err.println(e.toString()+"\n");
        }
        try{
            SW.stopSW();
            SW.stopSW();
        }catch (SWException e){
            System.err.println(e.toString()+"\n");
        }
    }
}
