import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class code07 {
    public static void printStringSet(Set<String> set,String mode){
        switch (mode){
            case "foreach":{
                for(String s : set){
                    System.out.print(s+"  ");
                }
            }break;

            case "Iterator":{
                Iterator<String> it = set.iterator();
                while (it.hasNext()){
                    System.out.print(it.next()+"  ");
                }
            }break;

        }
        System.out.println();
    }
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("C++");
        set.add("Java");
        set.add("Python");
        set.add("HTML&CSS");
        set.add("PHP");

        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set.contains("C+++++"));
        System.out.println(set);

        printStringSet(set,"foreach");
        printStringSet(set,"Iterator");

    }
}
