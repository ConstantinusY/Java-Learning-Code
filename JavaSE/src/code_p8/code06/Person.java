package code_p8.code06;

public class Person /*extends java.lang.Object*/{
    private String name;
    private String gender;
    private short age;

    public void setName(String name) {
        if(name.length()>10){
            this.name = name.substring(0,10);return;
        }
        this.name = name;
    }
    public void setAge(short age) {
        if (age > 150 || age < 0){
            this.age = 18;return;
        }
        this.age = age;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public short getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }

    public Person(){
        this.name = "unknown";
        this.gender = "女";
        this.age = 18;
    }
    public Person(String name, String gender, short age){
        setName(name);
        setGender(gender);
        setAge(age);
    }

    public void selfIntro(){
        System.out.printf("我是%s，性别%s，现在%d岁。你好。\n",name,gender,age);
    }

    @Override
    public String toString(){
        return String.format("Person[name=%s,gender=%s,age=%d]",name,gender,age);
    }
}
