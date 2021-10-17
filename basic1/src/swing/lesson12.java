package swing;

import javax.swing.*;

class Data {
    JFrame frame;
    
    public void Show(){
        frame = new JFrame();

        JButton clickButton = new JButton("Click Me");
        clickButton.setBounds(20,50,100,30);
        frame.add(clickButton);

        frame.setSize(400,550);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}

public class lesson12 {

    public static void main(String[] args) {
        Data obj = new Data();
        obj.Show();
    }
}
