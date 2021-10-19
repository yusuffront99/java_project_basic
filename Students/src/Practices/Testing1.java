package src.Practices;

import javax.swing.JFrame;

public class Testing1 extends JFrame {

    public Testing1(){
        super("Form - JFrame");
        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Testing1();
    }
}
