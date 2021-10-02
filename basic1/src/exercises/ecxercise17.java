package exercises;

public class ecxercise17 {
    public static void main(String[] args) {
        try {
            int[] myNum = {1,2,3,4,5};
            System.out.println(myNum[8]);
        } catch (Exception e) {
            System.out.println("something went error");
        } finally {
            System.out.println("yeah finally");
        }

        // int [] myNums = {0,9,8,7,6};
        // System.out.println(myNums[9]);
    }
}
