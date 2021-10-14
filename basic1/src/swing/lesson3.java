package swing;

import javax.swing.*;
import java.awt.event.*;

public class lesson3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextField inp1 = new JTextField();
        JTextField inp2 = new JTextField();
        inp1.setBounds(130,25,120,50);

        JButton btn = new JButton("view");
        btn.setBounds(130,100,100,40);

        // EVENT
        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                inp1.setText("Hello Developer");

            }
        });

        frame.add(btn); 
        frame.add(inp1);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
