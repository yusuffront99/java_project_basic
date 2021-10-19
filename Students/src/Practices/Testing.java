package src.Practices;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Testing extends JFrame {
    JFrame frame;
    
    public Testing(){
        JButton btn = new JButton("click");
        btn.setBounds(130,100,100,40);
        add(btn);
        setSize(400,500);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Testing();
    }
}
