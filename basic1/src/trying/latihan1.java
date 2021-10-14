package trying;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class latihan1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Frame One");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel emptyLabel = new JLabel("Hello world");
        frame.getContentPane().add(emptyLabel);

        frame.setSize(300,200);
        frame.setVisible(true);
    }
}
