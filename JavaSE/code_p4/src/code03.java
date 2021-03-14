public class code03 {
    public static void func(int month,int year){
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            System.out.println("31天");
        }
        else if(month == 4 || month == 6 || month == 9 || month == 11){
            System.out.println("30天");
        }
        else{
            if (year%4==0){
                System.out.println("29天");
            }
            else{
                System.out.println("28天");
            }
        }
    }

    public static void main(String[] args) {
        func(12,2021);
        func(2,2020);
    }
}
