package Practices1;
import java.awt.*;
import javax.swing.*;

public class Lesson2 extends JFrame {
    JFrame frame = new JFrame();
    JButton btn1 = new JButton("Hello");
    JButton btn2 = new JButton("Hello");
    JButton btn3 = new JButton("Hello");
    JButton btn4 = new JButton("Hello");
    JButton btn5 = new JButton("Hello");
    JButton btn6 = new JButton("Hello");

    public Lesson2(){
        super("Hello Developer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,400);
        add(btn1); add(btn2); add(btn3);
        add(btn2); add(btn5); add(btn6);

        setLayout(new FlowLayout(FlowLayout.TRAILING));
        setVisible(true);

    }

    public static void main(String[] args) {
        new Lesson2();
    }
}
