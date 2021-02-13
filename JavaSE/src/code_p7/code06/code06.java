package code_p7.code06;

public class code06 {
    public static void main(String[] args) {
        Student stu = new Student(114,"田所浩二","男",514,"黑色高级杯子");
        stu.study();
        stu.show();
        stu.drink();
        Student stu1 = new Student(1,"张三","男",600,"牙杯");
        stu1.show();
        stu1.drink();
        Student.waterMachine = "美的高级饮水机";
        stu.drink();
        stu1.drink();
    }
}
