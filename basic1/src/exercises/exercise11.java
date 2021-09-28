package exercises;
import java.util.Collections;
import java.util.LinkedList;

public class exercise11 {
    public static void main(String[] args) {
        LinkedList<String> books = new LinkedList<String>();

        books.add("java");
        books.add("python");
        books.add("php");

        Collections.sort(books);
        books.addFirst("javascript");
        System.out.println(books);

        for(String e : books){
            System.out.println(e);
        }

    System.out.println( books.removeLast());
        System.out.println(books);
    }
}
