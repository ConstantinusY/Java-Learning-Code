package code11;

import java.util.Scanner;

public class code11_exception {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //输入总分
        System.out.println("请输入总分");
        int sum = input.nextInt();
        //输入人数
        System.out.println("请输入人数");
        int count = input.nextInt();
        //求平均分并输出
        int result = sum / count;
        System.out.println("result="+result);
        System.out.println("谢谢使用");
        System.out.println("退出系统");
    }
}
