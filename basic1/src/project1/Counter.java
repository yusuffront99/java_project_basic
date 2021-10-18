package project1;
import javax.swing.*;
import java.awt.event.*;


public class Counter implements ActionListener {

    public Counter(){
        initComponent();
    }

    public void initComponent(){
        JFrame frame = new JFrame("Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton btn1 = new JButton("click");
        btn1.setBounds(50,50,120,30);
        frame.add(btn1);

        btn1.addActionListener(this);
        btn1.setActionCommand("click");


        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if(command.equals("simpan")){
            JOptionPane.showMessageDialog(null, "Hello Developer");
        }

        
    }

    public static void main(String[] args) {
        new Counter();
    }
}
