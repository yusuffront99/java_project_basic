package lesson2;

public class begin6 {
    static void checkAge(int age)
    {
        if(age < 18){
            System.out.println("you are not old enough : "+age);
        }else{
            System.out.println("youre old enough");
        }
    }

    public static void main(String[] args) {
        checkAge(19);
    }
}
