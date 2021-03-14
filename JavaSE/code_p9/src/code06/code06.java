package code06;

public class code06 implements JDK8Interface {
    @Override
    public void method1() {
        System.out.println("JDK8之前的接口中的方法全部必须是public abstract，必须重写");
    }
    @Override
    public void method3(){
        System.out.println("default的方法可以重写");
    }

    public static void main(String[] args) {
        code06 c = new code06();
        c.method1();c.method3();
        System.out.println(JDK8Interface.CONST_V);
        JDK8Interface.method2();
    }
}
