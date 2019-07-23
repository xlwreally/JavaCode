package org.microsoft.xlw.vo;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private String ID;
    private String RegistTime;
    private String Birthday;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getRegistTime() {
        return RegistTime;
    }

    public void setRegidtTime(String registTime) {
        RegistTime = registTime;
    }

    public String getBirthday() {
        return Birthday;
    }

    public void setBirthday(String birthday) {
        Birthday = birthday;
    }
}
