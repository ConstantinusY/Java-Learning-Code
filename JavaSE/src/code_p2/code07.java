package code_p2;

public class code07 {
    public static void main(String[] args) {
        //小转大
        byte bVal = 14;
        System.out.println(bVal);
        short sVal = bVal;
        System.out.println(sVal);
        int iVal = sVal;
        System.out.println(iVal);
        long lVal = iVal;
        System.out.println(lVal);
        float fVal = lVal;
        System.out.println(fVal);
        double dVal = fVal;
        System.out.println(dVal);

        long lVal1;
        int iVal1;
        short sVal1;
        byte bVal1;
        //大转小 强制转
        lVal1 = 9223372036854777L;
        System.out.println(lVal1);
        iVal1 = (int)lVal1;
        System.out.println(iVal1);
        sVal1 = (short)iVal1;
        System.out.println(sVal1);
        bVal1 = (byte)sVal1;
        System.out.println(bVal1);
        dVal = 1.123456789876543;
        System.out.println(dVal);
        fVal = (float)dVal;
        System.out.println(fVal);
    }
}
