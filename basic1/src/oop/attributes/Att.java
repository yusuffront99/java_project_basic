package oop.attributes;

public class Att {
    String name = "yusuf";
    int age = 22;
    double weight = 48.5;

    public static void main(String[] args) {
        Att obj = new Att();
        System.out.println("hello, my name is "+obj.name+" my age is "+obj.age+" i have body weight at round "+obj.weight);
    }
}
