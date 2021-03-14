package code01;

public class Person {
    String name;
    int age;

    public void eat(){
        System.out.println(name+"さんはご飯を食べました。");
    }
    public void work(){
        System.out.println(name+"さんは働きました。");
    }
    public void rest(String site){
        System.out.println(name+"さんは"+site+"で休みました。");
    }
}
