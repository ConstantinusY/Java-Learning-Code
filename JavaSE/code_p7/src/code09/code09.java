package code09;

public class code09 {
    {
        System.out.println("代码块1执行");
    }
    public code09(){
        System.out.println("构造函数执行");
    }
    {
        System.out.println("代码块2执行");
    }
    public static void main(String[] args) {
        code09 o1 = new code09();
        code09 o2 = new code09();
    }
    {
        System.out.println("代码块3执行");
    }
}
