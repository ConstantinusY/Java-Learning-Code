public class code08 {
    public static int fibo(int N){
        if (N == 1||N==2){ //递归结束条件
            return 1;
        }else{
            return fibo(N-2)+fibo(N-1);
        }
    }

    public static void main(String[] args) {
        System.out.println("斐波那契数列的第1项="+fibo(1)+"\n斐波那契数列的第5项="+fibo(5));
    }
}
