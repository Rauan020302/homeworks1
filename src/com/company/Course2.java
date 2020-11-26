package com.company;

public class Course2 {
    String name;
    Group[] Groups;
    String name2;

    public Course2(){

    }
    public Course2(String name,Group[] Groups, String name2){
        this.name = name;
        this.Groups = Groups;
        this.name2 = name2;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName2(String name){
        this.name2 = name2;
    }
    public String getName2(){
        return name2;
    }
    public void setGroups(Group[] Groups){
        this.Groups = Groups;
    }
    public Group[] getGroups(){
        return Groups;
    }

}
