/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apkkalkulator;

import javax.swing.JOptionPane;

/**
 *
 * @author myusu
 */
public class ApkKalkulator extends javax.swing.JFrame {
    String bil, bilangan;
    double hasil, operand1, operand2;
    int operator;

    /**
     * Creates new form ApkKalkulator
     */
    public ApkKalkulator() {
        initComponents();
        setLocationRelativeTo(null);
        bil="";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        input = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        bSeven = new javax.swing.JButton();
        bEight = new javax.swing.JButton();
        bNine = new javax.swing.JButton();
        bFour = new javax.swing.JButton();
        bFive = new javax.swing.JButton();
        bSix = new javax.swing.JButton();
        bThree = new javax.swing.JButton();
        bOne = new javax.swing.JButton();
        bTwo = new javax.swing.JButton();
        bZero = new javax.swing.JButton();
        bClear = new javax.swing.JButton();
        bDot = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        bAdd = new javax.swing.JButton();
        bMulti = new javax.swing.JButton();
        bPersen = new javax.swing.JButton();
        bDiv = new javax.swing.JButton();
        bSub = new javax.swing.JButton();
        bE = new javax.swing.JButton();
        bEqual = new javax.swing.JButton();
        bB = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 346, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 361, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 51, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("APLIKASI KALKULATOR");

        input.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        input.setForeground(new java.awt.Color(255, 0, 51));
        input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(222, 222, 222))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(176, 176, 176))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(input, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jPanel6.setBackground(new java.awt.Color(153, 0, 153));
        jPanel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        java.awt.GridBagLayout jPanel6Layout = new java.awt.GridBagLayout();
        jPanel6Layout.columnWidths = new int[] {10, 10, 10};
        jPanel6.setLayout(jPanel6Layout);

        bSeven.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bSeven.setText("7");
        bSeven.setAlignmentX(1.0F);
        bSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSevenActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 52;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(34, 23, 0, 0);
        jPanel6.add(bSeven, gridBagConstraints);

        bEight.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bEight.setText("8");
        bEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEightActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 52;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(34, 23, 0, 0);
        jPanel6.add(bEight, gridBagConstraints);

        bNine.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bNine.setText("9");
        bNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNineActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 52;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(34, 23, 0, 26);
        jPanel6.add(bNine, gridBagConstraints);

        bFour.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bFour.setText("4");
        bFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFourActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 52;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(34, 23, 0, 0);
        jPanel6.add(bFour, gridBagConstraints);

        bFive.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bFive.setText("5");
        bFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFiveActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 52;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(34, 23, 0, 0);
        jPanel6.add(bFive, gridBagConstraints);

        bSix.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bSix.setText("6");
        bSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSixActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 52;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(34, 23, 0, 26);
        jPanel6.add(bSix, gridBagConstraints);

        bThree.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bThree.setText("3");
        bThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bThreeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 52;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(34, 23, 0, 26);
        jPanel6.add(bThree, gridBagConstraints);

        bOne.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bOne.setText("1");
        bOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOneActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 52;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(34, 23, 0, 0);
        jPanel6.add(bOne, gridBagConstraints);

        bTwo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bTwo.setText("2");
        bTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTwoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 52;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(34, 23, 0, 0);
        jPanel6.add(bTwo, gridBagConstraints);

        bZero.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bZero.setText("0");
        bZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bZeroActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 52;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(34, 23, 40, 0);
        jPanel6.add(bZero, gridBagConstraints);

        bClear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bClear.setText("C");
        bClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bClearActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 52;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(34, 23, 40, 26);
        jPanel6.add(bClear, gridBagConstraints);

        bDot.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bDot.setText(".");
        bDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDotActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 52;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(34, 23, 40, 0);
        jPanel6.add(bDot, gridBagConstraints);

        jPanel7.setBackground(new java.awt.Color(0, 0, 204));
        jPanel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        bAdd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bAdd.setText("+");
        bAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddActionPerformed(evt);
            }
        });

        bMulti.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bMulti.setText("*");
        bMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMultiActionPerformed(evt);
            }
        });

        bPersen.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bPersen.setText("%");
        bPersen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPersenActionPerformed(evt);
            }
        });

        bDiv.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bDiv.setText("/");
        bDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDivActionPerformed(evt);
            }
        });

        bSub.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bSub.setText("-");
        bSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSubActionPerformed(evt);
            }
        });

        bE.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bE.setText("E X I T");
        bE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEActionPerformed(evt);
            }
        });

        bEqual.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bEqual.setText("=");
        bEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEqualActionPerformed(evt);
            }
        });

        bB.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bB.setText("<<");
        bB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(bE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(bAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bPersen, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(bSub, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bB, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(bE, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bPersen, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bSub, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bB, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(bEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bClearActionPerformed
        // TODO add your handling code here:
        operand1 = 0.0;
        operand2 = 0.0;
        hasil = 0.0;
        bil="";
        input.setText(null);
        
    }//GEN-LAST:event_bClearActionPerformed

    private void inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputActionPerformed

    private void bSixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSixActionPerformed
        // TODO add your handling code here:
        bil+="6";
        input.setText(bil);
    }//GEN-LAST:event_bSixActionPerformed

    private void bOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOneActionPerformed
        // TODO add your handling code here:
        bil+="1";
        input.setText(bil);                                  
    }//GEN-LAST:event_bOneActionPerformed

    private void bTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTwoActionPerformed
        // TODO add your handling code here:
        bil+="2";
        input.setText(bil);
    }//GEN-LAST:event_bTwoActionPerformed

    private void bAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddActionPerformed
        // TODO add your handling code here:
        operand1=Double.parseDouble(bil);
        input.setText("+");
        bil="";
        operator=1;
    }//GEN-LAST:event_bAddActionPerformed

    private void bZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bZeroActionPerformed
        // TODO add your handling code here:
        bil+=0;
        input.setText(bil);
    }//GEN-LAST:event_bZeroActionPerformed

    private void bThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bThreeActionPerformed
        // TODO add your handling code here:
        bil+="3";
        input.setText(bil);
    }//GEN-LAST:event_bThreeActionPerformed

    private void bFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFourActionPerformed
        // TODO add your handling code here:
        bil+="4";
        input.setText(bil);
    }//GEN-LAST:event_bFourActionPerformed

    private void bFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFiveActionPerformed
        // TODO add your handling code here:
        bil+="5";
        input.setText(bil);
    }//GEN-LAST:event_bFiveActionPerformed

    private void bSevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSevenActionPerformed
        // TODO add your handling code here:
        bil+="7";
        input.setText(bil);
    }//GEN-LAST:event_bSevenActionPerformed

    private void bEightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEightActionPerformed
        // TODO add your handling code here:
        bil+="8";
        input.setText(bil);
    }//GEN-LAST:event_bEightActionPerformed

    private void bNineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNineActionPerformed
        // TODO add your handling code here:
        bil+="9";
        input.setText(bil);
    }//GEN-LAST:event_bNineActionPerformed

    private void bMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMultiActionPerformed
        // TODO add your handling code here:
        operand1=Double.parseDouble(bil);
        input.setText("*");
        bil="";
        operator=3;
    }//GEN-LAST:event_bMultiActionPerformed

    private void bSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSubActionPerformed
        // TODO add your handling code here:
        operand1=Double.parseDouble(bil);
        input.setText("-");
        bil="";
        operator=2;
    }//GEN-LAST:event_bSubActionPerformed

    private void bDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDivActionPerformed
        // TODO add your handling code here:
        operand1=Double.parseDouble(bil);
        input.setText("/");
        bil="";
        operator=4;
    }//GEN-LAST:event_bDivActionPerformed

    private void bEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEqualActionPerformed
        // TODO add your handling code here:
        switch(operator){
             case 1:
                operand2 = Double.parseDouble(String.valueOf(input.getText()));
                hasil = operand1 + operand2;
                input.setText(String.valueOf(hasil));
                break;
             
             case 2:
                operand2 = Double.parseDouble(String.valueOf(input.getText()));
                hasil = operand1 - operand2;
                input.setText(String.valueOf(hasil));
                break;
                
             case 3:
                operand2 = Double.parseDouble(String.valueOf(input.getText()));
                hasil = operand1 * operand2;
                input.setText(String.valueOf(hasil));
                break;
                
             case 4:
                operand2 = Double.parseDouble(String.valueOf(input.getText()));
                hasil = operand1 / operand2;
                input.setText(String.valueOf(hasil));
                break;
             
             case 5:
                operand1 = Double.parseDouble(String.valueOf(input.getText()));
                hasil = operand1 / 100 ;
                input.setText(String.valueOf(hasil));
                break;
        }
    }//GEN-LAST:event_bEqualActionPerformed

    private void bPersenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPersenActionPerformed
        // TODO add your handling code here:
        
        operand1 = Double.parseDouble(String.valueOf(input.getText()));
        hasil = operand1 / 100;
        input.setText(String.valueOf(hasil));
    }//GEN-LAST:event_bPersenActionPerformed

    private void bBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBActionPerformed
        // TODO add your handling code here:
       if(input.getText().length() <= 1){
           bil="";
           input.setText("0");
       }else{
           bil=input.getText().substring(0, input.getText().length()-1);
           input.setText(bil);
       }
    }//GEN-LAST:event_bBActionPerformed

    private void bEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(null, "Anda ingin keluar aplikasi?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION){
            System.exit(0);
        }
        
    }//GEN-LAST:event_bEActionPerformed

    private void bDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDotActionPerformed
        // TODO add your handling code here:
        bil+=".";
        input.setText(bil);
    }//GEN-LAST:event_bDotActionPerformed

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
            java.util.logging.Logger.getLogger(ApkKalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ApkKalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ApkKalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ApkKalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ApkKalkulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAdd;
    private javax.swing.JButton bB;
    private javax.swing.JButton bClear;
    private javax.swing.JButton bDiv;
    private javax.swing.JButton bDot;
    private javax.swing.JButton bE;
    private javax.swing.JButton bEight;
    private javax.swing.JButton bEqual;
    private javax.swing.JButton bFive;
    private javax.swing.JButton bFour;
    private javax.swing.JButton bMulti;
    private javax.swing.JButton bNine;
    private javax.swing.JButton bOne;
    private javax.swing.JButton bPersen;
    private javax.swing.JButton bSeven;
    private javax.swing.JButton bSix;
    private javax.swing.JButton bSub;
    private javax.swing.JButton bThree;
    private javax.swing.JButton bTwo;
    private javax.swing.JButton bZero;
    private javax.swing.JTextField input;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables
}