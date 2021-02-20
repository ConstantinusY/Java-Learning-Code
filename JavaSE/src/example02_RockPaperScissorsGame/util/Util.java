package example02_RockPaperScissorsGame.util;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 工具类
 */
public class Util {
    private Util() {
    }//不允许在类外调用

    /**
     * 产生指定范围随机数[0,max]
     *
     * @param max 上限
     * @return 返回随机的整数
     */
    public static int getRandNum(int max) {
        return /*Random(max+1)*/ (int) (Math.random() * (max + 1));
    }

    /**
     * 产生指定范围随机数[min,max]
     *
     * @param min 下限
     * @param max 上限
     * @return 返回随机的整数
     */
    public static int getRandNum(int min, int max) { // [min,max] = [(min-min+min),(max-min+min)] = [0,(max-min)]+min
        return (int) (Math.random() * (max - min + 1));
    }


    /**
     * 输入一个int类型的数
     * @param message 输出信息
     * @return 输入的数
     */
    public static int inputInt(String message){
        System.out.print(message);
        Scanner sc = new Scanner(System.in);
        try {
            return sc.nextInt();
        } catch (InputMismatchException ime) {
            System.err.println("请输入一个0~2的整数");
        }
        return -1;
    }
}
