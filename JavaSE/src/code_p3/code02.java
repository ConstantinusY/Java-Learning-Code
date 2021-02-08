package code_p3;

public class code02 {
    public static int func(int a){
        return  a%10*1000 +a/10%10*100 + a/100%10*10 + a/1000%10;
    }
    public static void main(String[] args) {
        System.out.println(func(1234));
    }
}
