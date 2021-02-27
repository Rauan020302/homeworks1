package com.company;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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
    public static boolean insertUser(User user) {
        String sql = "insert into users(user_name,email,password,date_of_registration)" +
                "values(?,?,?,now())";
        int result = 0;
        try (Connection conn = connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, user.getUserName());
            stmt.setString(2, user.getEmail());
            stmt.setString(3, user.getPassword());

            result = stmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return result > 0;
    }

    public static User getUserByUserName(String username) {
        String sql = "Select * from users " +
                "Where user_name = ?";
        User user = null;
        try (Connection conn = connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, username);

            try (ResultSet rs = stmt.executeQuery()) {

                if (rs.next()) {
                    user = new User();
                    user.setId(rs.getInt("user_id"));
                    user.setUserName(username);
                    user.setEmail(rs.getString("email"));
                    user.setPassword(rs.getString("password"));
                    user.setDateOfRegistration(rs.getDate("date_of_registration"));
                }

            }
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return user;

    }

    public static boolean addUserLog(User user,String loginResult){
        String sql = "insert into userlogs(user_id,login_time,login_result)" +
                "values(?,now(),?)";
        int result = 0;

        try(Connection conn = connect();
            PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setInt(1,user.getId());
            stmt.setString(2,loginResult);

            result = stmt.executeUpdate();
        }
        catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return result > 0;
    }

    public static List<UserLog> getAuthoriseTry(){
        String sql = "select login_result " +
                "from userlogs u ";
        List<UserLog> user = new ArrayList<>();
        try(Connection conn = connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)) {

            while(rs.next()){
                UserLog userLog1 = new UserLog(rs.getString("login_result"));

                user.add(userLog1);
            }

        }
        catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return user ;
    }
}
