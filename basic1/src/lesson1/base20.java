package lesson1;

public class base20 {
   public static void main(String[] args) {
    int x= 5;
    int i = 0;
    while(i < 10){
        System.out.println(i);
        i++;

        if(i == x){
            continue;
        }
    }
   }
}
