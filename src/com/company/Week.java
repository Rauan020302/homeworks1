package com.company;

import java.util.Objects;

public class Week {
    private String Monday;
    private String Tuesday;
    private String Wednesday;
    private String Thursday;
    private String Friday;
    private String Saturday;
    private String Sunday;

    public Week(){

    }


    public Week(String monday, String tuesday, String wednesday, String thursday, String friday, String saturday, String sunday) {
        Monday = monday;
        Tuesday = tuesday;
        Wednesday = wednesday;
        Thursday = thursday;
        Friday = friday;
        Saturday = saturday;
        Sunday = sunday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Week week = (Week) o;
        return Objects.equals(Monday, week.Monday) &&
                Objects.equals(Tuesday, week.Tuesday) &&
                Objects.equals(Wednesday, week.Wednesday) &&
                Objects.equals(Thursday, week.Thursday) &&
                Objects.equals(Friday, week.Friday) &&
                Objects.equals(Saturday, week.Saturday) &&
                Objects.equals(Sunday, week.Sunday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday);
    }

    public String getMonday() {
        return Monday;
    }

    public void setMonday(String monday) {
        Monday = monday;
    }

    public String getTuesday() {
        return Tuesday;
    }

    public void setTuesday(String tuesday) {
        Tuesday = tuesday;
    }

    public String getWednesday() {
        return Wednesday;
    }

    public void setWednesday(String wednesday) {
        Wednesday = wednesday;
    }

    public String getThursday() {
        return Thursday;
    }

    public void setThursday(String thursday) {
        Thursday = thursday;
    }

    public String getFriday() {
        return Friday;
    }

    public void setFriday(String friday) {
        Friday = friday;
    }

    public String getSaturday() {
        return Saturday;
    }

    public void setSaturday(String saturday) {
        Saturday = saturday;
    }

    public String getSunday() {
        return Sunday;
    }

    public void setSunday(String sunday) {
        Sunday = sunday;
    }
}
