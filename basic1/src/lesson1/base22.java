package lesson1;

public class base22 {
    // public static void main(String[] args) {

    //     String[] books = {"novel","cerpen","dongeng"};
    //     // System.out.println(books[1]);
    //     // System.out.println(books.length);
    //     for(String i : books) {
    //         System.out.println(i);
    //     }
    // }

    // public static void main(String[] args) {
    //     int [][] numbers = {{1,2,3,4,5},{11,12,13,14,15}};
    //     int x = numbers[0][3];
    //     System.out.println(x);
    // }

    public static void main(String[] args) {
        int [][] numbers = {{1,2,3,4,5},{111,222,333,444,555}};

        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers.length; j++){
                System.out.println(numbers[i][j]);
            }
        }
    }
}
