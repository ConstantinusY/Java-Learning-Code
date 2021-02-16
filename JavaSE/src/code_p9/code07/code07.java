package code_p9.code07;

import code_p9.code07.OClass.IClass;

public class code07 {
    public static void main(String[] args) {
        OClass oc = new OClass();
        oc.OMethod1();
        /*OClass.IClass*/IClass ic = new OClass().new IClass();
        ic.IMethod1();
        ic.IMethod2();
    }
}
