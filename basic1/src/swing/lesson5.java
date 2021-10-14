package swing;

import java.awt.event.*;
import javax.swing.*;

public class lesson5 {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("hello");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextField var = new JTextField();
        var.setBounds(50,50,150,40);
        JButton btn = new JButton("click");
        btn.setBounds(130,100,100,40);
        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                var.setText("Welcome to java");
            }
        });

        frame.add(btn);
        frame.add(var);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
