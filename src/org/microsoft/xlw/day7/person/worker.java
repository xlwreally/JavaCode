package org.microsoft.xlw.day7.person;

public class worker extends person{
    private String unit;
    private int WorkAge;

    public worker(String name, String sex, int age, String nationality, String unit, int workAge) {
        super(name, sex, age, nationality);
        this.unit = unit;
        WorkAge = workAge;
    }

    @Override
    public void work() {
        System.out.println("programmer");
    }
}
