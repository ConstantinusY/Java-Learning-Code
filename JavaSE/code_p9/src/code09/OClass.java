package code09;

public class OClass {
    int a = 10;
    public void OMethod(){
        System.out.println("——————外部类方法——————");
        /*final*/ int b = 20;
        class IClass{
            public void IMethod(){
                System.out.println("——————内部类方法———————");
                a = 100;
                //b = 200;
                System.out.println(b);
            }
        }
        IClass ic = new IClass();
        ic.IMethod();
    }
}
