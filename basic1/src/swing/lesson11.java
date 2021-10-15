package swing;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
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

        // membership radiobuttons
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

        // group buttons
        ButtonGroup btnGroup = new ButtonGroup();
        btnGroup.add(click1);
        btnGroup.add(click2);

        // biaya
        JLabel biaya = new JLabel("Biaya per Hari");
        biaya.setBounds(20,225,150,30);
        frame.add(biaya);
        JTextField txtBiaya = new JTextField();
        txtBiaya.setBounds(150, 225, 150, 30);
        frame.add(txtBiaya);

        // combobox option
        JLabel tglPinjam = new JLabel("Tanggal Pinjam");
        tglPinjam.setBounds(20, 270,150,30);
        frame.add(tglPinjam);

        // ComboBox tgl
        String hari[] = new String[31];
        for (int i = 0; i < hari.length; i++) {
            hari[i] = Integer.toString(i+1);
        }
        JComboBox cbHari = new JComboBox(hari);
        cbHari.setBounds(150,270,50,30);
        frame.add(cbHari);

        // ComboBox Bulan
        String bulan[] = {"jan","feb","Mar","Apr","Mei","Jun","Jul","Ags","Sep","Okt","Nov","Des"};
        JComboBox cbBulan = new JComboBox(bulan);
        cbBulan.setBounds(215,270,50,30);
        frame.add(cbBulan);

        JTextField txtTahun = new JTextField();
        txtTahun.setBounds(280, 270, 50, 30);
        frame.add(txtTahun);

        frame.setSize(400,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}


