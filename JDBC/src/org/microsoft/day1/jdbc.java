package org.microsoft.day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/ATM?useUnicode=true&characterEncoding=UTF-8&useSSL=false","root","12345678");
            Statement ex=con.createStatement();
            for (int i = 0; i <5 ; i++) {
                ex.executeUpdate("INSERT into user (u_name,u_card,u_pwd,u_money) VALUES('auto',"+i+",'34w',"+i+")");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {

        }

    }
}
