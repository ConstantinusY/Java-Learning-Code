package code04;

public class Vals {
    private final static int privateVal = 10;
    final static int defaultVal = 20;
    protected final static int protectedVal = 30;
    public final static int publicVal = 40;

    public static void main(String[] args) {
        System.out.println("--------同类开始访问--------");
        System.out.println("Vals.privateVal="+Vals.privateVal);
        System.out.println("Vals.defaultVal="+Vals.defaultVal);
        System.out.println("Vals.protectedVal="+Vals.protectedVal);
        System.out.println("Vals.publicVal="+Vals.publicVal);
    }
}
