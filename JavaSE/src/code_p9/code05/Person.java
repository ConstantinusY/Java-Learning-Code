package code_p9.code05;

public class Person implements Compareable{
    public int age;
    public String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Object obj) {
        return this.age-((Person)obj).age;
    }
}
