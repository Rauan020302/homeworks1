package com.company;

public class Farm {
    String address;
    Cow[] cow;
    Sheep[] sheep;
    Horse[]horse;
    String fullName;

    public Farm(){

    }



    public Farm(String address,int numOfCows,int  numOfSheeps, int numOfHorses, String fullName) {
        this.address = address;
        this.cow = new Cow[numOfCows];
        this.sheep = new Sheep[numOfSheeps];
        this.horse = new Horse[numOfHorses];
        this.fullName = fullName;
    }

    public void printInfo(){

        System.out.println("Farm: ");
        System.out.println("address - " + address);
        for(int i = 0; i < cow.length; i++){
            if(cow[i] != null){
                cow[i].printInfo();
            }
        }
        for(int i = 0; i < horse.length; i++){
            if(horse[i] != null){
                horse[i].printInfo();
            }
        }
        for(int i = 0; i < sheep.length; i++){
            if(sheep[i] != null){
                sheep[i].printInfo();
            }
        }
        System.out.println("fullname - " + fullName);




    }

    public void setCow(Cow[] cow) {
        this.cow = cow;
    }

    public void setSheep(Sheep[] sheep) {
        this.sheep = sheep;
    }

    public void setHorse(Horse[] horse) {
        this.horse = horse;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Cow[] getCow() {
        return cow;
    }

    public boolean addCow(Cow cow){
        for(int i = 0;i < this.cow.length;i++){
            if(this.cow[i] == null){
                this.cow[i] = cow;
                return true;
            }
        }
        return false;
    }

    public boolean deleteCow(int indexOfCow){
        if(indexOfCow >= 0 && indexOfCow < cow.length){
            cow[indexOfCow] = null;
            return true;
        }
        return false;
    }



    public Sheep[] getSheep() {
        return sheep;
    }

    public boolean addSheep(Sheep sheep){
        for(int i = 0;i < this.sheep.length;i++){
            if(this.sheep[i] == null){
                this.sheep[i] = sheep;
                return true;
            }
        }
        return false;
    }

    public boolean deleteSheep(int indexOfSheep){
        if(indexOfSheep >= 0 && indexOfSheep < sheep.length){
            sheep[indexOfSheep] = null;
            return true;
        }
        return false;
    }


    public Horse[] getHorse() {
        return horse;
    }


    public boolean addHorse(Horse horse){
        for(int i = 0;i < this.horse.length;i++){
            if(this.horse[i] == null){
                this.horse[i] = horse;
                return true;
            }
        }
        return false;
    }

    public boolean deleteHorse(int indexOfHorse){
        if(indexOfHorse >= 0 && indexOfHorse < horse.length){
            horse[indexOfHorse] = null;
            return true;
        }
        return false;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
