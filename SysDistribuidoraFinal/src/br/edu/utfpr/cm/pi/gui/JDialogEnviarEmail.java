/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.pi.gui;

import br.edu.utfpr.cm.pi.util.Util;


/**
 *
 *@author TAYLY
 */
public class JDialogEnviarEmail extends javax.swing.JDialog {

    /**
     * Creates new form JDialogEnviarEmail
     */
    public JDialogEnviarEmail(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1Msg = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldDe = new javax.swing.JTextField();
        jTextFieldPara = new javax.swing.JTextField();
        jTextFieldSubj = new javax.swing.JTextField();
        jButtonFechar2 = new javax.swing.JButton();
        jButtonFechar4 = new javax.swing.JButton();
        jButtonFechar3 = new javax.swing.JButton();
        jLabelImage = new javax.swing.JLabel();
        jButton2Pesquisar = new javax.swing.JButton();
        jButtonPesquisarDestinatario = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(450, 434));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1Msg.setColumns(20);
        jTextArea1Msg.setRows(5);
        jScrollPane1.setViewportView(jTextArea1Msg);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 240, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Mensagem:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Assunto:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Para:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("De:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        jTextFieldDe.setEditable(false);
        getContentPane().add(jTextFieldDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 180, 30));
        getContentPane().add(jTextFieldPara, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 180, 30));

        jTextFieldSubj.setText("qqq");
        getContentPane().add(jTextFieldSubj, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 240, 30));

        jButtonFechar2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButtonFechar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/pi/icons/Ok_.png"))); // NOI18N
        jButtonFechar2.setToolTipText("Confirmar");
        jButtonFechar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFechar2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonFechar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 50, -1));

        jButtonFechar4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButtonFechar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/pi/icons/claer_24.png"))); // NOI18N
        jButtonFechar4.setToolTipText("Limpar");
        jButtonFechar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFechar4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonFechar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 50, -1));

        jButtonFechar3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButtonFechar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/pi/icons/close_24.png"))); // NOI18N
        jButtonFechar3.setToolTipText("Fechar");
        jButtonFechar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFechar3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonFechar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 50, -1));

        jLabelImage.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/pi/name/Enviar e-mail.png"))); // NOI18N
        getContentPane().add(jLabelImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 360, 50));

        jButton2Pesquisar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButton2Pesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/pi/icons/Add.png"))); // NOI18N
        jButton2Pesquisar.setToolTipText("Pesquisar");
        jButton2Pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2PesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2Pesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 50, 30));

        jButtonPesquisarDestinatario.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButtonPesquisarDestinatario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/pi/icons/Add.png"))); // NOI18N
        jButtonPesquisarDestinatario.setToolTipText("Pesquisar");
        jButtonPesquisarDestinatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarDestinatarioActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPesquisarDestinatario, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 50, 30));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 450, -1));

        setBounds(0, 0, 466, 473);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFechar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFechar2ActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_jButtonFechar2ActionPerformed

    private void jButtonFechar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFechar4ActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jButtonFechar4ActionPerformed

    private void jButtonFechar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFechar3ActionPerformed
        if (Util.imprimirConfirmacao("Deseja Sair?")) {
            dispose();
        }
     
    }//GEN-LAST:event_jButtonFechar3ActionPerformed

    private void jButton2PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2PesquisarActionPerformed
       
    }//GEN-LAST:event_jButton2PesquisarActionPerformed

    private void jButtonPesquisarDestinatarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarDestinatarioActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jButtonPesquisarDestinatarioActionPerformed

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
            java.util.logging.Logger.getLogger(JDialogEnviarEmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogEnviarEmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogEnviarEmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogEnviarEmail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogEnviarEmail dialog = new JDialogEnviarEmail(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2Pesquisar;
    private javax.swing.JButton jButtonFechar2;
    private javax.swing.JButton jButtonFechar3;
    private javax.swing.JButton jButtonFechar4;
    private javax.swing.JButton jButtonPesquisarDestinatario;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelImage;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1Msg;
    private javax.swing.JTextField jTextFieldDe;
    private javax.swing.JTextField jTextFieldPara;
    private javax.swing.JTextField jTextFieldSubj;
    // End of variables declaration//GEN-END:variables
}
