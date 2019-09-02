package org.microsoft.xlw.day8.afternoon;

public abstract  class  person {
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void say()
    {
        System.out.println("姓名"+this.getName());
    }
    public abstract void per();
}
