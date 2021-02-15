package com.company;

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

        authorise(user.getUserName(),reverseStringWithCharAt(user.getPassword()));

        //register(user);






    }

    public static void register(User user){
        DateBase.insertUser(user);
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

    public static String reverseStringWithCharAt(String inputString) {
        int stringLength = inputString.length();
        String result = "";
        String charIndex = "";
        for (int i = 0; i < stringLength; i++) {
            result = inputString.charAt(i) + result;
            String last = result.substring((result.length() - 1));
            charIndex = result + last;
        }
        return charIndex;

    }
}
