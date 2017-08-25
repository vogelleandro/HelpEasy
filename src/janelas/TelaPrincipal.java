/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janelas;

import apoio.ConexaoBD;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 *
 * @author Mileto
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);

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
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        imnCidades = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        imnAlterarSenha = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        ImnCadastroFase = new javax.swing.JMenuItem();
        ImnCadastroProjeto = new javax.swing.JMenuItem();
        imnCadastroMotivo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Help Easy");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 713, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 407, Short.MAX_VALUE)
        );

        jMenu1.setText("Cadastros");

        imnCidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/IconLocation.png"))); // NOI18N
        imnCidades.setText("Cidades");
        imnCidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imnCidadesActionPerformed(evt);
            }
        });
        jMenu1.add(imnCidades);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("Configurações");

        imnAlterarSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/preferences_desktop_user_password.png"))); // NOI18N
        imnAlterarSenha.setText("Alterar senha");
        imnAlterarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imnAlterarSenhaActionPerformed(evt);
            }
        });
        jMenu4.add(imnAlterarSenha);

        jMenuBar1.add(jMenu4);

        jMenu2.setText("Gerência");

        ImnCadastroFase.setText("Cadastro de fase");
        ImnCadastroFase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImnCadastroFaseActionPerformed(evt);
            }
        });
        jMenu2.add(ImnCadastroFase);

        ImnCadastroProjeto.setText("Cadastro de projeto");
        ImnCadastroProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImnCadastroProjetoActionPerformed(evt);
            }
        });
        jMenu2.add(ImnCadastroProjeto);

        imnCadastroMotivo.setText("Cadastro de motivo");
        imnCadastroMotivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imnCadastroMotivoActionPerformed(evt);
            }
        });
        jMenu2.add(imnCadastroMotivo);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void imnCidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imnCidadesActionPerformed
    JdgCadastroCidade cadastroCidade = new JdgCadastroCidade(this, true);
    cadastroCidade.setVisible(true);
    }//GEN-LAST:event_imnCidadesActionPerformed

    private void imnAlterarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imnAlterarSenhaActionPerformed
       
    }//GEN-LAST:event_imnAlterarSenhaActionPerformed

    private void ImnCadastroFaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImnCadastroFaseActionPerformed
       JdgCadastroFase cadastroFase = new JdgCadastroFase(this, true);
       cadastroFase.setVisible(true);
    }//GEN-LAST:event_ImnCadastroFaseActionPerformed

    private void ImnCadastroProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImnCadastroProjetoActionPerformed
        JdgCadastroProjeto cadastroProjeto = new JdgCadastroProjeto(this,true);
        cadastroProjeto.setVisible(true);
    }//GEN-LAST:event_ImnCadastroProjetoActionPerformed

    private void imnCadastroMotivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imnCadastroMotivoActionPerformed
        JdgCadastroMotivo cadastroMotivo = new JdgCadastroMotivo(this,true);
        cadastroMotivo.setVisible(true);
    }//GEN-LAST:event_imnCadastroMotivoActionPerformed

    /**
     * @param args the command line arguments
     */
    
    static final Logger logger = LogManager.getLogger(helpeasy.HelpEasy.class.getName());
    
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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ImnCadastroFase;
    private javax.swing.JMenuItem ImnCadastroProjeto;
    private javax.swing.JMenuItem imnAlterarSenha;
    private javax.swing.JMenuItem imnCadastroMotivo;
    private javax.swing.JMenuItem imnCidades;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
