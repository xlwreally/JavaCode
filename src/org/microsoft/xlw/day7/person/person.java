package org.microsoft.xlw.day7.person;

public class person {
    private String name;
    private String sex;
    private int age;
    private String nationality;


    public person(String name, String sex, int age, String nationality) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.nationality = nationality;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }


    public void eat()
    {
        System.out.println("eat");
    }
    public  void  sleep()
    {
        System.out.println("sleep");
    }

    public void work()
    {
        System.out.println("work");
    }
}
