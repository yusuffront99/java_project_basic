package exercises;

abstract class Main {
    abstract void hello();

    public void say(){
        System.out.println("Hello, i want a developer");
    }
}

class One extends Main {
    public void hello(){
        System.out.println("Hello java");
    }
}

public class exercise1 {
    public static void main(String[] args) {
        Main obj = new One();
        obj.say();
        obj.hello();
    }
}
