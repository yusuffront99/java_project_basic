package exercises;
import java.util.HashSet;

public class exercise13 {
    public static void main(String[] args) {
        
        HashSet<String> cars = new HashSet<String>();
        cars.add("jazz");
        cars.add("mobilio");
        cars.add("avanza");
        // System.out.println(cars.contains("jazz"));
        // System.out.println(cars.remove("avanza"));
        // System.out.println(cars);
        // cars.clear();
        // for(String e : cars){
        //     System.out.println(e);
        // }

        for(int i = 1; i < cars.size(); i++){
            if(cars.contains(i)){
                System.out.println(i+"exist data");
            }else{
                System.out.println("exist not data");
            }
        }
    }
}
