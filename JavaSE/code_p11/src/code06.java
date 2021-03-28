public class code06 {
    public static int fac(int n){
        if(n==1){ //递归的结束条件
            return 1;
        }else {
            return n*(fac(n-1));
        }
    }

    public static void main(String[] args) {
        System.out.println("6! ="+fac(6));
    }
}
