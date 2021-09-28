package packages;
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Masukkan nama : ");
//
//        String username = input.nextLine();
//        System.out.println("Username is = "+username);
//    }
//}

import java.util.Scanner;

public class Main {
    String input;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nama anda : ");
        String username = input.nextLine();
        System.out.println("Nama saya "+username);
    }
}