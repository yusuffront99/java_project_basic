package src.Practices;

import java.awt.GridLayout;
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Kalkulator extends JFrame {
    // Atts
    JFrame frame;
    JTextField input;
    JPanel panel1, panel2;
    JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnDot, btnCe;

    // method
    public Kalkulator(){
        frame = new JFrame("Kalkulator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        input = new JTextField();
        panel1 = new JPanel();
        

        // Components
        btn1 = new JButton("1"); btn4 = new JButton("4"); btn7 = new JButton("7");
        btn2 = new JButton("2"); btn5 = new JButton("5"); btn8 = new JButton("8");
        btn3 = new JButton("3"); btn6 = new JButton("6"); btn9 = new JButton("9");
        btn0 = new JButton("0"); btnDot = new JButton("."); btnCe = new JButton("CE");

        // Field
        panel2.add(input, BorderLayout.NORTH);
        frame.add(panel1, BorderLayout.EAST);
        

        // // Sets Bounds
        // frame.add(btn1);  frame.add(btn4);  frame.add(btn7);
        // frame.add(btn2);  frame.add(btn5);  frame.add(btn8);
        // frame.add(btn3);  frame.add(btn6);  frame.add(btn9);
        // frame.add(btn0);  frame.add(btnDot);  frame.add(btnCe);
        // frame.add(panel2);

        // Add
        frame.setLayout(new GridLayout(3,3,20,25));

        frame.setSize(350,400);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new Kalkulator();
    }
}
