import java.util.ArrayList;
import java.util.Arrays;

public class code04 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("张三");
        names.add("李四");
        names.add("王五");
        names.add("张三");

        System.out.println(names);

        System.out.println("names中"+(names.contains("赵六")?"":"不")+"包含“赵六”");
        System.out.println("“张三”在names中第一次出现是第"+ (names.indexOf("张三")+1)+"个");
        System.out.println("names"+(names.isEmpty()?"":"不")+"为空");
        System.out.println("“张三”在names中最后一次出现是第"+ (names.lastIndexOf("张三")+1)+"个");

        names.remove(1);
        names.remove("老八");
        System.out.println(names);

        System.out.println(Arrays.toString(names.toArray()));

    }
}
