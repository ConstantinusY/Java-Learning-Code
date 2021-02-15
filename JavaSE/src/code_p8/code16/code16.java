package code_p8.code16;

import code_p8.code12.*;

public class code16 {
    public static void main(String[] args) {
        Programmer pro = new Programmer("小A");
        ChinesePro chPro = new ChinesePro("张三");
        Programmer pro1 = new ChinesePro("李四");
        System.out.println(pro.getName());
        System.out.println(chPro.getName());
        System.out.println(pro1.getName());
    }
}
