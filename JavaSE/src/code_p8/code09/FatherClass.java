package code_p8.code09;

public class FatherClass {
     int a = 10; //成员变量
    public  void a(){ //成员方法
        System.out.println("调用了父类的成员方法");
    }
    public FatherClass(){ //构造方法
        System.out.println("调用了父类构造方法");
    }
}
