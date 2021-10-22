package Practices2;
import javax.swing.*;

public class Jpane1 {
    JFrame frame = new JFrame();
    
    Jpane1(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JOptionPane.showMessageDialog(frame, "Hello Wolrd", "Info", JOptionPane.WARNING_MESSAGE);
    }

    public static void main(String[] args) {
        new Jpane1();
    }
}
