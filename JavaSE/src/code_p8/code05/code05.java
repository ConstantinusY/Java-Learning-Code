package code_p8.code05;

import code_p8.code05.person_pakage.Person;

public class code05 {
    public static void main(String[] args) {
        Person p = new Person("张三",15);
        System.out.printf("p=%s\n",p.toString());
        Person p1 = new Person("一二三四五六七八九十一二三",999);
        System.out.printf("p1=%s\n",p1.toString());
    }
}
