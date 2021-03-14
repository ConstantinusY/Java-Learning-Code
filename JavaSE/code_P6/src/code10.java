import java.util.Scanner;

public class code10 {
    static final double PI = 3.1415926;
    static Scanner sc = new Scanner(System.in);

    private static double get2decimal(double num){
        return ((int)((num*100)+0.5))/100.0;
    }

    private static double getC(int r){ //圆形周长
        return get2decimal(PI*2*r);
    }
    private static double getS(int r){ //圆形面积
        return get2decimal(PI*Math.pow(r,2));
    }
    private static double getC(int w, int h){ //矩形周长
        return get2decimal( 2*(w+h));
    }
    private static double getS(int w, int h){ //矩形面积
        return get2decimal(w*h);
    }
    private static boolean isT(int... arr){ //判断是不是三角形
        boolean res = arr[0] + arr[1] > arr[2];
        return res;
    }
    private static double getC(int a, int b, int c){ //三角形周长
        if (isT(a,b,c)){
            return get2decimal(a+b+c);
        }
        else {
            return -1;
        }
    }
    private static double getS(int a, int b, int c){ //三角形面积
        if (isT(a,b,c)){
            int p = (a+b+c)/2;
            return get2decimal(Math.sqrt(((p-a)*(p-b)*(p-c))));
        }
        else {
            return -1;
        }
    }

    private static int inputInt(String text){
        System.out.print(text);
        return sc.nextInt();
    }
    public static void main(String[] args) {
        System.out.println("圆的周长为："+(getC(inputInt("求圆的周长。输入圆半径："))));
        System.out.println("圆的面积为："+(getS(inputInt("求圆的面积。输入圆半径："))));
        System.out.println("矩形的周长为："+(getC(inputInt("求矩形的周长。输入宽："),inputInt("输入高："))));
        System.out.println("矩形的面积为："+(getS(inputInt("求矩形的面积。输入宽："),inputInt("输入高："))));
        System.out.println("三角形的周长为："+(getC(inputInt("求三角形的周长。输入第一条边："),inputInt("输入第二条边："),inputInt("输入第三条边："))));
        System.out.println("三角形的面积为："+(getS(inputInt("求三角形的面积。输入第一条边："),inputInt("输入第二条边："),inputInt("输入第三条边："))));
        sc.close();
    }
}
