package code14;

import code12.*;

public class code14 {
    public static void main(String[] args) {
        //基本数据类型的强制转换
        int i = 10;
        double d = 1.23456789;
        i = (int)d; // 做手术，丢失数据

        //引用数据类型的强制转换
        Programmer pro = new ChinesePro("张三");
        pro.writeCode();
        pro.eat();
        //pro.playTaichi(); 不可调用
        //不推荐此写法：ChinesePro chPro = (ChinesePro)pro;
        if(pro instanceof ChinesePro){
            ChinesePro chPro = (ChinesePro)pro;
            chPro.playTaichi();
        }else if(pro instanceof EnglishPro){
            EnglishPro enPro = (EnglishPro)pro;
            enPro.playHorseRace();
        }else if(pro instanceof IndianPro){
            IndianPro inPro = (IndianPro)pro;
            inPro.dance();
        }
    }
}
