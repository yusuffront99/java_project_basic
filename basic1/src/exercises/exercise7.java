package exercises;
import java.util.ArrayList;

public class exercise7 {
    // set array
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("jazz");
        cars.add("avanza");
        cars.add("honda");

        System.out.println(cars.set(2, "fortuner"));
        System.out.println(cars);
        System.out.println(cars.remove(0));
        System.out.println(cars);
        System.out.println(cars.size());
    }
    
}
