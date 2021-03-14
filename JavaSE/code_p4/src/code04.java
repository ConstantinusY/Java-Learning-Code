import java.util.Scanner;
public class code04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请录入一个整数： ");
        int inputVal = sc.nextInt();
        System.out.println("您输入的是："+inputVal);
        sc.close();
    }
}
