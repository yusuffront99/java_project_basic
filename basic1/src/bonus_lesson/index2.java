package bonus_lesson;

abstract class Main {
    abstract void add();
}

class Child extends Main{
    public void add(){
        System.err.println("hello java");
    }
}

public class index2 {
    public static void main(String[] args) {
        Main obj = new Child();
        obj.add();
    }
}
