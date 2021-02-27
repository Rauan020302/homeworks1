package com.company;


import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        User user = new User();
        System.out.print("Enter username: ");
        user.setUserName(sc.nextLine());
        System.out.println("Enter email");
        user.setEmail(sc.nextLine());
        System.out.print("Enter password: ");
        user.setPassword(sc.nextLine());

        User user1 = new User("Mike","005","005");

        UserName userName = new UserName();
        register(user1, userName);

        //authorise(user.getUserName(),user.getPassword());
        System.out.println(userName.getUserName()); // дальше не смог сделать

        DateBase.getAuthoriseTry();


    }

    public static void register(User user,UserName userName){
        DateBase.insertUser(user);

        userName = new UserName(user.getUserName());
    }

    public static void authorise(String username,String password){
        User user = DateBase.getUserByUserName(username);

        if(user == null){
            System.err.println("Username or password is incorrect");
            return;
        }
        if(user.getPassword().equals(password)){
            DateBase.addUserLog(user,"SUCCESS");
            System.out.println("Logged is successfully");
        }else{
            DateBase.addUserLog(user,"FAIL");
            System.out.println("Username or password is incorrect");

        }


    }


}
