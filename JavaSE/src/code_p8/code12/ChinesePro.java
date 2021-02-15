package code_p8.code12;

public class ChinesePro extends Programmer {
    private String name = "ChProName";

    public ChinesePro(String name) {
        super(name);
        this.name = name;
    }

    //writeCode方法从父类继承了
    @Override
    public String getName() { return name; }

    @Override
    public void setName(String name) { this.name = name; }

    @Override
    public void eat() { //重写父类吃饭方法
        System.out.println("中国程序员" + name + "正在用筷子吃米饭");
    }

    public void playTaichi() { //子类特有方法
        System.out.println("中国程序员" + name + "正在打太极拳");
    }
}
