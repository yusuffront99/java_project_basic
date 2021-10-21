package src.Practices;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.GridLayout;
import java.awt.BorderLayout;

public class Numbers extends JFrame {
    
    // All Buttons
    JButton b1 = new JButton("1");
    JButton b2 = new JButton("2");
    JButton b3 = new JButton("3");
    JButton b4 = new JButton("4");
    JButton b5 = new JButton("5");
    JButton b6 = new JButton("6");
    JButton b7 = new JButton("7");
    JButton b8 = new JButton("8");
    JButton b9 = new JButton("9");
    JButton b0 = new JButton("0");
    JButton bDot = new JButton(".");
    JButton bCe = new JButton("CE");

    JPanel panel;
    JTextField inp;
    GridLayout family;
    JFrame frame;

    public Numbers(){
        super("Numbers");
        setSize(260,260);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inp = new JTextField();
        frame = new JFrame();
        inp.setLayout(new BorderLayout());
        add(inp, BorderLayout.NORTH);

        panel = new JPanel(); 
        family = new GridLayout(4,2);

        panel.setLayout(family);
        panel.add(b1); panel.add(b4); panel.add(b7);
        panel.add(b2); panel.add(b5); panel.add(b8);
        panel.add(b3); panel.add(b6); panel.add(b9);
        panel.add(b0); panel.add(bDot); panel.add(bCe);

        add(panel);
        setVisible(true);
    }

        public static void main(String[] args) {
            new Numbers();
        }
}
