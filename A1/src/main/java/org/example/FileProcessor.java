package org.example;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FileProcessor {
    public boolean writeData(String username,String password,String filepath){
        try{
            Writer writer = new FileWriter(filepath);
            writer.write(username + "," + password + ",U");
            writer.close();
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public List<List<String>> readData(String filepath){
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
