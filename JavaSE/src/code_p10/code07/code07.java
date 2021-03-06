package code_p10.code07;

import java.util.*;

public class code07 {
    //创建日历
    static Calendar cal = new GregorianCalendar();

    public static void out(){
        //输出日期中各个部分
        System.out.print("现在时间：\n"+cal.get(Calendar.YEAR)+"年");
        System.out.print((cal.get(Calendar.MONTH)+1)+"月");//0~11月
        System.out.println(cal.get(Calendar.DATE)+"日");
        System.out.print(cal.get(Calendar.HOUR)+"时");
        System.out.print(cal.get(Calendar.MINUTE)+"分");
        System.out.print(cal.get(Calendar.SECOND)+"秒 ");
        System.out.println("星期"+((cal.get(Calendar.DAY_OF_WEEK)-1)==0?"日":(cal.get(Calendar.DAY_OF_WEEK)-1)));//1~7,对应周日~周六

    }
    public static void main(String[] args) {
        out();

        //修改日期中各个部分
        cal.set(Calendar.YEAR,2000);
        cal.set(Calendar.MONTH,0);
        cal.set(Calendar.DATE,1);
        out();

        //其他方法
        System.out.println(cal.getActualMaximum(Calendar.DATE));//给出当前日历可取的最大的值
        System.out.println(cal.getActualMinimum(Calendar.DATE));//给出当前日历可取的最小的值

        //输出Calendar对象
        System.out.println(cal);
        //Date--Calendar之间的转换
        Date now = new Date();
        cal.setTime(now);
        Date now2 = cal.getTime();
    }
}
