package code05;

public class code05 {
    public static void comparePersons(Person p1, Person p2){
        if (p1.compareTo(p2) == 0){
            System.out.println(p1.name+"和"+p2.name+"年龄一样大");
        }else if(p1.compareTo(p2)<0){
            System.out.println(p1.name+"比"+p2.name+"年龄小");
        }else {
            System.out.println(p1.name+"比"+p2.name+"年龄大");
        }
    }
    public static void main(String[] args) {
        Person p1 = new Person(15,"张三");
        Person p2 = new Person(15,"李四");
        Person p3 = new Person(16,"王五");
        Person p4 = new Person(14,"赵六");
        comparePersons(p1,p2);
        comparePersons(p1,p3);
        comparePersons(p1,p4);
    }
}
