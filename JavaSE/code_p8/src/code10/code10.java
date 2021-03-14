package code10;

public class code10 {
    public static void main(String[] args) {
        Person p1 = new Person("张三","男",(short)18);
        Person p2 = p1;
        Person p3 = new Person("张三","男",(short)18);
        Person p4 = null;
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
        System.out.println(p1 == p3);
        System.out.println(p1.equals(p3));
        System.out.println(p1.equals(p4));
    }
}
