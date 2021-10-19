package project1;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class lesson5 {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JCheckBox opt1 = new JCheckBox("Nasi Goreng");
        JCheckBox opt2 = new JCheckBox("Nasi Kuning");

        opt1.setBounds(50,10,100,50);
        opt2.setBounds(50,50,100,50);

        frame.add(opt1);
        frame.add(opt2);

        frame.setSize(300,200);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
