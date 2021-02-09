package code_p6;

public class code01 {
    //主方法是程序的入口，由虚拟机自动执行
    public static void main(String[] args) {
        System.out.println("主方法调用");
        //通过方法名调用方法，同时传参
        System.out.println("主方法得到的结果是"+add(10,20));
    }

    //这不是程序的入口，需要我们手写代码，手动调用
    public static int add(int a, int b){
        System.out.println("add方法调用");
        System.out.println("add方法运算的结果是:"+(a+b));
        return a + b;
    }
}
