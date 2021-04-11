import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class code08 {
    public static class Student implements Comparable<Student>{
        private int number;
        private String name;
        private int age;
        private double score;

        public Student(int number, String name, int age, double score) {
            this.number = number;
            this.name = name;
            this.age = age;
            this.score = score;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public double getScore() {
            return score;
        }

        public void setScore(double score) {
            this.score = score;
        }

        @Override
        public int compareTo(Student o) { //返回负数：小于，返回0：等于，返回正数：大于
            return -(this.number - o.number);//通过学号比较
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Student)) return false;

            Student student = (Student) o;

            if (number != student.number) return false;
            if (age != student.age) return false;
            if (Double.compare(student.score, score) != 0) return false;
            return Objects.equals(name, student.name);
        }

        @Override
        public int hashCode() {
            int result;
            long temp;
            result = number;
            result = 31 * result + (name != null ? name.hashCode() : 0);
            result = 31 * result + age;
            temp = Double.doubleToLongBits(score);
            result = 31 * result + (int) (temp ^ (temp >>> 32));
            return result;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "number=" + number +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    ", score=" + score +
                    '}';
        }
    }

    public static void main(String[] args) {
        //创建集合set对象
        Set<Student> set = new LinkedHashSet<>();
        Set<Student> set2 = new TreeSet<>();

        //添加多个学生
        set.add(new Student(1, "A", 23, 90));
        set.add(new Student(2, "B", 23, 98));
        set.add(new Student(3, "C", 22, 87));
        set.add(new Student(1, "A", 23, 90));
        set2.addAll(set);
        //输出学生
        System.out.println(set.size());
        System.out.print("[");
        for(Student stu:set){
            System.out.print(stu.toString()+", ");
        }
        System.out.println(set2);
    }
}
