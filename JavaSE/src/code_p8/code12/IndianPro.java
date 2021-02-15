package code_p8.code12;

public class IndianPro extends Programmer {
    private String name = "InProName";

    public IndianPro(String name) {
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
        System.out.println("印度程序员" + name + "正在用手捧着恒河水喝");
    }

    public void dance() { //子类特有方法
        System.out.println("印度程序员" + name + "正在尬舞");
    }
}
