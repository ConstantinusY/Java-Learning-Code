package code02;

public class code02 {
    public static void main(String[] args) {
        //final修饰引用数据类型，引用数据类型指向的地址不可变，但是对象的属性可变
        final Person p = new Person("张三",18);
        p.intro();
        //p = new Person("小A",1);
        p.name = "李四";
        p.intro();

        //final修饰类中的值，指向的地址可变，对象属性不可变。
        Animal a = new Animal("田所浩二",(int)11.4514);
        a.intro();
        a = new Animal("田所",(int)19.1919810);
        //a.name = "哼↑啊——";
        a.intro();
    }
}
