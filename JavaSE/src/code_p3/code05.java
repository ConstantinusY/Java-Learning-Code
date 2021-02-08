package code_p3;

public class code05 {
    public static boolean biggerThan(byte a,byte b){
        System.out.println("biggerThan func used!");
        return a > b;
    }
    public static void main(String[] args) {
        byte a = 10, b = 20, c = 20;
        System.out.println(biggerThan(b,a) & b == c);
        System.out.println(biggerThan(a,b) | b == c);
        System.out.println(a == b && biggerThan(b,c));
        System.out.println(b == c || biggerThan(b,c));
        System.out.println();
        System.out.println(a == b ^ b != c);
        System.out.println(a != b ^ b == c);
        System.out.println(a == b ^ b == c);
        System.out.println();
        System.out.println(!(a>b));
    }
}
