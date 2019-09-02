package org.microsoft.xlw.day7.student;

public class code {
    private String Name;
    private String Sex;
    private String SelfIntroduction;
    private int age;

    public String getName() {
        return Name;
    }

    public code(String name, String sex, String selfIntroduction, int age) {
        Name = name;
        Sex = sex;
        SelfIntroduction = selfIntroduction;
        this.age = age;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public String getSelfIntroduction() {
        return SelfIntroduction;
    }

    public void setSelfIntroduction(String selfIntroduction) {
        SelfIntroduction = selfIntroduction;
    }

    public int getAge() {
        return age;
    }

    public boolean setAge(int age) {
        if(age<=99&&age>=16)
        this.age = age;
        else return false;
        return true;
    }
}
