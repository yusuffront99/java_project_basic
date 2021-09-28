package exercises;
import java.util.ArrayList;
import java.util.Collections;

public class exercise10 {
    // set array
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("jazz");
        cars.add("avanza");
        cars.add("mobilio");
        cars.add("fortuner");
        cars.add("terios");

        // collection sort 
        Collections.sort(cars);

        for(String i : cars){
            System.out.println(i);
        }
    }
    
}
