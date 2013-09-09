/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.cm.tsi.gui;

import br.edu.utfpr.cm.pi.util.Util;

/**
 *
 * @author TAYLY
 */
public class JDialogPesquisarProduto extends javax.swing.JDialog {

    /**
     * Creates new form JDialogPesquisarProduto
     */
    public JDialogPesquisarProduto(java.awt.Frame parent, boolean modal) {
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

        jLabel1 = new javax.swing.JLabel();
        jLabelPesProdImagem = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTextFieldPesProdCod = new javax.swing.JTextField();
        jButton1PesProdPesquisar = new javax.swing.JButton();
        jTextFieldPesProdDesc = new javax.swing.JTextField();
        jLabelPesProdDescr = new javax.swing.JLabel();
        jLabelPesProdCodigo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePesProd = new javax.swing.JTable();
        jButtonPesProdAtualizar = new javax.swing.JButton();
        jButtonPesProdLimpar = new javax.swing.JButton();
        jButtonPesProdCadastrarProduto = new javax.swing.JButton();
        jButtonPesProdFechar = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(620, 480));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelPesProdImagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPesProdImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/pi/icons/Pesquisar produto.png"))); // NOI18N
        jLabelPesProdImagem.setToolTipText("");
        getContentPane().add(jLabelPesProdImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 240, 50));

        jSeparator1.setMaximumSize(new java.awt.Dimension(620, 1));
        jSeparator1.setMinimumSize(new java.awt.Dimension(620, 1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 620, 1));

        jTextFieldPesProdCod.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        getContentPane().add(jTextFieldPesProdCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 110, -1));

        jButton1PesProdPesquisar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButton1PesProdPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/pi/icons/pesquisar.png"))); // NOI18N
        jButton1PesProdPesquisar.setToolTipText("Pesquisar");
        getContentPane().add(jButton1PesProdPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 50, 50));

        jTextFieldPesProdDesc.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        getContentPane().add(jTextFieldPesProdDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 210, -1));

        jLabelPesProdDescr.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelPesProdDescr.setText("Descrição:");
        getContentPane().add(jLabelPesProdDescr, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        jLabelPesProdCodigo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabelPesProdCodigo.setText("Código:");
        getContentPane().add(jLabelPesProdCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jTablePesProd.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jTablePesProd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Cod", "Descrição", "Estoque"
            }
        ));
        jScrollPane1.setViewportView(jTablePesProd);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 510, 160));

        jButtonPesProdAtualizar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButtonPesProdAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/pi/icons/update.png"))); // NOI18N
        jButtonPesProdAtualizar.setToolTipText("Atualizar");
        getContentPane().add(jButtonPesProdAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, -1, -1));

        jButtonPesProdLimpar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButtonPesProdLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/pi/icons/clear02.png"))); // NOI18N
        jButtonPesProdLimpar.setToolTipText("Limpar");
        getContentPane().add(jButtonPesProdLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, -1, -1));

        jButtonPesProdCadastrarProduto.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButtonPesProdCadastrarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/pi/icons/searchProd.png"))); // NOI18N
        jButtonPesProdCadastrarProduto.setToolTipText("Cadastrar Produto");
        getContentPane().add(jButtonPesProdCadastrarProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, -1, -1));

        jButtonPesProdFechar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButtonPesProdFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/cm/tsi/pi/icons/Close.png"))); // NOI18N
        jButtonPesProdFechar.setToolTipText("Fechar");
        jButtonPesProdFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesProdFecharActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPesProdFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPesProdFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesProdFecharActionPerformed
         if (Util.imprimirConfirmacao("Deseja Sair?")) {
            dispose();
        }
    }//GEN-LAST:event_jButtonPesProdFecharActionPerformed

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
            java.util.logging.Logger.getLogger(JDialogPesquisarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogPesquisarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogPesquisarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogPesquisarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogPesquisarProduto dialog = new JDialogPesquisarProduto(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton1PesProdPesquisar;
    private javax.swing.JButton jButtonPesProdAtualizar;
    private javax.swing.JButton jButtonPesProdCadastrarProduto;
    private javax.swing.JButton jButtonPesProdFechar;
    private javax.swing.JButton jButtonPesProdLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelPesProdCodigo;
    private javax.swing.JLabel jLabelPesProdDescr;
    private javax.swing.JLabel jLabelPesProdImagem;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTablePesProd;
    private javax.swing.JTextField jTextFieldPesProdCod;
    private javax.swing.JTextField jTextFieldPesProdDesc;
    // End of variables declaration//GEN-END:variables
}
