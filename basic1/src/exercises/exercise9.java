package exercises;
import java.util.ArrayList;

public class exercise9 {
    // set array
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("jazz");
        cars.add("avanza");
        cars.add("honda");

        for(String i : cars){
            System.out.println(i);
        }
    }
    
}
