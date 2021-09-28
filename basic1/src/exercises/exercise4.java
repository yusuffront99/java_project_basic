package exercises;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class exercise4 {
    public static void main(String[] args) {
        LocalDate obj = LocalDate.now();
        
        DateTimeFormatter format = DateTimeFormatter.ofPattern("E,dd-MM-yyyy");
        String date = obj.format(format);

        System.out.println(date);

    }
}
