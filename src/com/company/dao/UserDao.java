package com.company.dao;

import com.company.model.User;

import java.sql.*;

import static com.company.DateBase.DateBase.connect;


public class UserDao {


    public static User getAllUsers() {
        String sql = "SELECT * FROM userss";

        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            if (rs.next()) {
                User user = new User();
                user.setName(rs.getString("name"));
                user.setPassword(rs.getString("user_password"));
                user.setCreatedDate(rs.getTimestamp("created_date"));
                return user;
            }


        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }return null;
    }

    public static User getUserById(int id){
        String sql = "SELECT * FROM userss where id = ?";

        try(Connection conn = connect();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setInt(1,id);
            try (ResultSet rs = stmt.executeQuery()){
                if (rs.next()){
                    User user = new User();
                    user.setName(rs.getString("name"));
                    user.setPassword(rs.getString("user_password"));
                    user.setCreatedDate(rs.getTimestamp("created_date"));
                    return user;
                }
            }
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }return null;
    }
    public static boolean updateUsers(User user,int id){
        String sql = "UPDATE userss set name = ?, user_password = ?, created_date = ? " +
                   " where id = ?";
        int result = 0;

        try (Connection conn = connect();
             PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1,user.getName());
            stmt.setString(2,user.getPassword());
            stmt.setTimestamp(3,user.getCreatedDate());
            stmt.setInt(4,id);

            result = stmt.executeUpdate();
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return  result > 0;
    }
    public static boolean deleteUsers(User user,int id){
        String sql = "DELETE FROM userss where id = ?";

        int result = 0;
        try(Connection conn = connect();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setInt(1,id);

            result = stmt.executeUpdate();
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return result > 0;
    }
    public static boolean addUsers(User user){
        String sql = "INSERT INTO userss(name,user_password,created_date)" +
                     "VALUES(?,?,now())";
        int result = 0;

        try(Connection conn = connect();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1,user.getName());
            stmt.setString(2, user.getPassword());

            result = stmt.executeUpdate();
        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }return result > 0;
    }
}
