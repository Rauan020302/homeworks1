package com.company;

import java.sql.*;

public class CarDB {
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
    public static Car getCarById(int id){
        String sql = "SELECT * FROM car_info where car_id = ?";
        Car car;
        try (Connection conn = connect();
             PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setInt(1,id);
            try(ResultSet rs = stmt.executeQuery()){

                if(rs.next()){
                    car = new Car();
                    car.setCarId(rs.getInt("car_id"));
                    car.setManufactureYear(rs.getInt("manufacture_year"));
                    car.setModel(rs.getString("model"));
                    car.setPrice(rs.getInt("price"));
                    car.setColor(rs.getString("color"));
                    return car;
                }

            }

        }catch (SQLException ex ){
            System.out.println(ex.getMessage());
        }return null;
    }
}
