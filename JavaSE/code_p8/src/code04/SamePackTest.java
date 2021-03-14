package code04;

public class SamePackTest {
    public static void main(String[] args) {
        System.out.println("--------同包不同类开始访问--------");
        //System.out.println("Vals.privateVal="+Vals.privateVal);
        System.out.println("Vals.defaultVal="+Vals.defaultVal);
        System.out.println("Vals.protectedVal="+Vals.protectedVal);
        System.out.println("Vals.publicVal="+Vals.publicVal);
    }
}
