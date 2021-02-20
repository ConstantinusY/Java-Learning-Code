package code_p9.code12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class code12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            //输入总分
            System.out.println("请输入总分");
            int sum = input.nextInt();
            //输入人数
            System.out.println("请输入人数");
            int count = input.nextInt();
            //求平均分并输出
            int result = sum / count;
            System.out.println("result="+result);
        }catch(InputMismatchException e){
            System.err.println("请检查是否输入了非数字内容");
        }catch(ArithmeticException e){
            System.err.println("请检查人数是否为0");
        }catch(Exception e){
            //输出异常的底层信息
            System.err.println("other exception:"+e.toString());
        }
        finally{
            System.out.println("谢谢使用");
        }
        System.out.println("退出系统");
    }
}
