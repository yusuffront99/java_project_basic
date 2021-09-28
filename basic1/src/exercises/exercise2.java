package exercises;

interface Person{
    public void sound();
}

class check implements Person {
    public void sound(){
        System.out.println("Hello, i like cat");
    }
}

public class exercise2 {
    public static void main(String[] args) {
        check obj = new check();
        obj.sound();
    }
}
