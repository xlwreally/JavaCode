package org.microsoft.xlw.data;


import org.microsoft.xlw.vo.Person;

import java.util.regex.Pattern;

public class function {
    public static void sort() {
        Person temp = new Person();
        for (int i = 0; i < DataBase.data.size(); i++) {
            for (int j = 0; j < DataBase.data.size()-i-1; j++) {
                if (Double.parseDouble(DataBase.data.get(j).getID()) > Double.parseDouble(DataBase.data.get(j+1).getID())) {
                    temp = DataBase.data.get(j+1);
                    DataBase.data.set(j+1, DataBase.data.get(j));
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
