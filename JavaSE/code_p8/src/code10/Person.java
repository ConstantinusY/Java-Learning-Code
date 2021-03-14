package code10;

public class Person /*extends java.lang.Object*/{
    private final String name;
    private final String gender;
    private final short age;

    public Person(String name, String gender, short age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void selfIntro(){
        System.out.printf("我是%s，性别%s，现在%d岁。你好。\n",name,gender,age);
    }

    @Override
    public boolean equals(Object obj){
        if (obj != null){
            if(this == obj){
                return true;
            }
            Person p = (Person)obj;
            return this.name.equals(p.name) || this.gender.equals(p.gender) || this.age == p.age;
        }
        return false;
    }

}
