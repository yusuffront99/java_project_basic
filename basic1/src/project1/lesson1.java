package project1;
import javax.swing.*;

public class lesson1 {
    public static void main(String[] args) {
        JFrame templates = new JFrame("Show");
        templates.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton btn = new JButton("click");

        btn.setBounds(130,100,100,40);
        templates.add(btn);
        templates.setSize(400,500);
        templates.setLayout(null);
        templates.setVisible(true);
    }
}
