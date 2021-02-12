package com.company;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //EX B
//        Timestamp timestamp = new Timestamp(20020302);
//        DateBase.insertPeople(1,"Max",timestamp);
//        DateBase.insertPeople(2,"Aliya",timestamp);
//        DateBase.insertPeople(3,"Ademi",timestamp);
//        DateBase.insertPeople(4,"Bayastan",timestamp);
//        DateBase.insertPeople(5,"Meyirbek",timestamp);
//
//        DateBase.insertCountry(1,"Kyrgyzstan",996,7000000,1);
//        DateBase.insertCountry(2,"USA",1,350000000,2);
//        DateBase.insertCountry(3,"Germany",2,70000000,3);
//        DateBase.insertCountry(4,"France",3,2340000,4);
//        DateBase.insertCountry(5,"Singapore",4,72000000,5);
//
//        DateBase.insertCity(1,"Bishkek",1,1,1000000);
//        DateBase.insertCity(2,"Washington",2,2,3000000);
//        DateBase.insertCity(3,"Berlin",3,3,5000000);
//        DateBase.insertCity(4,"Paris",4,4,7000000);
//        DateBase.insertCity(5,"Singapore",5,5,9000000);

//        System.out.println(DateBase.getCity());


        //EX A

//        List<City> cities = new ArrayList<>();
//        cities.add(new City(1,"Pishkek"));
//        cities.add(new City(2,"Osh"));
//        cities.add(new City(3,"Karakol"));
//        cities.add(new City(4,"Batken"));
//        cities.add(new City(5,"Kant"));
//
//        DateBase.insertCities(cities);

        List<City> cities2 = new ArrayList<>();
        cities2.add(new City(1,"Bishkek"));
        cities2.add(new City(6,"Talas"));
        cities2.add(new City(7,"Naryn"));
        cities2.add(new City(3,"Cholpon-Ata"));
        cities2.add(new City(5,"Tokmok"));

        DateBase.insertOrUpdateCities(cities2);











    }
}
