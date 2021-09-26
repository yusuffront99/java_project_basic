package lesson1;

public class base13 {
    public static void main(String[] args) {
        int score = 'C';

        switch (score) {
            case 'A':
                System.out.println("You're score is range 90 - 100 ");
                break;

            case 'B':
                System.out.println("You're score is range 80 - 90");
                break;

            case 'C':
                System.out.println("You're score is range  70 - 80");
                break;
        
            default:
            System.out.println("You're score is range < 70 ");
                break;
        }
    }
}
