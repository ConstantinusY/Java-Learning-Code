package code_p10.code08;

/*
 * 可视化日历
 * Calendar
 * 可以判断这个月一共多少天
 * 判断某一天是星期几
 * 1.实现思路
 *     按照提示输入任何一个日期
 *  2.打印日历
 *     打印日历头：日  一  二  三  四  五  六
 *     打印1日之前的空格（循环）
 *     打印每一天（循环），周六换行
 */

import java.util.*;
import java.text.*;

public class code08 {
    public static void main(String[] args) {
        //1. 按照提示从键盘输入日期字符串
        System.out.println("请输入日期(按照格式：2030-3-10)：");
        Scanner scanner = new Scanner(System.in);
        String temp = scanner.nextLine();
        //2.将字符串转换成日期
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = format.parse(temp);
            //3.将日期转换成日历
            Calendar calendar = new GregorianCalendar();
            calendar.setTime(date);
            //4.把日期中的Date（23）取出来
            int  day = calendar.get(Calendar.DATE);
            //5.日历变成了当月的1日
            calendar.set(Calendar.DATE, 1);
            //6.打印日历头信息
            System.out.println("日\t一\t二\t三\t四\t五\t六");
            //7.打印1日之前的空格（关键是知道1日时星期几）
            for(int i=1;i<calendar.get(Calendar.DAY_OF_WEEK);i++){
                System.out.print('\t');
            }
            //8.打印日历1-31/28/30
            int maxDate =
                    calendar.getActualMaximum(Calendar.DATE);//获取当月的最大天数
            for(int i=1;i<=maxDate;i++){
                //8.1如果是当天，打印*
                if(i==day){
                    System.out.print("*");
                }
                //8.2打印该天
                System.out.print(i+"\t");
                //8.3如果是周六，换行
                int  w = calendar.get(Calendar.DAY_OF_WEEK);
                if(w==Calendar.SATURDAY){
                    System.out.print('\n');
                }
                //8.4日历改为下一天
                calendar.add(Calendar.DATE, 1);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}