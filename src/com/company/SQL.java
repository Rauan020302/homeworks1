package com.company;

import java.sql.*;

public class SQL {
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

    public static void printTrainersSalary() {
        String sql = "select trainer_full_name ,sport_type_salary " +
                "from trainers t\n" +
                "join sport_types st on  st.sport_type_id = t.sport_type_id ";

        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(rs.getString(1) + ": " + rs.getString(2));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void printSportTypeSalary() {
        String sql = "\n" +
                "select sport_type_name, sum(sport_type_salary)\n" +
                "from trainers t \n" +
                "join sport_types st on st.sport_type_id = t.sport_type_id\n" +
                "group by sport_type_name ";

        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(rs.getString(1) + ": " + rs.getString(2));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void printTrainersChar() {
        String sql = "\n" +
                "select trainer_full_name ,sport_type_salary from trainers t\n" +
                "join sport_types st on  st.sport_type_id = t.sport_type_id \n" +
                "where char_length(trainer_full_name) > 3; ";

        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(rs.getString(1) + " молодец: " + rs.getString(2));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void printNumStudent() {
        String sql = "select group_code,count(student_group)\n" +
                "from group1 g \n" +
                "join  student s on g.group_id = s.student_group \n" +
                "group by group_code ,student_group ";
        int count = 0;
        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while(rs.next()){
                System.out.println("В группе " + rs.getString(1) + ": " + rs.getString(2) + " человек");
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }


    }
    public static void listGroup() {
        String sql = "\n" +
                "select group_id ,group_code \n" +
                "from group1 g ";

        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(rs.getString(1) + ": " + rs.getString(2));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }


}
