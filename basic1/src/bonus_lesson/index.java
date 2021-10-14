package bonus_lesson;
import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        int x, y, result;

        Scanner input = new Scanner(System.in);
        System.out.println("Input value x : ");
        x = input.nextInt();

        System.out.println("Input value y : ");
        y = input.nextInt();

        result = x + y;
        System.err.println(result);
    }

}
