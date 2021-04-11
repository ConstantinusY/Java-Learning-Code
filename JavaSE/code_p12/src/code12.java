import java.util.HashMap;
import java.util.Map;

public class code12 {
    public static void main(String[] args) {
        Map<Integer,code08.Student> map = new HashMap<>();

        code08.Student stu  = new code08.Student(1, "A", 23, 90);
        code08.Student stu2 = new code08.Student(2, "B", 23, 98);
        code08.Student stu3 = new code08.Student(3, "C", 22, 87);
        code08.Student stu4 = new code08.Student(1, "A", 23, 90);
        map.put(stu.getNumber(),stu);
        map.put(stu2.getNumber(),stu2);
        map.put(stu3.getNumber(),stu3);
        map.put(stu4.getNumber(),stu4);

        System.out.println(map.get(2).toString());
    }
}
