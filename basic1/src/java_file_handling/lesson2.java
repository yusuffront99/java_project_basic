package java_file_handling;
import java.io.FileWriter;
import java.io.IOException;

public class lesson2 {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("doc.txt");
            myWriter.write("hello java");
            myWriter.close();
        } catch (IOException e) {
            System.out.println("an error eccurred");
            e.printStackTrace();
        }
    }
}
