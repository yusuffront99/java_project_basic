package src.Practices;

import java.awt.GridLayout;
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

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
        input.setBounds(10,20,200,30);
        panel1 = new JPanel();
        panel2 = new JPanel();

        btn1 = new JButton("1"); btn4 = new JButton("4"); btn7 = new JButton("7");
        btn2 = new JButton("2"); btn5 = new JButton("5"); btn8 = new JButton("8");
        btn3 = new JButton("3"); btn6 = new JButton("6"); btn9 = new JButton("9");
        btn0 = new JButton("0"); btnDot = new JButton("."); btnCe = new JButton("CE");
        
        panel1.add(input);

        panel2.add(btn4);
        panel2.add(btn5);
        panel2.add(btn6);

        panel2.add(btn7);
        panel2.add(btn8);
        panel2.add(btn9);

        frame.setLayout(new BorderLayout());
        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.SOUTH);

        frame.setSize(240,300);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Kalkulator();
    }
}
