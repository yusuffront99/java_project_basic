package swing;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class lesson11 {
    public static void main(String[] args) {
        // container
        JFrame frame = new JFrame("Aplikasi Perpusatakaan");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,500);
        frame.setLayout(null);;
        frame.setVisible(true);

        // ========= COMPONENTS ==========
        JLabel lbl = new JLabel("APLIKASI PERPUSTAKAAN");
        lbl.setBounds(110,30,180,30);
        frame.add(lbl);
    }
}
