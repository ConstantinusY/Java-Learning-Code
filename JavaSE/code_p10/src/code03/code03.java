package code03;

import java.util.Arrays;

public class code03 {
    public static void main(String[] args) {
        //创建String对象
        String str = "你好世界HelloWorld";
        //String str2 = null;
        //String str3 = "";
        //String str4 = new String("你好世界HelloWorld");

        //操作String对象
        //基本操作
        System.out.println("str="+str);
        System.out.println("str的长度为"+str.length()+"个字符");
        System.out.println("str是否为空："+str.isEmpty());
        System.out.println("str是否以“你好”开始："+str.startsWith("你好"));
        System.out.println("str是否以“World结束："+str.endsWith("World"));
        System.out.println("str全部字母大写："+str.toUpperCase());
        System.out.println("str全部字母小写："+str.toLowerCase());
        System.out.println("str="+str);
        str = str.toUpperCase();
        System.out.println("str="+str);

        //根据索引确定子串
        System.out.println("str第三个字符为："+str.charAt(2));
        System.out.println("str第五个字符到第十个字符为："+str.substring(4,9));//按索引，包括4，不包括10
        System.out.println("str第十个字符往后："+str.substring(9));//按索引，从9开始到末尾

        //按子串确定索引
        System.out.println("str中“世界”的索引为："+str.indexOf("世界"));
        //从第一个字符开始查找，返回第一个匹配的子串的序列
        System.out.println("str中第一个“O”的索引为："+str.indexOf("O"));
        System.out.println("str中最后一个“O”的索引为："+str.lastIndexOf("O"));
        System.out.println("str中从第10个字符开始找的“O”的索引为："+str.indexOf("O",9));
        /*找不到返回-1*/System.out.println(str.indexOf("aweeeeeeeeeeee"));

        //关于String和byte[]
        byte[] bs = str.getBytes();
        System.out.println(bs.length);
        System.out.println(Arrays.toString(bs));
        String str_ = new String(bs,0,6);
        System.out.println(str_);

        //拼接与替换
        str = str.concat("，小程序员儿能有什么坏心眼儿呢");
        str = str.concat("?你说").concat("是不是？         ");
        System.out.println("str="+str);
        str = str.replace("HELLO","こんにちは");
        System.out.println("str="+str);

        //其他
        System.out.println("str中是否包含”世界“："+str.contains("世界"));
        System.out.println(str.trim());
        
        //补充
        String str1 = "hello";
        String str2 = "hello";
        System.out.println(str1 == str2); //!!!true !!!!!!
        System.out.println(str1.equals(str2));//true

        String str3 = new String("hello");
        String str4 = new String("hello");
        System.out.println(str3 == str4); //false
        System.out.println(str3.equals(str4));//true

        String str5 = "";
        String str6 = null;
        System.out.println(str5.isEmpty());//true
        //System.out.println(str6.isEmpty());//NullPointerException

        String str7 = "123";
        str7 = str7.concat("321");//最后追加
        str7 = str7.concat("abc");
        str7 = str7.concat("xyz");
        System.out.println(str7);
    }
}
