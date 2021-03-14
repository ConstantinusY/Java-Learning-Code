package code01;

import java.util.ArrayList;
import java.util.List;

class code01 {
    public static void main(String[] args) {
        //某些方法参数必须是对象
        List list = new ArrayList();
        list.add(new Integer(1));
        list.add(new Double(1.23));
        list.add(5);//隐式转换为Integer
        System.out.println(list);
        //提供更多功能
        System.out.println("int类型占用"+Integer.SIZE+"bit");
        System.out.println("int最大值为"+Integer.MAX_VALUE);
        System.out.println("int最小值为"+Integer.MIN_VALUE);
        System.out.println("114514转换为二进制为0B"+Integer.toBinaryString(114514));
        System.out.println("114514转换为八进制为0"+Integer.toOctalString(114514));
        System.out.println("114514转换为十六进制为0X"+Integer.toHexString(114514));
        System.out.println("0X114514转换为十进制为"+Integer.toString(0X114514));
        //其他重要功能
        String str1 = "10", str2 = "10.23";
        int a = Integer.parseInt(str1);
        double b = Double.parseDouble(str2);
        System.out.println(a);
        System.out.println(b);
    }
}
