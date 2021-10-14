package swing;

import javax.swing.JButton;
import javax.swing.JFrame;

public class lesson2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton btn = new JButton("click");
        btn.setBounds(150,100,100,80);
        frame.add(btn);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);

        

    }
}
