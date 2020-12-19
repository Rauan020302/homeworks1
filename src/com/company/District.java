package com.company;

public class District extends AbstractLocality{
    private City[] city;

    public District(String leader, String name, City[] city) {
        super(leader, name);
        this.city = city;
    }
}
