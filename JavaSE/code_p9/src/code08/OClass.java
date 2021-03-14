package code08;

public class OClass {
    private static final int a = 10,b = 15;
    private final int c = 30;

    public static class IClass{
        private final int b = 20;
        public static final int d = 40;
        public void IMethod1(){
            System.out.println("————————内部类方法1——————");
            System.out.println("外部类中的a="+a);//可以访问
            //System.out.println("外部类中的c="+c);//不可以访问
        }
        public void IMethod2(){
            System.out.println("外部类中的b="+OClass.b);
            System.out.println("内部类中的b="+b);
        }
    }

    public void OMethod1(){
        System.out.println("————————外部类方法1——————");
        System.out.println("直接访问内部类静态成员d="+IClass.d);

    }

}
