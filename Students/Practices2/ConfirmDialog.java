package Practices2;
import javax.swing.*;
import java.awt.event.*;

public class ConfirmDialog extends WindowAdapter {
    JFrame frame = new JFrame();

    ConfirmDialog(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addWindowListener(this);
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void windowClosing(WindowEvent e){
        int a = JOptionPane.showConfirmDialog(frame,"Are you okey???");
        if(a == JOptionPane.YES_OPTION){
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }

    public static void main(String[] args) {
        new ConfirmDialog();
    }
}
