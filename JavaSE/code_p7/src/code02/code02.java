package code02;

import java.util.Scanner;
public class code02 {
    private static int inputInt(String text){
        System.out.print(text);
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.brand = "A";
        calc.size = 11.4514;
        System.out.println("加法运算：");
        System.out.println("计算结果为"+calc.add(inputInt("输入第一个数"),inputInt("输入第二个数"),inputInt("输入第三个数")));
        System.out.println("减法运算：");
        System.out.println("计算结果为"+calc.sub(inputInt("输入第一个数"),inputInt("输入第二个数"),inputInt("输入第三个数")));
    }
}
