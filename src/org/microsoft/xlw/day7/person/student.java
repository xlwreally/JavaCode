package org.microsoft.xlw.day7.person;

public class student extends person{
    private String school;
    private String id;

    public student(String name, String sex, int age, String nationality,  String school, String id) {
        super(name, sex, age, nationality);
        this.school = school;
        this.id = id;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void work() {
        System.out.println("learn");
    }
}
