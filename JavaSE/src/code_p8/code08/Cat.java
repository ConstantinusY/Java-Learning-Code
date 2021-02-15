package code_p8.code08;

public class Cat extends Animal{
    private String breed;

    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public Cat() {
        /*super()*/ //调用super无参构造方法，不过省略
        System.out.println("Cat无参构造函数调用");
    }
    public Cat(String name,String breed) {
        super(name);
        System.out.println("Cat有参构造函数调用");
        this.setBreed(breed);
    }
    public void MwM(){
        System.out.printf("我是%s品种的猫，叫做%s,喵！\n",breed,super.getName());
    }
}
