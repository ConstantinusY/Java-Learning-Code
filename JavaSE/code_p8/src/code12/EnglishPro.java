package code12;

public class EnglishPro extends Programmer {
    private String name = "EnProName";

    public EnglishPro(String name) {
        super(name);
        this.name = name;
    }

    //writeCode方法从父类继承了
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void eat() { //重写父类吃饭方法
        System.out.println("英国程序员" + name + "正在用刀叉吃炸鱼配炸薯条");
    }

    public void playHorseRace() { //子类特有方法
        System.out.println("英国程序员" + name + "正在赛马");
    }
}
