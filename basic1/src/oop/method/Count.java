package oop.method;

public class Count {
    
    // method
    public int add(int x, int y){
        return x + y;
    }

    static void say(){
        System.out.println("hello hello");
    }

    public static void main(String[] args) {
        say();
        Count obj = new Count();

        int z = obj.add(5, 6);
        System.out.println("hasilnya adalah = "+z);
    }

}
