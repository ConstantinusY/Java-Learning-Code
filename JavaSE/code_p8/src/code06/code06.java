package code06;

public class code06 {
    public static void main(String[] args) {
        Person[] p = {new Person(),
                      new Person("张三","男",(short)20)};
        for (Person i : p){
            System.out.println("IllegalInputNumException="+i.toString());
            i.selfIntro();
            System.out.println();
        }
        Student[] stu = {new Student(),
                         new Student("李四","男",(short)19),
                         new Student("王五","女",(short)8,"摩尔曼斯克希望小学","1.991")};
        for (Student i : stu){
            System.out.println("IllegalInputNumException="+i.toString());
            i.selfIntro();
            System.out.println();
        }

    }
}
