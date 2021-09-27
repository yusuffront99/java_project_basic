package oop.method;

public class Car {
    int speed = 200;
    String color = "red";

    // method 
    public void call(){
        System.out.println("Hello, i have a car with color "+color+" and speed at round "+speed);
    }

    public static void main(String[] args) {
        Car obj = new Car();
        obj.call();
    }
}
