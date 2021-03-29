import java.util.ArrayList;
import java.util.Iterator;

public class code02 {
    //for
    public static void printArrayList_for(ArrayList arr){
        for (int i = 0; i < arr.size(); i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
    }
    //foreach
    public static void printArrayList_foreach(ArrayList arr){
        for (Object o:arr) {
            System.out.print(o+" ");
        }
        System.out.println();
    }
    //Iterator
    public static void printArrayList_Iterator(ArrayList arr){
        Iterator it = arr.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        printArrayList_for(list);
        printArrayList_foreach(list);
        printArrayList_Iterator(list);
    }
}
