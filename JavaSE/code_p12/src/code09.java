import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class code09 {
    //分数顺序比较器
    public static class StudentScoreComparator implements Comparator<code08.Student>{
        @Override
        public int compare(code08.Student o1, code08.Student o2) {
            if(o1.getScore()>o2.getScore()){
                return 1;
            }else if(o1.getScore()<o2.getScore()){
                return -1;
            }else {
                return 0;
            }
        }
    }
    public static void main(String[] args) {
        Set<code08.Student> set = new TreeSet<>(new Comparator<code08.Student>(){
            @Override    //分数逆序比较器
            public int compare(code08.Student o1, code08.Student o2){
                if(o1.getScore()>o2.getScore()){
                    return -1;
                }else if(o1.getScore()<o2.getScore()){
                    return 1;
                }else {
                    return 0;
                }
            }
        });
        Set<code08.Student> set2 = new TreeSet<>(new StudentScoreComparator());
        set.add(new code08.Student(1, "A", 23, 90));
        set.add(new code08.Student(2, "B", 23, 98));
        set.add(new code08.Student(3, "C", 22, 87));
        set.add(new code08.Student(1, "A", 23, 90));
        set2.addAll(set);

        System.out.println(set);
        System.out.println(set2);

    }
}
