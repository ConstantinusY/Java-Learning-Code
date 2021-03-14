package code09;

public class code09 extends FatherClass{
    public code09(){
        super();
        System.out.println(super.a);
        super.a();
    }
    public static void main(String[] args) {
        code09 c = new code09();
    }
}
