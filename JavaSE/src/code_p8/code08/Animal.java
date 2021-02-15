package code_p8.code08;

public class Animal {
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Animal(){
        System.out.println("Animal无参构造调用");
    }
    public Animal(String name) {
        System.out.println("Animal有参构造调用");
        this.setName(name);
    }
}
