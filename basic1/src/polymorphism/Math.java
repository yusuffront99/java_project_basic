package polymorphism;

class Formula {
    public int total;
    public int add(int a, int b){
        return total =  a + b;
    }

    public int cek(){
        return total;
    }
}

class test1 extends Formula {
    public int add(int a, int b, int c){
        return total = a * b - c;
    }

    public int check(){
        return total;
    }
}

public class Math {
    public static void main(String[] args) {
        Formula val1 = new Formula();
        val1.add(3, 5);
        System.out.println("Hasilnya = "+val1.cek());

        // inhretance
        Formula val2 = new test1();
        val2.add(2,7);
        System.out.println("extend : "+ val2.cek());
    }
}
