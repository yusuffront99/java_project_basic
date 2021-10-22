package Practices2;
import javax.swing.*;

public class Jscroll {
    Jscroll(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JScrollBar scr = new JScrollBar();
        scr.setBounds(25,10,50,100);
        frame.add(scr);
        frame.setSize(200,200);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Jscroll();
    }
}
