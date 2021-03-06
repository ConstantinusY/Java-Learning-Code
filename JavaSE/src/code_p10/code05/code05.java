package code_p10.code05;

import java.util.*;

public class code05 {
    public static void main(String[] args) {
        //获取当前时间
        Date now = new Date();

        //输出当前时间
        System.out.println(now.toString());
        System.out.println(now.toLocaleString());
        System.out.println("现在时间:\n"+(now.getYear()+1900)+"年");//年  //比实际结果小1900
        System.out.println((now.getMonth()+1)+"月");//月  //getMonth的结果为0~11
        System.out.println(now.getDate()+"日");//日
        System.out.println("星期"+((now.getDay()==0)?"日":now.getDay()));//星期几  //0~6,0：星期日
        System.out.println(now.getHours()+"时");//时
        System.out.println(now.getMinutes()+"分");//分
        System.out.println(now.getSeconds()+"秒");//秒

        //其他方法
        long lTime = now.getTime();//1970年1月1日00:00:00 GMT以来的毫秒数
        System.out.println("\n"+"lTime= "+lTime);
        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());
        /*
        1970-1-1【new Date(0)】前推到1969-12-1：
        1000【1秒=1000毫秒】*3600【1小时=3600毫妙】*24【1天=24小时】*31【12月有31天】
         */
        System.out.println(new Date(-(1000*3600*24*31L)).toLocaleString());

        /*
        子类:java.sql中的Date，Time，Timestamp
        java.util.Date     >>  yyyyMMdd hh:mm:ss
        java.sql.Date      >>  yyyyMMdd
        java.sql.Time      >>  hh:mm:ss
        java.sql.Timestamp >>  yyyyMMdd hh:mm:ss
         */
        System.out.println(new java.sql.Date(System.currentTimeMillis()));
        System.out.println(new java.sql.Time(System.currentTimeMillis()));
        System.out.println(new java.sql.Timestamp(System.currentTimeMillis()));

    }
}
