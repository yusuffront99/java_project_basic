package exercises;

public class exercise17 {
        static void checkSim(char sim){
            if(sim != 'A'){
                throw new ArithmeticException("youre sim not match");
            }else{
                System.out.println("you're sim very nice and mathing with youre data input");
            }
        }
    public static void main(String[] args) {
        checkSim('A');
    }
}
