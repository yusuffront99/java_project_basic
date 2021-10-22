package Practices2;
import javax.swing.*;

public class Jpane {
    JFrame frame = new JFrame();

    Jpane(){
        JOptionPane.showMessageDialog(frame,"Hello Developer");
    }

    public static void main(String[] args) {
        new Jpane();
    }
}
