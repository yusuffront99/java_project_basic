package src.Practices;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Testing2 extends JFrame {
    JButton save = new JButton("save");
    JButton reset = new JButton("reset");
    
    public Testing2(){
        super("Test--2");
        setSize(300,300);
        

        JPanel panel = new JPanel();
        panel.setBounds(25, 100, 250, 100);
        panel.add(save);
        panel.add(reset);
        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Testing2();
    }
}
