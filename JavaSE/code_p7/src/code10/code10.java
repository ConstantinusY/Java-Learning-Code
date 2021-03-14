package code10;

public class code10 {
    static {
        System.out.println("static代码块执行");
    }
    {
        System.out.println("成员代码块执行");
    }
    public code10(){
        System.out.println("构造方法执行");
    }

    public static void main(String[] args) {
        code10 o1 = new code10();
    }
}
