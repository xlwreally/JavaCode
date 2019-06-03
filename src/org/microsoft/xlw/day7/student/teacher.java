package org.microsoft.xlw.day7.student;

public class teacher extends code{
    private  String ClassType;
    private  String Teacher;

    public teacher(String name, String sex, String selfIntroduction, int age, String classType, String teacher) {
        super(name, sex, selfIntroduction, age);
        ClassType = classType;
        Teacher = teacher;
    }

    public String getClassType() {
        return ClassType;
    }

    public void setClassType(String classType) {
        ClassType = classType;
    }

    public String getTeacher() {
        return Teacher;
    }

    public void setTeacher(String teacher) {
        Teacher = teacher;
    }
}
