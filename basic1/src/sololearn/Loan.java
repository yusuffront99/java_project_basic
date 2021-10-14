package sololearn;
import java.util.Scanner;

public class Loan {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int amount = input.nextInt();
        for(int x = 1; x <= 6; x++){
            amount -= amount*90/100;
        }
        System.out.println(amount);
    }
}
