import java.util.ArrayList;

public class code01 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add(new Integer(100));//手动装箱
        list.add(200);//自动装箱
        list.add(300);
        list.add(400);
        list.add(500);

        System.out.println(list);//输出集合

        list.add(2,99);//添加到指定位置，底层发生元素后移

        System.out.println(list);//输出集合

        ArrayList list2 = new ArrayList();
        list2.add(114514);
        list2.add(1919810);

        list.addAll(list2);//将另一个集合添加进来
        list.addAll(1,list2);//将另一个集合添加到指定位置

        System.out.println(list.size());//集合元素个数
        System.out.println(list);//输出集合
    }
}
