package java_file_handling;
import java.io.File;

public class lesson5 {
    public static void main(String[] args) {
        File file = new File("data.txt");
        if(file.delete()){
            System.out.println("Deleted the file : "+file.getName());
        }else{
            System.out.println("file not found");
        }
    }
}
