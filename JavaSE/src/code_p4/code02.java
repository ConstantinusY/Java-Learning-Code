package code_p4;

public class code02 {
    public static void func(int month){
        if(month < 1 || month > 12){
            System.out.println("输入月份有误");
            return;
        }
        if (3 <= month && month <= 5){
            System.out.println("春季，播种");
        }
        else if(6<= month && month <=8){
            System.out.println("夏季，吃烧烤");
        }
        else if(9<=month && month<=11){
            System.out.println("秋季，秋收");
        }
        else {
            System.out.println("冬季，睡觉");
        }
    }

    public static void main(String[] args) {
        func(2);
        func(5);
        func(7);
        func(9);
    }
}
