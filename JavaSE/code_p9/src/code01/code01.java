package code01;

public class code01 /*extends Person*/ /*extends TestClassB final修饰不可继承*/ {
    public static final int a = 10;

//    @Override final修饰无法重写
//    void method1(){}
    public static void main(String[] args) {
        System.out.println("a = "+a); //a = 20; 可以访问，不可以修改
        TestClassA tcA = new TestClassA();
        tcA.method1(); //可以调用，不可以重写
        TestClassB tcB = new TestClassB();
        tcB.method2(); //可以调用，不可以继承
    }
}
