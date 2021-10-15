package swing;

 import javax.swing.JFrame;
 import javax.swing.JLabel;
 import javax.swing.JTextField;

public class lesson11 {
    public static void main(String[] args) {
        // container
        JFrame frame = new JFrame("Aplikasi Perpusatakaan");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // ========= COMPONENTS ==========
        JLabel lbl = new JLabel("APLIKASI PERPUSTAKAAN");
        lbl.setBounds(110,30,180,30);
        frame.add(lbl);

        JLabel labelKbuku = new JLabel("Kode Buku");
        labelKbuku.setBounds(20,80,150,30);
        frame.add(labelKbuku);

        JTextField txtKBuku = new JTextField();
        txtKBuku.setBounds(150, 80, 150, 30);
        frame.add(txtKBuku);

        frame.setSize(400,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}


