package com.company;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DateBase {
    private static final String url = "jdbc:postgresql://localhost:5432/postgres";
    private static final String user = "postgres";
    private static final String password = "020302maks";
    public static Connection connect (){
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(url,user,password);
            System.out.println("Connetion successfully");
        }
        catch (SQLException ex ){
            System.out.println(ex.getMessage());
        }
        return conn;
    }
    public static int insertPeople(int id, String name, Timestamp birthDay){
        String sql = "INSERT into people(id,full_name,birth_date)" +
                "values(?,?,?)";

        int result = 0;
        try (Connection conn = connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1,id);
            stmt.setString(2,name);
            stmt.setTimestamp(3,birthDay);


            result = stmt.executeUpdate();
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
        return result;
    }
    public static boolean insertCountry(int id,String name,int countryCode,int population,int president){
        String sql = "INSERT into countries(country_id, country_name, code, country_population, president)" +
                     "values(?, ?, ?, ?, ?)";


        int result = 0;
        try(Connection conn = connect();
            PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setInt(1,id);
            stmt.setString(2,name);
            stmt.setInt(3,countryCode);
            stmt.setInt(4,population);
            stmt.setInt(5,president);

            result = stmt.executeUpdate();
        }
        catch (SQLException ex){
            System.out.println(ex.getMessage());
        }

        return result > 0;
    }

    public static boolean insertCity(int id, String name, int countryId,int mayor,int cityPopulation){
        String sql = "insert into cities(city_id,city_name,countries_id,mayor,city_population)" +
                "values(?,?,?,?,?)";
        int result = 0;
        try(Connection conn = connect();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setInt(1,id);
            stmt.setString(2,name);
            stmt.setInt(3,countryId);
            stmt.setInt(4,mayor);
            stmt.setInt(5,cityPopulation);

            result = stmt.executeUpdate();
        }
        catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return result > 0;
    }
    public static List<City> getCity(){
        String sql =  "select * \n" +
                "from cities c \n" +
                "join people p on c.mayor = p.id \n" +
                "join countries c2 on c.countries_id = c2.country_id \n";

        List<City> cities = new ArrayList<>();
        try(Connection conn = connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)) {

            while(rs.next()){
                People people = new People(rs.getInt("id"),rs.getString("full_name"),rs.getTimestamp("birth_date"));
                Country country = new Country(rs.getInt("country_id"),rs.getString("country_name"),rs.getInt("code"),
                        rs.getInt("country_population"),people);
                City city = new City(rs.getInt("city_id"),rs.getString("city_name"),
                        country,rs.getInt("city_population"),people);
                cities.add(city);

            }

        }
        catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
        return cities ;

    }


    //EX A

    public static void insertCities(List<City> cities){
        String sql = "insert into cities(city_id,city_name)" +
                    "values(?,?)";


        try(Connection conn = connect();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            for(City city : cities){
                stmt.setInt(1,city.getId());
                stmt.setString(2,city.getCityName());
                stmt.execute();
            }



        }catch (SQLException ex){
            System.out.println(ex.getMessage());
        }


    }

    public static boolean hasCityById(int id){
        String sql = "select * from cities where city_id = ?";

        try (Connection conn = connect();
            PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setInt(1,id);
            ResultSet rs = stmt.executeQuery();
            int count = 0;
            while(rs.next()){
                count++;
            }
            return count > 0;

        }catch (SQLException ex ){
            System.out.println(ex.getMessage());

        }
        return false;
    }

    public static void insertOrUpdateCities(List<City> cities) {
        String insertSQL = "insert into cities(city_id,city_name)" +
                "values(?,?)";
        String updateSQL = "update cities set city_name = ? where city_id = ?";

        for (City city : cities) {
            boolean isIdFree = hasCityById(city.getId());
            try (Connection conn = connect()) {
                if (isIdFree) {
                    PreparedStatement stmt = conn.prepareStatement(updateSQL);
                    stmt.setString(1, city.getCityName());
                    stmt.setInt(2, city.getId());
                    stmt.execute();
                    stmt.close();
                } else {
                    PreparedStatement stmt = conn.prepareStatement(insertSQL);
                    stmt.setInt(1, city.getId());
                    stmt.setString(2, city.getCityName());
                    stmt.execute();
                    stmt.close();
                }
            }
            catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }

        }


    }
}
