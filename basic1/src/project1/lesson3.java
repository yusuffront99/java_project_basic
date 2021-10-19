package project1;

import javax.swing.*;

public class lesson3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextArea area = new JTextArea("Hello Developer");
        area.setBounds(20,20,120,50);
        frame.add(area);

        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
