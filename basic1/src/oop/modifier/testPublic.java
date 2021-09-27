package oop.modifier;

public class testPublic {
    int speed;

    public testPublic(int x){
        speed = x;
    }

    public static void main(String[] args) {
        testPublic obj = new testPublic(350);
        System.out.println("speed on drive is "+obj.speed);
    }
}
