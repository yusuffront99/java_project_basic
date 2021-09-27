package oop.method;

public class MethCom {
    // static method
    static void sayOne()
    {
        System.out.println("Hello Java");
    }

    // non-static method
    public void sayFirst()
    {
        System.out.println("Hello Developer");
    }

    public static void main(String[] args) {
        sayOne();

        MethCom method = new MethCom();
        method.sayFirst();
    }
}
