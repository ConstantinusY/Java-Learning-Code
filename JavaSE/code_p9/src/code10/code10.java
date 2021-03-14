package code10;

public class code10 {
    public static void main(String[] args) {
        Person p1 = new Person(18,"张三",67);
        Person p2 = new Person(18,"李四",58);
        System.out.println(
                new Comperator() { //比较年龄
                    @Override
                    public int compare(Object obj1, Object obj2) {
                        return Integer.compare(((Person)obj1).age,((Person)obj2).age);
                    }
                }.compare(p1,p2));

        System.out.println(
                new Comperator() {
                    @Override
                    public int compare(Object obj1, Object obj2) { //比较体重
                        Person p1 = (Person)obj1, p2 = (Person)obj2;
                        return (Integer.compare(p1.weight, p2.weight));
                    }
                }.compare(p1,p2));
    }
}
