package code06;

public class Student extends Person{
    private String schoolName;
    private String classNum;

    private void setDefaultStuInfo() {
        this.schoolName = "uknSchool";
        this.classNum = "uknClass";
    }
    public Student(){
        super();
        setDefaultStuInfo();
    }
    public Student(String name,String gender,short age){
        super(name,gender,age);
        setDefaultStuInfo();
    }
    public Student(String name,String gender,short age,String schoolName,String classNum){
        this(name,gender,age);
        this.schoolName=schoolName;
        this.classNum=classNum;
    }
    @Override
    public void selfIntro(){
        System.out.printf("我是%s，性别%s，现在%d岁。在%s%s班学习。你好。\n",getName(),getGender(),getAge(),schoolName,classNum);
    }
    @Override
    public String toString(){
        return String.format("Student[name=%s,gender=%s,age=%d,schoolName=%s,classNum=%s]",getName(),getGender(),getAge(),schoolName,classNum);
    }
}
