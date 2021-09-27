package lesson1;

public class base19 {
    public static void main(String[] args) {
        int x = 3;
        for(int i = 0; i < 5; i++){
            if(i == x){
                continue;
            }
            System.out.println(i);
        }
    }
}
