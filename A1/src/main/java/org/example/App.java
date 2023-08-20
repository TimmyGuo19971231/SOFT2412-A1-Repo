package org.example;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {
    public static final String filepath = "C:\\Users\\Asus\\Desktop\\SOFT2412-A1-Repo\\A1\\User.txt";
    public static void main(String[] args) {
        askAccount();
    }

    public static void adminDashboard(){

    }

    public static boolean writeData(String username,String password){
        try{
            Writer writer = new FileWriter(filepath);
            writer.write(username + "," + password + ",U");
            writer.close();
            return true;
        }catch (Exception e){
            System.err.println("Exception: " + e);
            return false;
        }
    }

    public static void askAccount(){
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        String password = scanner.nextLine();
        List<List<String>> data = readData(filepath);
        for (List<String> userData : data){
            if (userData.get(0).equalsIgnoreCase(userName) && userData.get(1).equals(password)){
                adminDashboard();
                return;
            }
        }
        writeData(userName,password);
        userBoard();
    }

    public static void userBoard(){

    }

    public static List<List<String>> readData(String filepath){
        try{
            Reader reader = new FileReader(filepath);
            Scanner sc = new Scanner(reader);
            List<List<String>> data = new ArrayList<>();
            while (sc.hasNextLine()){
                String userData = sc.nextLine();
                String[] splitData = userData.split(",");
                data.add(Arrays.asList(splitData));
            }
            reader.close();
            return data;
        }catch (Exception e){
            System.err.println("Exception: " + e);
        }
        return null;
    }
}