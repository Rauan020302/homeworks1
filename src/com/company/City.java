package com.company;

public class City {
    private int id;
    private String cityName;
    private Country country;
    private int population;
    private People mayor;

    public City(int id, String cityName) {
        this.id = id;
        this.cityName = cityName;
    }

    public City(int id, String name, Country country, int population, People mayor) {
        this.id = id;
        this.cityName = name;
        this.country = country;
        this.population = population;
        this.mayor = mayor;

    }

    @Override
    public String toString() {
        return  "\ncity id = "         + id +
                "\ncityName = "        + cityName +
                "\ncountry: "         + country +
                "\ncity population = " + population +
                "\nmayor: "           + mayor;
    }

    public int getId() {
            return id;
        }

    public void setId(int id) {
            this.id = id;
        }

    public String getCityName() {
            return cityName;
        }

    public void setCityName(String cityName) {
            this.cityName = cityName;
        }

    public Country getCountry() {
            return country;
        }

    public void setCountry(Country country) {
            this.country = country;
        }

    public int getPopulation() {
            return population;
        }

    public void setPopulation(int population) {
            this.population = population;
        }

    public People getMayor() {
        return mayor;
    }

    public void setMayor(People mayor) {
        this.mayor = mayor;
    }
}
