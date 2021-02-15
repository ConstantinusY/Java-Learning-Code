package code_p9.code02;

public class Person {
    public String name;
    public int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void intro(){
        System.out.println("我叫"+name+"，今年"+age+"岁。");
    }
}
