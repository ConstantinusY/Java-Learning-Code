package code_p8.code13;

import code_p8.code12.*;

public class code13 {
    public static void main(String[] args) {
        //基本数据类型的自动转换
        int i = 10;
        double d = 1.23456789;
        d = i; //正常转换

        //引用数据类型的自动转换
        Programmer pro = new ChinesePro("张三"); //向上转型 右→左
        pro.writeCode();
        pro.eat();
        //pro.playTaichi(); 向上转型后不可以调用子类独有方法。
    }
}

