package oop.encapsulation;

public class Main {
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.setName("ahmad");
        System.out.println(obj.getName());
    }
}
