package code08;

public class code08 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("a="+a);//可以访问a
        {
            System.out.println("a="+a);//可以访问a
            int b = 10;
            System.out.println("b="+b);//可以访问b
        }
        /*System.out.println("b="+b);*/ //不可以访问b
        {
            System.out.println("a="+a);//可以访问a
            /*System.out.println("b="+b);*/ //不可以访问b
            int c = 10;
            System.out.println("c="+c);//可以访问c
        }
        /*System.out.println("c="+c);*/ //不可以访问c
    }
}