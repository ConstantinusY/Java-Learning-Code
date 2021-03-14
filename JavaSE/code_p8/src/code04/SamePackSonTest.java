package code04;

public class SamePackSonTest extends Vals{
    public static void main(String[] args) {
        System.out.println("--------同包子类开始访问--------");
//        System.out.println("Vals.privateVal="+Vals.privateVal);
        System.out.println("Vals.defaultVal="+Vals.defaultVal);
        System.out.println("Vals.protectedVal="+Vals.protectedVal);
        System.out.println("Vals.publicVal="+Vals.publicVal);
    }
}
