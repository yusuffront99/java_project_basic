package polymorphism;


class parent {
    public void say(){
        System.out.println("Hello developer");
    }
}

class Child1 extends parent{
    public void say() {
        System.out.println("I am child one");
    }
}

class Child2 extends parent{
    public void say() {
        System.out.println("I am child two");
    }
}

public class Main {
        
    public static void main(String[] args) {
        parent obj = new parent();
        parent child1 = new Child1();
        parent child2 = new Child2();

        obj.say();
        child1.say();
        child2.say();
    }
}

