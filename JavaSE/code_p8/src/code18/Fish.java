package code18;

public class Fish extends Animal{
    private double weight;

    public Fish(int age, double weight) {
        super(age);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight < 0){
            this.weight = 10;
            return;
        }
        this.weight = weight;
    }

    public void swim(){
        System.out.println("我在游泳");
    }

    @Override
    public void selfIntro(){
        System.out.println("我是一"+weight+"千克的鱼，今年"+getAge()+"岁");
    }
}
