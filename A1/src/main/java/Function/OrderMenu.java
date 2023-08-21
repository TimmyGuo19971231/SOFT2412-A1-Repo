package Function;

import org.example.FileProcessor;

import java.util.List;

public class OrderMenu {
    public static final String filepath = "C:\\Users\\Asus\\Desktop\\SOFT2412-A1-Repo\\A1\\Menu.txt";
    public void userInterface(){
        FileProcessor fp = new FileProcessor();
        List<String> menu = fp.readMenuData(filepath);
        for (String data : menu){
            System.out.println(data);
        }
    }
}
