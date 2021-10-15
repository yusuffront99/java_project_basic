package swing;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

// public abstract addActionListener();

interface ActionListener {
    public void hint();

}

public class lesson10 implements ActionListener{
    JTextField inp1, inp2, inp3;
    JButton btn1, btn2;

    public void hint()
    {
        JFrame frame = new JFrame("Form COunt");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        inp1 = new JTextField();
        inp1.setBounds(50,50,150,20);
        inp2 = new JTextField();
        inp2.setBounds(50,50,150,20);
        inp3 = new JTextField();
        inp3.setBounds(50,50,150,20);
        inp3.setEditable(false);

        btn1 = new JButton("+");
        btn1.setBounds(50,200,50,50);
        btn2 = new JButton("-");
        btn2.setBounds(120,200,50,50);

        // btn1.addActionListener(this);
        // btn2.addActionListener(this);

        frame.add(inp1); frame.add(inp2); frame.add(inp3); frame.add(inp3); frame.add(btn1); frame.add(btn2);
        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        String s1 = inp1.getText();
        String s2 = inp2.getText();

        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c=0;

        if(e.getSource()==btn1){
            c = a+b;
        }else if(e.getSource()==btn2){
            c = a-b;
        }

        String result = String.valueOf(c);
        inp3.setText(result);
    }

    public static void main(String[] args) {
        

    }
}



