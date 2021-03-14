import java.util.Scanner;
public class code12 {
    private static int input(){
        Scanner sc = new Scanner(System.in);;
        int res = sc.nextInt();
        return res;
    }

    private static void func1(int x){
        for (int i = 0; i < x; i++){
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void func2(){
        for (int i = 1; i <= 9; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(i+"×"+j+"="+i*j+"\t");
            }
            System.out.println();
        }
    }

    private static void func3(int x){
        for (int i = x; i > 0;){
            i--;
            for (int _i = i; _i > 0; _i--){
                System.out.print(" ");
            }
            for (int _i = 0; _i < x; _i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void func4(int x){
        for (int i = 0; i < x;){
            int printNum = i+(++i);
            int spaceNum = x-(printNum)/2;
            for (int _i = 0; _i < spaceNum; _i++){
                System.out.print(" ");
            }
            for (int _i = 0; _i < printNum; _i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void func5(int x, int y){
        for (int i = 0 ; i < (x>y?x-y:y-x)-1; i++){
            for (int _i = 0; _i < x-((x<y?x:y) + i*2)/2; _i++){
                System.out.print(" ");
            }
            for (int _i = 0; _i < (x<y?x:y) + i*2; _i++){
                System.out.print("*");
            }
            System.out.println();

        }
    }

    private static void func6(int x){
        int res = x--;
        System.out.print(res);
        for (int i = x; i > 0; i--){
            System.out.print("×"+i);
            res *= i;
        }
        System.out.println("="+res);
    }

    private static void func7(int x, int y){
        int _x = x;
        for (int i = 0; i < y; i++){
            x *= _x;
        }
        System.out.println(x);
    }

    private static void func8(){
        int p = 1;
        long sum = 1L;
        for (int i = 0; i < 15; i++){
            p *= 2;
            sum += p;
        }
        System.out.println("麦粒共"+String.format("%.3f",sum*0.0001)+"克。");
    }

    private static void func9(int key){
        int pswd = input();
        while (pswd < 100000 || pswd >999999){
            System.out.println("请输入六位数密码");
            pswd=input();
        }
        for (int i = 2; i > 0; i--){
            if (pswd == key){
                System.out.println("欢迎。");
                return;
            }
            else {
                System.out.println("输入错误，请重新输入。还可以尝试"+i+"次。");
                pswd = input();
                while (pswd < 100000 || pswd >999999){
                    System.out.println("请输入六位数密码");
                    pswd=input();
                }
            }
        }
        System.out.println("尝试次数过多，吞卡。");

    }
    public static void main(String[] args) {
//        func1(input());
//        func2();
//        func3(input());
//        func4(input());
//        func5(input(),input());
//        func6(input());
//        func7(input(),input());
//        func8();
//        func9(114514);
    }
}
