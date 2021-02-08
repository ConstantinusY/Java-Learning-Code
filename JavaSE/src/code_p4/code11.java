package code_p4;

import java.util.Scanner;
public class code11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        do{
            System.out.print(num%10);
            num /= 10;
        }while (num!=0);
    }
}
