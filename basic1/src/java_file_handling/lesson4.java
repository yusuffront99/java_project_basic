package java_file_handling;
import java.io.File;

public class lesson4 {
    public static void main(String[] args) {
        File obj = new File("D:\\Semester 5\\PBO 2\\practices\\java_project_basic\\basic1\\src\\java_file_handling\\lesson4.java");
        if(obj.exists()){
            System.out.println("Path file : "+obj.getAbsolutePath());
        }else{
            System.err.println("not found");
        }
    }
}
