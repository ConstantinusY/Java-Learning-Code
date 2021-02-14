package code_p8.code05.person_pakage;

public class Person {
    private String name;
    private int age;
    public Person(){
        this.name = "无名氏";
        this.age = 18;
    }
    public Person(String name, int age){
        setName(name);
        setAge(age);
    }
    public void setAge(int age) {
        if(age > 150 || age < 0){
            this.age = 18;return;
        }
        this.age = age;
    }
    public void setName(String name) {
        if(name.length()>10){
            this.name = name.substring(0,10);return;
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return String.format("Person[name=%s, age=%d]",name,age);
    }
}
