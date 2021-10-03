package java_file_handling;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

public class lesson6 {
    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("folder");
            file.write("hello java");
            file.close();
        } catch (IOException e) {
            System.out.println("an error occurred");
        }

        File del = new File("del");
        if(del.delete()){
            System.err.println("file deleted the successfully");
        }else{
            System.out.println("maybe error exist");
        }
    }
}
