package exercises;

import java.time.format.DateTimeFormatter;
// import java.time.LocalDate;
import java.time.LocalDateTime;

public class exercise3 {
    public static void main(String[] args) {
        LocalDateTime obj = LocalDateTime.now();
        System.out.println("Date at : "+obj);
        
        DateTimeFormatter convers = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String converts = obj.format(convers);
        System.out.println("convertion time : "+converts);
    }
}
