package code_p10.code02;

public class code02 {
    public static void main(String[] args) {
        //自动拆装箱
        Integer in = 5;
        Integer in2 = new Integer(5);
        int num1 = in;
        int num2 = in2.intValue();
        System.out.println("in="+in);
        System.out.println("in1="+in);
        System.out.println("num1="+num1);
        System.out.println("num2="+num2);
        //==   equals
        Integer in3 = new Integer(56);
        Integer in4 = new Integer(56);
        System.out.println(in3==in4); //false
        System.out.println(in3.equals(in4));//true

        Integer in5 = 25;
        Integer in6 = 25;
        System.out.println(in5 ==in6);//true
        System.out.println(in5.equals(in6));//true

        Integer in7 = 256;
        Integer in8 = 256;
        System.out.println(in7 ==in8);//false
        System.out.println(in7.equals(in8));//true
    }
}
