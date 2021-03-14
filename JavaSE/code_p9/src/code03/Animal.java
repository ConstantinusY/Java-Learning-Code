package code03;

public abstract class Animal {
    public String name;
    public Animal(String name){this.name = name;}
    public void intro(){
        System.out.println("我是"+name);
    }
    public abstract void walk();
}
