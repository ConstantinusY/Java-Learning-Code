package code18;

public class Bird extends Animal {
    private String color;

    public Bird(int age, String color) {
        super(age);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void fly(){
        System.out.println("我在飞");
    }

    @Override
    public void selfIntro(){
        System.out.println("我是一"+color+"色的鸟，今年"+getAge()+"岁");
    }
}
