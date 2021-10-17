package swing;

import javax.swing.*;

class Main {
    public void show(){
        JFrame frame = new JFrame("Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextArea area = new JTextArea("Hello Developer");
        area.setBounds(25,50,100,30);
        frame.add(area);
        frame.setSize(400,550);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}

public class lesson13 {
    public static void main(String[] args) {
        Main obj = new Main();
        obj.show();
    }
}
