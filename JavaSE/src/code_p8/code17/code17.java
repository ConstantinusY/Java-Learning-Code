package code_p8.code17;

import code_p8.code12.*;

public class code17 {
    public static void main(String[] args) {
        Programmer pro = ProgrammerSchool.getPro("Chinese","张三");
        pro.writeCode();
        pro.eat();
    }
}
