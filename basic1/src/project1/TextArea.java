package project1;
import javax.swing.*;
import java.awt.event.*;

public class TextArea implements ActionListener {

    // Variables
    JTextArea area;
    JButton btn;
    JFrame frame;
    JLabel lb1, lb2;
    
    public TextArea(){
        AllComponents();
    }

    public void AllComponents(){

        // Attributes
        frame = new JFrame("Words");
        btn = new JButton("Count");
        lb1 = new JLabel();
        lb2 = new JLabel();
        area = new JTextArea("Typing....");

        // Components
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // SET POSITIONS
        lb1.setBounds(25,25,80,30);
        lb2.setBounds(120,25,100,30);
        area.setBounds(20,60,240,90);
        btn.setBounds(100,180,70,30);

        // FRAME IN
        frame.add(lb1);
        frame.add(lb2);
        frame.add(area);
        frame.add(btn);

        // EVent
        btn.addActionListener(this);
        

        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = area.getText();
        String words[] = text.split("\\s");

        lb1.setText("Words : "+words.length);
        lb2.setText("Characters : "+text.length());
    }
    
    public static void main(String[] args) {
        new TextArea();
    }
}
