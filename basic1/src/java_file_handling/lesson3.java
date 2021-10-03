package java_file_handling;
import java.io.FileWriter;
import java.io.IOException;


public class lesson3 {
    public static void main(String[] args) {
        try{
            FileWriter inp = new FileWriter("D:\\Semester 5\\PBO 2\\practices\\java_project_basic\\basic1\\src\\java_file_handling\\lesson5.java");
            inp.write("hello world");
            inp.close();
        }catch( IOException e){
            System.err.println("error");
            e.printStackTrace();
        }
    }
}
