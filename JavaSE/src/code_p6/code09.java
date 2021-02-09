package code_p6;

public class code09 {
    private static void method(){
        System.out.println("method1 invoked!");
    }
    private static void method(int a){
        System.out.println("method2 invoked!");
    }
    private static void method(int a, int b){
        System.out.println("method3 invoked!");
    }
    private static void method(int a, double b){
        System.out.println("method4 invoked!");
    }
    private static void method(double a, int b){
        System.out.println("method5 invoked!");
    }
    public static void main(String[] args) {
        method();
        method(1);
        method(1,2);
        method(1,1.0);
        method(1.0,1);
    }
}
