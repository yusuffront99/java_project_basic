package project1;
import javax.swing.*;

public class lesson2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        JButton btn = new JButton("press");
        btn.setBounds(130,70,100,30);
        frame.add(btn);
        
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
