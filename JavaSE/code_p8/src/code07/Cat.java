package code07;

public class Cat extends Animal{
    private String name = "Cat的name";

    public String getSuperName(){
        return super.getName();
    }

    public String getName() {
        return this.name;
    }

    public void show(){
        String name = "方法的name";
        System.out.println(name);
        System.out.println(getName());
        System.out.println(getSuperName());
    }
}
