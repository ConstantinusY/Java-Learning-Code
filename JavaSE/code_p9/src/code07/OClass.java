package code07;

public class OClass {
    private final int a = 10, b = 15;

    public class IClass{
        private final int b = 20;
        public void IMethod1(){
            System.out.println("————————内部类方法1——————");
            System.out.println("外部类中的a="+a);
            System.out.println("内部类中的b="+b);
        }
        public void IMethod2(){
            System.out.println("————————内部类方法2——————");
            System.out.println("内部类中的b="+b);
            System.out.println("外部类中的b="+OClass.this.b);
        }
    }

    public void OMethod1(){
        System.out.println("————————外部类方法1——————");
        System.out.println("外部类中的a=" + a);
        System.out.println("内部类中的b=" + new IClass().b);
    }

}
