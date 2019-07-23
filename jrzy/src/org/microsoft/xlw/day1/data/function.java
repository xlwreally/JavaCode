package org.microsoft.xlw.day1.data;

import org.microsoft.xlw.day1.vo.Person;

import java.util.regex.Pattern;

public class function {
    public static void sort() {
        Person temp = new Person();
        for (int i = 0; i < DataBase.data.size(); i++) {
            for (int j = 0; j < DataBase.data.size(); j++) {
                if (Double.parseDouble(DataBase.data.get(i).getID()) > Double.parseDouble(DataBase.data.get(j).getID())) {
                    temp = DataBase.data.get(i);
                    DataBase.data.set(i, DataBase.data.get(j));
                    DataBase.data.set(j, temp);
                }
            }

        }
    }
    public static boolean isInteger(String str) {
        Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
        return pattern.matcher(str).matches();
    }
}
