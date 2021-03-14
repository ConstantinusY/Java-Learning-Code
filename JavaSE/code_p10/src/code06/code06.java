package code06;

import java.util.*;
import java.text.*;

public class code06 {
    public static void main(String[] args) {
        String str = "2021-03-06 10:59:48";
        String str2 = "";

        //String >> Date
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date date = null;
        try{
            date = sdf.parse(str);
        }catch (ParseException e){
            e.printStackTrace();
        }
        System.out.println(date);

        //Date >> String
        DateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒");
        str2 = sdf2.format(date);
        System.out.println(str2);

    }
}
