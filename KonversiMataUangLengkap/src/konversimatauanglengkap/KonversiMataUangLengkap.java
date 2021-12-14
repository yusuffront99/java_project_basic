/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konversimatauanglengkap;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author myusu
 */
public class KonversiMataUangLengkap extends javax.swing.JFrame {

    /**
     * Creates new form KonversiMataUangLengkap
     */
    public KonversiMataUangLengkap() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cbb1 = new javax.swing.JComboBox<>();
        txtFirst = new javax.swing.JTextField();
        cbb2 = new javax.swing.JComboBox<>();
        txtSecond = new javax.swing.JTextField();
        konversi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        cbb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- MATA UANG ---", "RP", "USD", "JPY", "EUR" }));

        cbb2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- MATA UANG ---", "RP", "USD", "JPY", "EUR" }));

        konversi.setText("K O N V E R S I");
        konversi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                konversiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(konversi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbb1, 0, 208, Short.MAX_VALUE)
                            .addComponent(txtFirst))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbb2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSecond, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(cbb1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(cbb2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSecond, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(konversi, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void konversiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_konversiActionPerformed
        // TODO add your handling code here:
       DecimalFormat fm = new DecimalFormat("#.####");
        
       String[] Opt = {"RP","USD","JPY","EUR"};
       
       //----------- RUPIAH -----------
       if(cbb1.getSelectedItem().equals(Opt[0]) && cbb2.getSelectedItem().equals(Opt[0])){
           String RpToRp = String.valueOf(txtFirst.getText());
           txtSecond.setText(RpToRp);
       }else if(cbb1.getSelectedItem().equals(Opt[0]) && cbb2.getSelectedItem().equals(Opt[1])){
           Double Rp  = Double.parseDouble(txtFirst.getText()) / 14355;
           String RpToUsd = String.valueOf(fm.format(Rp));
           txtSecond.setText(RpToUsd);
       }else if(cbb1.getSelectedItem().equals(Opt[0]) && cbb2.getSelectedItem().equals(Opt[2])){
           Double jpy  = Double.parseDouble(txtFirst.getText()) / 126.60;
           String RpToJpy = String.valueOf(fm.format(jpy));
           txtSecond.setText(RpToJpy);
       }else if(cbb1.getSelectedItem().equals(Opt[0]) && cbb2.getSelectedItem().equals(Opt[3])){
           Double eur  = Double.parseDouble(txtFirst.getText()) / 16245.55;
           String RpToEur = String.valueOf(fm.format(eur));
           txtSecond.setText(RpToEur);
       }
       
       //----------- DOLLARS -----------
       else if(cbb1.getSelectedItem().equals(Opt[1]) && cbb2.getSelectedItem().equals(Opt[0])){
           Double usd  = Double.parseDouble(txtFirst.getText()) * 14355;
           String usdTorp = String.valueOf(fm.format(usd));
           txtSecond.setText(usdTorp);
       }else if(cbb1.getSelectedItem().equals(Opt[1]) && cbb2.getSelectedItem().equals(Opt[1])){
           String usdTousd = String.valueOf(txtFirst.getText());
           txtSecond.setText(usdTousd);
       }else if(cbb1.getSelectedItem().equals(Opt[1]) && cbb2.getSelectedItem().equals(Opt[2])){
           Double usd  = Double.parseDouble(txtFirst.getText()) * 126.60;
           String usdTojpy = String.valueOf(fm.format(usd));
           txtSecond.setText(usdTojpy);
       }else if(cbb1.getSelectedItem().equals(Opt[1]) && cbb2.getSelectedItem().equals(Opt[3])){
           Double usd  = Double.parseDouble(txtFirst.getText()) * 0.89;
           String usdToeur = String.valueOf(fm.format(usd));
           txtSecond.setText(usdToeur);
       }
       
       //----------- DOLLARS -----------
       else if(cbb1.getSelectedItem().equals(Opt[1]) && cbb2.getSelectedItem().equals(Opt[0])){
           Double usd  = Double.parseDouble(txtFirst.getText()) * 14355;
           String usdTorp = String.valueOf(fm.format(usd));
           txtSecond.setText(usdTorp);
       }else if(cbb1.getSelectedItem().equals(Opt[1]) && cbb2.getSelectedItem().equals(Opt[1])){
           String usdTousd = String.valueOf(txtFirst.getText());
           txtSecond.setText(usdTousd);
       }else if(cbb1.getSelectedItem().equals(Opt[1]) && cbb2.getSelectedItem().equals(Opt[2])){
           Double usd  = Double.parseDouble(txtFirst.getText()) * 126.60;
           String usdTojpy = String.valueOf(fm.format(usd));
           txtSecond.setText(usdTojpy);
       }else if(cbb1.getSelectedItem().equals(Opt[1]) && cbb2.getSelectedItem().equals(Opt[3])){
           Double usd  = Double.parseDouble(txtFirst.getText()) * 0.89;
           String usdToeur = String.valueOf(fm.format(usd));
           txtSecond.setText(usdToeur);
       }
       
       //----------- JPY -----------
       else if(cbb1.getSelectedItem().equals(Opt[2]) && cbb2.getSelectedItem().equals(Opt[0])){
           Double jpy  = Double.parseDouble(txtFirst.getText()) * 126.60;
           String jpyTorp = String.valueOf(fm.format(jpy));
           txtSecond.setText(jpyTorp);
       }else if(cbb1.getSelectedItem().equals(Opt[2]) && cbb2.getSelectedItem().equals(Opt[1])){
           Double jpy  = Double.parseDouble(txtFirst.getText()) * 0.0088;
           String jpyTousd = String.valueOf(fm.format(jpy));
           txtSecond.setText(jpyTousd);
       }else if(cbb1.getSelectedItem().equals(Opt[2]) && cbb2.getSelectedItem().equals(Opt[2])){
           String jpyTojpy = String.valueOf(txtFirst.getText());
           txtSecond.setText(jpyTojpy);
       }else if(cbb1.getSelectedItem().equals(Opt[2]) && cbb2.getSelectedItem().equals(Opt[3])){
           Double jpy  = Double.parseDouble(txtFirst.getText()) * 0.0078;
           String jpyToeur = String.valueOf(fm.format(jpy));
           txtSecond.setText(jpyToeur);
       }
       
       //----------- EURO -----------
       else if(cbb1.getSelectedItem().equals(Opt[3]) && cbb2.getSelectedItem().equals(Opt[0])){
           Double eur  = Double.parseDouble(txtFirst.getText()) * 16245.55;
           String eurTorp = String.valueOf(fm.format(eur));
           txtSecond.setText(eurTorp);
       }else if(cbb1.getSelectedItem().equals(Opt[3]) && cbb2.getSelectedItem().equals(Opt[1])){
           Double eur  = Double.parseDouble(txtFirst.getText()) * 1.13;
           String eurTojpy = String.valueOf(fm.format(eur));
           txtSecond.setText(eurTojpy);
       }else if(cbb1.getSelectedItem().equals(Opt[3]) && cbb2.getSelectedItem().equals(Opt[2])){
           Double eur  = Double.parseDouble(txtFirst.getText()) * 126.60;
           String eurTojpy = String.valueOf(fm.format(eur));
           txtSecond.setText(eurTojpy);
       }else if(cbb1.getSelectedItem().equals(Opt[3]) && cbb2.getSelectedItem().equals(Opt[3])){
           String eurToeur = String.valueOf(txtFirst.getText());
           txtSecond.setText(eurToeur);
       }
       
       
       else{
           JOptionPane.showMessageDialog(null, "Silakan Pilih Konversi");
       }

    }//GEN-LAST:event_konversiActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(KonversiMataUangLengkap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KonversiMataUangLengkap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KonversiMataUangLengkap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KonversiMataUangLengkap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KonversiMataUangLengkap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbb1;
    private javax.swing.JComboBox<String> cbb2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton konversi;
    private javax.swing.JTextField txtFirst;
    private javax.swing.JTextField txtSecond;
    // End of variables declaration//GEN-END:variables
}