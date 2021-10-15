package swing;

 import javax.swing.JFrame;
 import javax.swing.JLabel;
import javax.swing.JRadioButton;
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

        // kode buku
        JLabel labelKbuku = new JLabel("Kode Buku");
        labelKbuku.setBounds(20,80,80,30);
        frame.add(labelKbuku);
        JTextField txtKBuku = new JTextField();
        txtKBuku.setBounds(150, 80, 150, 30);
        frame.add(txtKBuku);

        // nama buku
        JLabel labelNbuku = new JLabel("Nama Buku");
        labelNbuku.setBounds(20,125,150,30);
        frame.add(labelNbuku);
        JTextField txtNBuku = new JTextField();
        txtNBuku.setBounds(150, 125, 150, 30);
        frame.add(txtNBuku);

        // membership
        JLabel labelMember = new JLabel("Membership");
        labelMember.setBounds(20, 170, 150,30);
        frame.add(labelMember);
        JRadioButton click1 = new JRadioButton();
        click1.setText("Eksklusif");
        click1.setBounds(150,170, 80,30);
        frame.add(click1);

        JRadioButton click2 = new JRadioButton();
        click2.setText("Umum");
        click2.setBounds(230,170, 80,30);
        frame.add(click2);

        frame.setSize(400,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}


