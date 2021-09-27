package lesson2;

public class bonus {

    static void sallary(int times){
        if(times < 5){
            System.out.println("you cant promotion");
        }else{
            System.out.println("congrulations!!!");
        }
    }

    public static void main(String[] args) {
        sallary(4);
    }
}
