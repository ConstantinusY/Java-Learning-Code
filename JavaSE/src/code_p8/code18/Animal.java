package code_p8.code18;

public class Animal {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 250){
            this.age = 10;
            return;
        }
        this.age = age;
    }

    public Animal(int age) {
        setAge(age);
    }

    public void selfIntro(){
        System.out.println("我是一动物，今年"+age+"岁");
    }
}
