import java.util.ArrayList;

public class code03 {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList</*Integer*/>();
        intList.add(1);
        intList.add(3);
        intList.add(1,2);
        //intList.add(new String("哦我的上帝这不就没法添加了"));
        code02.printArrayList_for(intList);
        code02.printArrayList_foreach(intList);
        code02.printArrayList_Iterator(intList);
    }
}
