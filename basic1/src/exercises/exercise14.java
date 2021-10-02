package exercises;
import java.util.ArrayList;
import java.util.Iterator;

public class exercise14 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("banana");
        fruits.add("mango");
        fruits.add("orange");

        // get the iterator
        Iterator<String> it = fruits.iterator();

        // print item
        System.out.println(it.next());
    }
}
