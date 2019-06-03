package org.microsoft.xlw.day7.person;

public class StudentLeader extends student{
    private String position;

    public StudentLeader(String name, String sex, int age, String nationality,  String school, String id, String position) {
        super(name, sex, age, nationality,  school, id);
        this.position = position;
    }

    public void meeting()
    {
        System.out.println("开会了");
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
