public class code07 {
    public static int fibo(int N){
        if (N == 1||N==2){
            return 1;
        }
        int n__ = 1;
        int n_ = 1;
        int n = 2;
        for (int i = 3; i <= N; i++){
            n = n_+n__;
            n__ = n_;
            n_ = n;
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println("斐波那契数列的第1项="+fibo(1)+"\n斐波那契数列的第5项="+fibo(5));
    }
}
