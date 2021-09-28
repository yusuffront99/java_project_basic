package exercises;
import java.util.ArrayList;

public class exercise8 {
    // set array
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("jazz");
        cars.add("avanza");
        cars.add("honda");

        for(int i = 0; i < cars.size(); i++){
            System.out.println(cars.get(i));
        }
    }
    
}
