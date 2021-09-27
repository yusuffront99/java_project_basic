package lesson3;

public class overloading {
    static int add(int x, int y)
    {
        return x + y;
    }

    // static int substract(int x, int y)
    // {
    //     return x - y;
    // }

    static int add(int x, int y, int z){
        return x + y + z;
    }

    static double add(double x, double y){
        return x + y;
    }

    public static void main(String[] args) {
        double whole = add(3.78, 2.99);

        System.out.println( add(5, 3));
        System.out.println(add(4, 1, 8));
        System.out.println(Math.round(whole));
    }
}
