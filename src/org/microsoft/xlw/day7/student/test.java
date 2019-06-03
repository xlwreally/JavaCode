package org.microsoft.xlw.day7.student;

public class test {
    public static void main(String[] args) {
        student student=new student("xlw","男","喜欢唱跳RAP篮球",18,"03182014","学习一般");
        teacher teacher=new teacher("老蒋","男","不详",99,"化学","很厉害");
        System.out.println(student.getName()+"\t"+student.getSex()+"\t"+student.getAge()+"\t"+student.getID()+"\t"+student.getSelfIntroduction()+"\t"+student.getStudy());
    }
}
