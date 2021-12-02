/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layouts;

import java.awt.CardLayout;

/**
 *
 * @author myusu
 */
public class ApkPenampilGambarCombobox extends javax.swing.JFrame {

    /**
     * Creates new form ApkPenampilGambarCombobox
     */
    public ApkPenampilGambarCombobox() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbbGambar = new javax.swing.JComboBox<>();
        panelGambar = new javax.swing.JPanel();
        profil = new javax.swing.JLabel();
        Cover1 = new javax.swing.JLabel();
        Cover2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbbGambar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Profil", "Cover1", "Cover2" }));
        cbbGambar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbGambarItemStateChanged(evt);
            }
        });
        cbbGambar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbGambarActionPerformed(evt);
            }
        });

        panelGambar.setLayout(new java.awt.CardLayout());

        profil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profil1.jpg"))); // NOI18N
        panelGambar.add(profil, "0");

        Cover1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cover1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cover1.png"))); // NOI18N
        panelGambar.add(Cover1, "1");

        Cover2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cover2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cover4.png"))); // NOI18N
        panelGambar.add(Cover2, "2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelGambar, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
                    .addComponent(cbbGambar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbbGambar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(panelGambar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbbGambarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbGambarItemStateChanged
        // TODO add your handling code here:
        CardLayout c1 = (CardLayout)(panelGambar.getLayout());
        c1.show(panelGambar, String.valueOf(cbbGambar.getSelectedIndex()));
    }//GEN-LAST:event_cbbGambarItemStateChanged

    private void cbbGambarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbGambarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbGambarActionPerformed

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
            java.util.logging.Logger.getLogger(ApkPenampilGambarCombobox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ApkPenampilGambarCombobox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ApkPenampilGambarCombobox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ApkPenampilGambarCombobox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ApkPenampilGambarCombobox().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cover1;
    private javax.swing.JLabel Cover2;
    private javax.swing.JComboBox<String> cbbGambar;
    private javax.swing.JPanel panelGambar;
    private javax.swing.JLabel profil;
    // End of variables declaration//GEN-END:variables
}