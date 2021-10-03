package exercises;
import java.util.ArrayList;

public class exercise18 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(3);
        numbers.add(7);
        numbers.add(2);
        numbers.add(1);

        numbers.forEach((n) -> {System.out.println(n);});
    }
}
