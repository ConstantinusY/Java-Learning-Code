package code18;

public class code18 {
    public static void main(String[] args) {
        Animal ani = new Animal(1);
        ani.selfIntro();

        Animal bird = new Bird(2,"蓝");
        bird.selfIntro();
        ((Bird)bird).fly();

        Animal fish = new Fish((int)11.4514,19.19810);
        fish.selfIntro();
        ((Fish)fish).swim();
    }
}
