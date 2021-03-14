package code07;

public class code07 {
    public static void main(String[] args) {
        Student stu = new Student("张三"),stu2 = new Student("李四");
        Student.setClassRoom("一班");
        stu.show();
        stu2.show();
        /*stu不建议*/Student.setClassRoom("二班");
        stu.show();
        stu2.show();
    }
}
