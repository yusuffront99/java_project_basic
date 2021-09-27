package oop.constructor;

public class Main {
    int modelYear;

    public Main(int age){
        modelYear = age;
    }

    public static void main(String[] args) {
        Main obj = new Main(22);
        System.out.println("my age is "+obj.modelYear);
    }
}
