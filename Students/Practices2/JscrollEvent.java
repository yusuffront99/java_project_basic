package Practices2;
import javax.swing.*;
import java.awt.event.*;

public class JscrollEvent {

    JscrollEvent(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel lbl = new JLabel();
        lbl.setHorizontalAlignment(JLabel.CENTER);
        lbl.setSize(300,100);
        
        JScrollBar bar = new JScrollBar();
        bar.setBounds(100,100,50,100);
        frame.add(lbl); frame.add(bar);
        frame.setSize(300,400);
        frame.setLayout(null);
        frame.setVisible(true);

        bar.addAdjustmentListener(new AdjustmentListener(){
            public void adjustmentValueChanged(AdjustmentEvent e){
                lbl.setText("Vertical : "+bar.getValue());
            }
        });

    }

    public static void main(String[] args) {
        new JscrollEvent();
    }
    
}
