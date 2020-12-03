package com.company;

public class Farm {
    String address;
    Cow[] cows;
    Sheep[] sheeps;
    Horse[] horses;
    String fullName;

    public Farm(){

    }



    public Farm(String address, Cow[] cows,Sheep[] sheeps, Horse[] horses, String fullName) {
        this.address = address;
        this.cows = cows;
        this.sheeps = sheeps;
        this.horses = horses;
        this.fullName = fullName;
    }

    @Override
    public String toString(){

        String result = ("Farm: " + address + ",name: " + fullName);

        for(Cow cow : cows){
            cow.printInfo();
        }
        for(Sheep sheep : sheeps){
            sheep.printInfo();
        }
        for(Horse horse : horses){
            horse.printInfo();
        }
        return result;

    }


    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public void setSheeps(Sheep[] sheeps) {
        this.sheeps = sheeps;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Cow[] getCows() {
        return cows;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public Sheep[] getSheeps() {
        return sheeps;
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
