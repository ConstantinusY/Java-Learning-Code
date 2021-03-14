package code15;

import code12.*;

public class code15 {
    public static void main(String[] args) {
        Object obj = new Object();
        ChinesePro chPro = new ChinesePro("张三");
        System.out.println(chPro instanceof Programmer);
        System.out.println(chPro instanceof Object);
        System.out.println(obj instanceof EnglishPro);
        //System.out.println(chPro instanceof String);ClassCastException
    }
}
