package Practices2;
import javax.swing.*;

public class JmenuItem {
    
    JFrame frame = new JFrame();
    JMenuBar menuBar = new JMenuBar();
    JMenu menu = new JMenu("Menu");

    JmenuItem(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setVisible(true);
        
    }

    public static void main(String[] args) {
        new JmenuItem();
    }
}
