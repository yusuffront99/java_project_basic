package polymorphism;

class fullTime {
    public double value;
    public int days;

    public double total(double nom , int days){
        return value = nom * days;
    }
    public double getTotal() {
        return value;
    }
}

class employ1 extends fullTime {
    @Override

    public double total(double nom , int days){
        return value = nom * days;
    }
    @Override
    public double getTotal() {
        return value;
    }

}

class employ2 extends fullTime {
    @Override
    
    public double total(double nom , int days){
        return value = nom * days;
    }
        
    @Override
        public double getTotal() {
        return value;
    }
}


public class Overriding {
    public static void main(String[] args) {
        fullTime obj = new fullTime();
        obj.total(12500, 23);
        System.out.println("total gaji utama "+obj.getTotal());

        fullTime employ1 = new employ1();
        employ1.total(9500, 20);
        System.out.println("gaji pegawai 1 : "+employ1.getTotal());

        fullTime employ2 = new employ2();
        employ2.total(8525, 17);
        System.out.println("gaji pegawai 2 : "+employ2.getTotal());
    }
}
