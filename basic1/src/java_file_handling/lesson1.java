package java_file_handling;
import java.io.File;
import java.io.IOException;

public class lesson1 {
    public static void main(String[] args) {
        try {
            File myObj = new File("index.html");
            if(myObj.createNewFile()){
                System.out.println("File created: "+myObj.getName());
            }
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
