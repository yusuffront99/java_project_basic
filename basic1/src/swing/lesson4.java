package swing;
import javax.swing.*;

public class lesson4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("hello");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton btn = new JButton("click");
        btn.setBounds(120,100,100,50);
        frame.add(btn);
        frame.setSize(400,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
