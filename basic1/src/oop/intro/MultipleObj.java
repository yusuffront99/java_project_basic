package oop.intro;

public class MultipleObj {
    String name = "yusuf";

    public static void main(String[] args) {
        MultipleObj obj1 = new MultipleObj();
        MultipleObj obj2 = new MultipleObj();

        System.out.println(obj1.name);
        System.out.println(obj2.name);
        
    }
}