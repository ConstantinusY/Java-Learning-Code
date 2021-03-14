package code02;

public class Animal {
    public final String name;
    public final int age;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void intro(){
        System.out.println("我事叫"+name+"的动物，今年"+age+"岁。");
    }
}
