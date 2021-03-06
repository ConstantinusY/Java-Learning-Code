package code_p10.code04;

public class code04 {
    static StringBuilder sbd = new StringBuilder("我是StringBuilder字符串");
    static StringBuffer sbf = new StringBuffer("我是StringBuffer字符串");

    public static void out(){
        System.out.println("sbd= "+sbd);
        System.out.println("sbf= "+sbf+"\n");
    }

    public static void main(String[] args) {

        

        //末尾追加
        sbd.append(114514);
        sbf.append("。114514");
        out();

        //插入
        sbd.insert(0,"sbd：");
        sbf.insert(0,"sbf：");
        out();

        //放置字符
        sbd.setCharAt(1,'B');
        sbf.setCharAt(2,'F');
        out();

        //替换
        sbd.replace(0,3,"S B D");
        sbf.replace(0,3,"S B F");
        out();

        //删除
        sbd.deleteCharAt(3);
        sbf.delete(10,sbf.length());
        out();
        
        //翻转
        sbd.reverse();
        sbf.reverse();
        out();

        //转换为字符串
        String str = sbd.toString();
        System.out.println(str);
        String str2 = sbf.toString();
        System.out.println(str2);
    }
}
