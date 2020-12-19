package com.company;

public abstract class AbstractLocality {
    private String Leader;
    private String name;



    public AbstractLocality(String leader, String name) {
        Leader = leader;
        this.name = name;
    }

    public String getLeader() {
        return Leader;
    }

    public void setLeader(String leader) {
        Leader = leader;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void search(String nameLeader){
        if(nameLeader.length() == Leader.length()){
            System.out.println(name);
        }else{
            System.out.println("Error");
        }
    }
}
