package code_p7.code07;

public class Student {
    private final String name;
    private static String classRoom;

    public Student(String name){
        this.name = name;
    }
    public static void setClassRoom(String classRoom) {
        Student.classRoom = classRoom;
    }
    public static String getClassRoom() {
        return classRoom;
    }

    public void show(){
        System.out.printf("我是%s的%s\n",classRoom,name);
    }
}
