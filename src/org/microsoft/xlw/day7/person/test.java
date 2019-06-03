package org.microsoft.xlw.day7.person;

public class test {
    public static void main(String[] args) {
        student student=new student("xlwreally","男",18,"中国","西安邮电大学","03182014");
        System.out.println(student.getName()+"\t"+student.getSex()+"\t"+student.getAge()+"\t"+student.getId()+"\t"+student.getNationality());
    }
}
