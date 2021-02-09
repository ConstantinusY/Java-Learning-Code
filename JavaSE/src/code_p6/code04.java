package code_p6;

public class code04 {
    private static void changeValTo100(int a){
        a = 100;
    }
    public static void main(String[] args) {
        int x = 10;
        System.out.println(x);
        changeValTo100(x);
        System.out.println(x);
    }
}
