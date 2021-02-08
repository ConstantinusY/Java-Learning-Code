package code_p4;

import java.util.Scanner;
public class code07 {
    private static int input(){
        Scanner sc = new Scanner(System.in);;
        int res = sc.nextInt();
        return res;
    }

    private static void func1(int inputV){
        int _inputV = inputV;
        if(inputV == 0){
            System.out.println("输入为0");
            return;
        }
        if(inputV < 0){
            inputV -= inputV<<1;
        }
        int i= 1;
        long res = 0L;
        while(i <= inputV){
            if (i % 2 != 0){
                if(_inputV>0){
                    res += i;
                }
                else if(_inputV<0){
                    res -= i;
                }
            }
            i++;
        }
        System.out.println("1到"+_inputV+"的全部奇数的和是"+(long)res);
    }
    
    private static void func2(int inputV){
        int _inputV = inputV;
        if(inputV == 0){
            System.out.println("输入为0");
            return;
        }
        if(inputV < 0){
            inputV -= inputV<<1;
        }
        System.out.println("从1到"+_inputV+"的全部5的倍数为：");
        int i = 1, j = 1;
        while (i <= inputV){
            if(j>3){
                j = 1;
                System.out.print("\n");
            }
            if (i%5 == 0){
                System.out.print((_inputV<0?"-":"") + i+"\t");
                j++;
            }
            i++;
        }
    }

    private static void func3(int inputV){
        int _inputV = inputV;
        if(inputV == 0){
            System.out.println("输入为0");
            return;
        }
        if(inputV < 0){
            inputV -= inputV<<1;
            System.out.print("-");
        }
        //检测位数
        int a = inputV, b = 1000000000, c = 11;//c就是位数
        while(a == inputV){
            a = inputV % b;
            b /= 10;
            c--;
        }
        int i = 1;
        c--;
        int _c = c;
        while (i <= (int) Math.pow(10,_c)){
            c = _c;
            int temp = inputV;
            temp /= i;
            while(temp>=10){
                int x =  (int)Math.pow(10,c--);
                temp %= x;
            }
            System.out.print(temp);
            i*=10;
        }
    }

    private static void func4(){
        System.out.print("输入英语成绩：");
        int eS = input();
        System.out.print("输入语文成绩：");
        int cS = input();
        System.out.print("输入数学成绩：");
        int mS = input();
        System.out.println("本次考试总分"+(eS+cS+mS)+"分");
        System.out.println("最高分为"+((eS>cS?eS:cS)>mS?(eS>cS?eS:cS):mS)+"分");
        System.out.println("最低分为"+((eS<cS?eS:cS)<mS?(eS<cS?eS:cS):mS)+"分");
        System.out.println("本次考试平均成绩"+(eS+cS+mS)/3+"分");
    }

    private static boolean func5(int inputV){
        if (inputV > 999 || inputV <100){
            return false;
        }

        if ((Math.pow((inputV/100%10),3))+(Math.pow((inputV/10%10),3))+(Math.pow((inputV/1%100%10),3)) == inputV){
            return true;
        }
        return false;
    }

    private static void func6(){
        System.out.println("100~1000的全部水仙花数:");
        int i = 100;
        while(i<=1000){
            if(func5(i)){
                System.out.println(i);
            }
            i++;
        }
    }

    private static boolean func7(int inputV){
        if (inputV < 1){
            return false;
        }
        int i = 2;
        while (i < inputV){
            if (inputV%i == 0){
                return false;
            }
            i++;
        }
        return true;
    }

    private static void func8(int inputV){
        if (inputV < 1){
            System.out.println("输入小于1");
            return;
        }
        System.out.println("1到"+inputV+"的所有质数：");
        int i = 1, j = 1;
        while (i <= inputV){
            if(j>3){
                j = 1;
                System.out.print("\n");
            }
            if (func7(i)){
                System.out.print(i+"\t");
                j++;
            }
            i++;
        }
    }

    public static void main(String[] args) {
      func1(input());
      func2(input());
      func3(input());
      func4();
      System.out.println(func5(input())?"是水仙花数":"不是水仙花数");
      func6();
      System.out.println(func7(input())?"是素数":"不是素数");
      func8(input());
    }
}
