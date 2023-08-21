package org.example;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {
    public static final String filepath = "C:\\Users\\Asus\\Desktop\\SOFT2412-A1-Repo\\A1\\User.txt";
    public static void main(String[] args) {
        if (askAccount().equals("A")){
            adminDashboard();
        }else{
            userBoard();
        }
    }

    public static void adminDashboard(){

    }

    public static String askAccount(){
        FileProcessor fp = new FileProcessor();
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        String password = scanner.nextLine();
        List<List<String>> data = fp.readUserData(filepath);
        for (List<String> userData : data){
            if (userData.get(0).equalsIgnoreCase(userName) && userData.get(1).equals(password)){
                return "A";
            }
        }
        fp.writeData(userName,password,filepath);
        return "U";
    }

    public static void userBoard(){
        // 1.create a user-friendly interface
        // 2.user can read different items, check item's name, description and price
        // 3.check the bill,pick in or delivery
    }
}