package project1;

import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.*;


public class Perpustakaan implements ActionListener {

    public static void main(String[] args) {
        new Perpustakaan();
    }

    // constructror
    public Perpustakaan() {
        initComponent();
    }

    private void initComponent() {
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
        txtKBuku.setBounds(150, 80, 180, 30);
        frame.add(txtKBuku);

        // nama buku
        JLabel labelNbuku = new JLabel("Nama Buku");
        labelNbuku.setBounds(20,125,150,30);
        frame.add(labelNbuku);
        JTextField txtNBuku = new JTextField();
        txtNBuku.setBounds(150, 125, 180, 30);
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
        txtBiaya.setBounds(150, 225, 180, 30);
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

        // Label Lama Pinjam
        JLabel lPinjam = new JLabel("Lama Pinjam");
        lPinjam.setBounds(20,325,150,30);
        frame.add(lPinjam);

        String LamaPinjam[] = {"1","2","3","4","5","6","7","8","9","10","11","12"};
        JComboBox cbLamaPinjam = new JComboBox(LamaPinjam);
        cbLamaPinjam.setBounds(150,325,110,30);
        frame.add(cbLamaPinjam);

        // total biaya
        JLabel totalBiaya = new JLabel("Total Biaya");
        totalBiaya.setBounds(20,370,150,30);
        frame.add(totalBiaya);
        JTextField inpTotBiaya = new JTextField();
        inpTotBiaya.setBounds(150, 370, 180, 30);
        frame.add(inpTotBiaya);

        // total biaya
        JLabel jumlahBayar = new JLabel("Jumlah Bayar");
        jumlahBayar.setBounds(20,425,150,30);
        frame.add(jumlahBayar);
        JTextField inpJBayar = new JTextField();
        inpJBayar.setBounds(150, 425, 180, 30);
        frame.add(inpJBayar);

        // total biaya
        JLabel kembalian = new JLabel("Kembalian");
        kembalian.setBounds(20,470,150,30);
        frame.add(kembalian);
        JTextField inpKembalian = new JTextField();
        inpKembalian.setBounds(150, 470, 180, 30);
        frame.add(inpKembalian);

        // button
        JButton simpan = new JButton("Simpan");
        simpan.setBounds(150,515,90,30);
        frame.add(simpan);

        JButton reset = new JButton("Reset");
        reset.setBounds(250,515,80,30);
        frame.add(reset);

        frame.setSize(400,650);
        frame.setLayout(null);
        frame.setVisible(true);
        // ==========END COMPONENTS

        // Event =========================
        simpan.addActionListener(this);
        reset.addActionListener(this);
        simpan.setActionCommand("simpan");
        reset.setActionCommand("reset");

        txtKBuku.addKeyListener(new KeyListener(){

            @Override
            public void keyTyped(KeyEvent e) {
                
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER){
                    String buku[][] = {{"BK001", "Java"}, {"BK002","Python"},{"BK003","Pascal"}};

                    for(int i = 0; i < buku.length; i++){
                        if(txtKBuku.getText().equals(buku[i][0])){
                            txtNBuku.setText(buku[i][1]);
                            break;
                        }
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
                
            }

        });

    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        switch(command){
            case "simpan" : JOptionPane.showConfirmDialog(null, "Data Tersimpan");
            break;

            case "reset" : JOptionPane.showMessageDialog(null, "Data Berhasil direset");
            break;

            default: System.out.println("Tidak ada");
        }
    }
}

