package project1;
import javax.swing.*;
import java.awt.event.*;


public class Counter implements ActionListener {

    public Counter(){
        initComponent();
    }

    JTextField tf1, tf2, tf3;
    JButton b1, b2;

    public void initComponent(){
        JFrame frame = new JFrame("Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Attributes
        tf1 = new JTextField();
        tf2 = new JTextField();        
        tf3 = new JTextField();     
        
        b1 = new JButton("+");
        b2 = new JButton("-");

        // Components 

        // ==== TextFields
        tf1.setBounds(25,50,120,25);
        tf2.setBounds(25,100,120,25);
        tf3.setBounds(25,150,120,25);

        // ==== Buttons
        b1.setBounds(25, 200,50,40);
        b2.setBounds(95, 200,50,40);

        // Add TO Form
        frame.add(tf1); frame.add(b1);
        frame.add(tf2); frame.add(b2);
        frame.add(tf3);

        // ActionsListener
        b1.addActionListener(this);
        b2.addActionListener(this);


        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s1 = tf1.getText();
        String s2 = tf2.getText();

        // String TO Integer
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = 0;

        if(e.getSource() == b1){
            c = a + b;
        }else if(e.getSource() == b2){
            c = a - b;
        }

        String result = String.valueOf(c);
        tf3.setText(result);
    }

    public static void main(String[] args) {
        new Counter();
    }
}
