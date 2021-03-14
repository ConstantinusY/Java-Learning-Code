public class code01 {
    public static void main(String[] args) {
        //赋值运算符
        int a = 10;
        System.out.println(a);
        System.out.println("\n");

        //算术运算符
        System.out.println(a+1);
        System.out.println(a-1);
        System.out.println(a*2);
        System.out.println(a/2);
        System.out.println(a%2);
        System.out.println("\n");

        //拓展算术运算符
        System.out.println(a);
        System.out.println("\n");

        a+=1;
        System.out.println(a);
        a-=1;
        System.out.println(a);
        a/=2;
        System.out.println(a);
        a*=2;
        System.out.println(a);
        a%=3;
        System.out.println(a);
        a++;
        System.out.println(a);
        a--;
        System.out.println(a);
        System.out.println("\n");

        //++|--
        int i = 10;
        int x = i++;
        System.out.println(i);
        System.out.println(x);
        i=10;
        x = ++i;
        System.out.println(i);
        System.out.println(x);
    }
}
