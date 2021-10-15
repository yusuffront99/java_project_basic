package swing;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class lesson8 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel lab1, lab2;

        lab1 = new JLabel("Username");
        lab1.setBounds(50,50,100,30);

        lab2 = new JLabel("age");
        lab2.setBounds(50,100,100,30);

        frame.add(lab1); frame.add(lab2);
        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
