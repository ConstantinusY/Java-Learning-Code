package code_p7.code05;

public class Student {
    //成员变量
    private final int sno;//学号
    private final String name;//姓名
    private final String sex;//性别
    private double score;//分数
    //构造方法
    public Student(int sno,String name,String sex ){
        this.sno = sno;
        this.name = name;
        this.sex = sex;
    }
    public Student(int sno,String name,String sex ,double score){
        this(sno,name,sex);
        this.score = score;
    }
    //成员方法
    public void study(){
        this.shout();
        System.out.println("在教室努力的学习中，代码量一行行提升了.....");
    }
    public void shout(){
        System.out.println("好好学习，天天向上。");
    }
    public void show(){
        System.out.printf("我是%d号学生%s，%s性，分数是%.0f",this.sno,this.name,this.sex,this.score);
    }
}
