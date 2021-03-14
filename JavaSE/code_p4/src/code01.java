public class code01 {
    public static void func(int a){
        if(a%3==0 && a%2==0){
            System.out.println("分支1执行！\n输入的数即是2的倍数也是3的倍数");
        }
        else if (a%2==0){
            System.out.println("分支2执行！\n输入的数是2的倍数！");
        }
        else if(a%3==0){
            System.out.println("分支3执行！\n输入的数是3的倍数");
        }
        else{
            System.out.println("分支4执行！\n输入的数即不是2的倍数也不是3的倍数");
        }
    }
    public static void main(String[] args) {
        func(10);
        func(30);
        func(5);
    }
}
