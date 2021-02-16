package code_p9.code06;

public interface JDK8Interface {
    /*public static final*/ int CONST_V = 10;
    /*public abstract*/ void method1();
    //——————↓↓↓JDK8新特性↓↓↓——————
    public static void method2(){
        System.out.println("JDK8允许的非抽象方法第一种：static的");
    }
    public default void method3(){
        System.out.println("JDK8允许的非抽象方法第二种：default的");
    }

}
