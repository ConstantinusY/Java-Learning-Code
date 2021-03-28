public class code05 {
    public static int fac(int n){
        int res = 1;
        for (int i = n; i > 0; i--){
            res *= i;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println("5! = "+fac(5));
    }
}
