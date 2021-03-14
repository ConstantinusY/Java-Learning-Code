public class code08 {
    public static double func(double a){
        return (int)(a*100+0.5)/100.0;
    }
    public static void main(String[] args) {
        System.out.println(func(3.145));
        System.out.println(func(3.141));
    }
}
