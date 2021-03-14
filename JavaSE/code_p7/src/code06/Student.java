package code06;

public class Student {
    //成员变量
    final int sno;//学号
    final String name;//姓名
    final String sex;//性别
    double score;//分数
    String cup;
    static String waterMachine = "黑色高级饮水机";


    //构造方法
    public Student(int sno,String name,String sex ){
        this.sno = sno;
        this.name = name;
        this.sex = sex;
    }
    public Student(int sno,String name,String sex ,double score, String cup){
        this(sno,name,sex);
        this.score = score;
        this.cup = cup;
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
        System.out.printf("我是%d号学生%s，%s性，分数是%.0f\n我班饮水机是%s\n",this.sno,this.name,this.sex,this.score,waterMachine);
    }

    public void drink(){
        System.out.printf("我拿着我的%s在我班%s接水\n",cup,waterMachine);
    }
}
