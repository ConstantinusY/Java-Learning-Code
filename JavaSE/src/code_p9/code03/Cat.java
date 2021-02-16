package code_p9.code03;

public class Cat extends Animal{
    public String color;

    public Cat(String name, String color) {
        super(name);
        this.color = color;
    }

    @Override
    public void walk(){
        System.out.println(color+"小猫在走路.");
    }
}
