import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class code05 {
    public static void printList_Iterator(List arr){
        Iterator it = arr.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4,5);

        printList_Iterator(list);

    }
}
