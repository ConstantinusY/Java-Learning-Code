package code_p8.code04.dif_pack_son_test;

import code_p8.code04.Vals;

public class DifPackSonTest extends Vals {
    public static void main(String[] args) {
        System.out.println("--------不同包子类开始访问--------");
        //System.out.println("Vals.privateVal="+Vals.privateVal);
        //System.out.println("Vals.defaultVal="+Vals.defaultVal);
        System.out.println("Vals.protectedVal="+Vals.protectedVal);
        System.out.println("Vals.publicVal="+Vals.publicVal);
    }
}
