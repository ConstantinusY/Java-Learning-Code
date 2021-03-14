package code17;

import code12.*;

public class code17 {
    public static void main(String[] args) {
        Programmer pro = ProgrammerSchool.getPro("Chinese","张三");
        pro.writeCode();
        pro.eat();
    }
}
