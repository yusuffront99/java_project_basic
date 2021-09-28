package exercises;
import java.util.HashMap;

public class exercise12 {
    public static void main(String[] args) {
        HashMap<String, Integer> identy = new HashMap<String, Integer>();

        identy.put("ahmad",22);
        identy.put("yusuf",20);

        for(String i : identy.keySet()){
            System.out.println("key "+i+" data "+identy.get(i));
        }
    }
}
