package oop.encapsulation;

public class Coba {
    
    private int saldo = 10000;

    public void addSaldo(int add){
        this.saldo += add;
    }

    public void subSaldo(int sub){
        this.saldo -= sub;
    }

    public int cekSaldo(){
        return saldo;
    }

    public static void main(String[] args) {
        Coba obj = new Coba();
        obj.addSaldo(25000);
        System.out.println("saldo sekarang = "+obj.cekSaldo());
        obj.subSaldo(3500);
        System.out.println("di ambil "+obj.cekSaldo());
    }
    
}
