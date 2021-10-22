package Practices2;
import javax.swing.*;

public class InputDialog {
    JFrame frame = new JFrame();
    
    InputDialog(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String name = JOptionPane.showInputDialog(frame, "Enter name");
        String age = JOptionPane.showInputDialog(frame, "Enter age");
    }

    public static void main(String[] args) {
        new InputDialog();
    }
}
