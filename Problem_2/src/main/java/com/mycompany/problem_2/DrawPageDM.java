/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.problem_2;

import java.awt.Font;

/**
 *
 * @author dell
 */
public class DrawPageDM extends javax.swing.JFrame {

    /**
     * Creates new form DrawPageDM
     */
    public DrawPageDM() {
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

        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        status = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        info = new javax.swing.JTextArea();
        jButton10 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(35, 31, 32));
        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 700));
        jPanel2.setLayout(null);

        jButton2.setBackground(new java.awt.Color(35, 31, 32));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/problem_2/Light Mode Button.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(925, 32, 43, 20);

        jButton3.setBackground(new java.awt.Color(35, 31, 32));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/problem_2/AboutDM.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(32, 485, 90, 23);

        jButton1.setBackground(new java.awt.Color(35, 31, 32));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/problem_2/HomeDM.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(32, 210, 72, 30);

        jButton6.setBackground(new java.awt.Color(35, 31, 32));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/problem_2/InsertDM.png"))); // NOI18N
        jButton6.setBorder(null);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6);
        jButton6.setBounds(32, 265, 93, 30);

        jButton4.setBackground(new java.awt.Color(35, 31, 32));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/problem_2/FormulaDM.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(32, 320, 104, 23);

        jButton8.setBackground(new java.awt.Color(35, 31, 32));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/problem_2/GT.png"))); // NOI18N
        jButton8.setBorder(null);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8);
        jButton8.setBounds(355, 128, 230, 50);

        jButton7.setBackground(new java.awt.Color(35, 31, 32));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/problem_2/BTButtonDM.png"))); // NOI18N
        jButton7.setBorder(null);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7);
        jButton7.setBounds(665, 128, 230, 50);

        status.setFont(new java.awt.Font("Source Code Pro Black", 0, 32)); // NOI18N
        status.setForeground(new java.awt.Color(234, 192, 103));
        jPanel2.add(status);
        status.setBounds(500, 239, 400, 50);

        jScrollPane1.setBackground(new java.awt.Color(230, 231, 232));

        info.setEditable(false);
        info.setBackground(new java.awt.Color(46, 42, 43));
        info.setColumns(20);
        info.setFont(new java.awt.Font("Cascadia Code", 0, 24)); // NOI18N
        info.setForeground(new java.awt.Color(238, 238, 238));
        info.setRows(5);
        info.setText("\n    \n    GT: Draw general tree\n    \n    \n    BT: Draw binary tree");
        info.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(238, 238, 238)));
        jScrollPane1.setViewportView(info);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(314, 319, 622, 253);

        jButton10.setBackground(new java.awt.Color(35, 31, 32));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/problem_2/Gold Draw.png"))); // NOI18N
        jButton10.setBorder(null);
        jPanel2.add(jButton10);
        jButton10.setBounds(0, 411, 250, 60);

        jButton5.setBackground(new java.awt.Color(35, 31, 32));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/problem_2/TreeDM.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);
        jButton5.setBounds(32, 375, 80, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/problem_2/Navigation Bar Logo DM.png"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(32, 32, 180, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/problem_2/Line 5.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(250, 0, 10, 700);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DrawPage draw = new DrawPage();
        draw.setVisible(true);
        draw.pack();
        draw.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        HomePageDM home = new HomePageDM();
        home.setVisible(true);
        home.pack();
        home.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        InsertDM insert = new InsertDM();
        insert.setVisible(true);
        insert.pack();
        insert.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        FormulaDM formula = new FormulaDM();
        formula.setVisible(true);
        formula.pack();
        formula.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        String s = GeneralTree.drawGeneralTree(GeneralTree.returnRoot(), "", true);
        info.setFont(new Font("Source Code Pro SemiBold", 0, 16));
        info.setText(s);
        status.setText("General Tree!");
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String s = GeneralTree.drawBinaryTree(GeneralTree.generic_to_binary(GeneralTree.returnRoot()), "", true);
        info.setFont(new Font("Source Code Pro SemiBold", 0, 16));
        info.setText(s);
        status.setText(" Binary Tree!");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        ConvertDM convert = new ConvertDM();
        convert.setVisible(true);
        convert.pack();
        convert.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       AboutPageDM about = new AboutPageDM();
        about.setVisible(true);
        about.pack();
        about.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(DrawPageDM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DrawPageDM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DrawPageDM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DrawPageDM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DrawPageDM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea info;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel status;
    // End of variables declaration//GEN-END:variables
}
