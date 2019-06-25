package org.microsoft.xlw.day7.student;

public class student extends code{
    private String ID;
    private String Study;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getStudy() {
        return Study;
    }

    public void setStudy(String study) {
        Study = study;
    }

    public student(String name, String sex, String selfIntroduction, int age, String ID, String study) {
        super(name, sex, selfIntroduction, age);
        this.ID = ID;
        Study = study;
    }
}
