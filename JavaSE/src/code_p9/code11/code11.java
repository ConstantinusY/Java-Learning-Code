package code_p9.code11;

import java.util.Scanner;

public class code11 {
    public static void main(String[] args) {
        try{
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
        }catch (Exception exception){
            //输出异常底层信息
            exception.printStackTrace();
            System.out.println(exception.toString());
            System.out.println(exception.getMessage());
            //输出自定义提示信息
            System.err.println("人数为0或输入非数字内容");
            //继续向上抛出异常，catch后语句不执行
            //throw exception;
        }
        System.out.println("谢谢使用");
        System.out.println("退出系统");
    }
}
