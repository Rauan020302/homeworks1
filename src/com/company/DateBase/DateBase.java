package com.company.DateBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DateBase {
    private static final String url = "jdbc:postgresql://localhost:5432/postgres";
    private static final String user = "postgres";
    private static final String password = "020302maks";

    public static Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connetion successfully");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return conn;
    }
}
