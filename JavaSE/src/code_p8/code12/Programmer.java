package code_p8.code12;

public class Programmer {
    private String name = "proName";

    public Programmer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void writeCode() { //此类由子类继承
        System.out.println("程序员"+name+"正在写代码。");
    }

    public void eat() {//此类由子类重写
        System.out.println("程序员"+name+"正在吃饭。");
    }
}
