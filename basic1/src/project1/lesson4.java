package project1;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class lesson4 {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPasswordField pass = new JPasswordField();
        JLabel label = new JLabel("Password");

        label.setBounds(25,25,100,25);
        pass.setBounds(130,25,100,25);

        frame.add(label);
        frame.add(pass);

        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
