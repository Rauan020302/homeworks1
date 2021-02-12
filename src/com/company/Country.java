package com.company;

public class Country {
    private int id;
    private String countryName;
    private int countryCode;
    private int population;
    private People president;



    public Country(int id, String name, int countryCode, int population,People president) {
        this.id = id;
        this.countryName = name;
        this.countryCode = countryCode;
        this.population = population;
        this.president = president;

    }

    @Override
    public String toString() {
        return  "\ncountry id = "         + id +
                "\ncountryName = "        + countryName +
                "\ncountryCode = "        + countryCode +
                "\ncountry population = " + population +
                "\npresident: "          + president;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public People getPresident() {
        return president;
    }

    public void setPresident(People president) {
        this.president = president;
    }
}
