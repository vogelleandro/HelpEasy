/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janelas;

import apoio.LogHeasy;
import apoio.Validacao;
import controle.ControleTarefa;
import entidade.Cliente;
import entidade.EnvioEmail;
import entidade.Fase;
import entidade.Modulo;
import entidade.Motivo;
import entidade.Prioridade;
import entidade.Projeto;
import entidade.Tarefa;
import entidade.Usuario;
import entidade.Versao;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Mileto
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
//    Usuario usuario;
    public static Usuario userH = new Usuario();
    public static EnvioEmail envioEmail = new EnvioEmail();
    
    public TelaPrincipal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        
    }
    
    public TelaPrincipal(Usuario usuario) {
        Validacao.populaPermissao();
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        lblUsuario.setText(usuario.getLogin());
        userH = usuario;
        Validacao.setaPermissoes(this.jMenuBar1);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblVersao = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        menuItemSair = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        ImnClientes = new javax.swing.JMenuItem();
        imnCidades = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        ImnTarefa = new javax.swing.JMenuItem();
        imnListaTarefas = new javax.swing.JMenuItem();
        ImnCadastroUsuario = new javax.swing.JMenu();
        ImnCadastroFase = new javax.swing.JMenuItem();
        ImnCadastroModulo = new javax.swing.JMenuItem();
        imnCadastroMotivo = new javax.swing.JMenuItem();
        ImnCadastroPrioridade = new javax.swing.JMenuItem();
        ImnCadastroProjeto = new javax.swing.JMenuItem();
        imnCadastroUsuario = new javax.swing.JMenuItem();
        ImnCadastroVersao = new javax.swing.JMenuItem();
        ImnPermissoesUsuario = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        imnParametrosSistema = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Help Easy");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Versão:");

        lblVersao.setText("XXX");

        jLabel2.setText("Usuário:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblVersao)
                .addGap(129, 129, 129)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 344, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblVersao)
                    .addComponent(jLabel2)
                    .addComponent(lblUsuario)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 391, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        menuArquivo.setText("Arquivo");
        menuArquivo.setName("menuArquivo"); // NOI18N

        menuItemSair.setText("Sair");
        menuItemSair.setName("menuSempreVisivel"); // NOI18N
        menuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSairActionPerformed(evt);
            }
        });
        menuArquivo.add(menuItemSair);

        jMenuBar1.add(menuArquivo);

        jMenu1.setText("Cadastros");
        jMenu1.setName("menuCadastro"); // NOI18N

        ImnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Iconusers48.png"))); // NOI18N
        ImnClientes.setText("Clientes");
        ImnClientes.setName("janelas.JdgCadastroCliente"); // NOI18N
        ImnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImnClientesActionPerformed(evt);
            }
        });
        jMenu1.add(ImnClientes);

        imnCidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/IconLocation.png"))); // NOI18N
        imnCidades.setText("Cidades");
        imnCidades.setName("janelas.JdgCadastroCidade"); // NOI18N
        imnCidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imnCidadesActionPerformed(evt);
            }
        });
        jMenu1.add(imnCidades);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Tarefas");

        ImnTarefa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadastrodetarefaicone.png"))); // NOI18N
        ImnTarefa.setText("Tarefa");
        ImnTarefa.setName("janelas.JdgCadastroTarefa"); // NOI18N
        ImnTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImnTarefaActionPerformed(evt);
            }
        });
        jMenu2.add(ImnTarefa);

        imnListaTarefas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tarefaicon.png"))); // NOI18N
        imnListaTarefas.setText("Lista de tarefas");
        imnListaTarefas.setName("janelas.JdgListaTarefas"); // NOI18N
        imnListaTarefas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imnListaTarefasActionPerformed(evt);
            }
        });
        jMenu2.add(imnListaTarefas);

        jMenuBar1.add(jMenu2);

        ImnCadastroUsuario.setText("Gerência");
        ImnCadastroUsuario.setName("menuGerencia"); // NOI18N
        ImnCadastroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImnCadastroUsuarioActionPerformed(evt);
            }
        });

        ImnCadastroFase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadastrofaseicone.png"))); // NOI18N
        ImnCadastroFase.setText("Cadastro de fase");
        ImnCadastroFase.setName("janelas.JdgCadastroFase"); // NOI18N
        ImnCadastroFase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImnCadastroFaseActionPerformed(evt);
            }
        });
        ImnCadastroUsuario.add(ImnCadastroFase);

        ImnCadastroModulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadastromoduloicone48.png"))); // NOI18N
        ImnCadastroModulo.setText("Cadastro de módulo");
        ImnCadastroModulo.setName("janelas.JdgCadastroModulo"); // NOI18N
        ImnCadastroModulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImnCadastroModuloActionPerformed(evt);
            }
        });
        ImnCadastroUsuario.add(ImnCadastroModulo);

        imnCadastroMotivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadastromotivoicon48.png"))); // NOI18N
        imnCadastroMotivo.setText("Cadastro de motivo");
        imnCadastroMotivo.setName("janelas.JdgCadastroMotivo"); // NOI18N
        imnCadastroMotivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imnCadastroMotivoActionPerformed(evt);
            }
        });
        ImnCadastroUsuario.add(imnCadastroMotivo);

        ImnCadastroPrioridade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadastroprioridadeicon48.png"))); // NOI18N
        ImnCadastroPrioridade.setText("Cadastro de prioridade");
        ImnCadastroPrioridade.setName("janelas.JdgCadastroPrioridade"); // NOI18N
        ImnCadastroPrioridade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImnCadastroPrioridadeActionPerformed(evt);
            }
        });
        ImnCadastroUsuario.add(ImnCadastroPrioridade);

        ImnCadastroProjeto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadastroferramentaicone48.png"))); // NOI18N
        ImnCadastroProjeto.setText("Cadastro de projeto");
        ImnCadastroProjeto.setName("janelas.JdgCadastroProjeto"); // NOI18N
        ImnCadastroProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImnCadastroProjetoActionPerformed(evt);
            }
        });
        ImnCadastroUsuario.add(ImnCadastroProjeto);

        imnCadastroUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadastrarusuarioicone48.png"))); // NOI18N
        imnCadastroUsuario.setText("Cadastro de usuário");
        imnCadastroUsuario.setName("janelas.JdgCadastroUsuario"); // NOI18N
        imnCadastroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imnCadastroUsuarioActionPerformed(evt);
            }
        });
        ImnCadastroUsuario.add(imnCadastroUsuario);

        ImnCadastroVersao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadastroversaoicone48.png"))); // NOI18N
        ImnCadastroVersao.setText("Cadastro de versão");
        ImnCadastroVersao.setName("janelas.JdgCadastroVersao"); // NOI18N
        ImnCadastroVersao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImnCadastroVersaoActionPerformed(evt);
            }
        });
        ImnCadastroUsuario.add(ImnCadastroVersao);

        ImnPermissoesUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/permissoesusuarioicone48.png"))); // NOI18N
        ImnPermissoesUsuario.setText("Permissões do usuário");
        ImnPermissoesUsuario.setName("janelas.JdgListaPermissoes"); // NOI18N
        ImnPermissoesUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImnPermissoesUsuarioActionPerformed(evt);
            }
        });
        ImnCadastroUsuario.add(ImnPermissoesUsuario);

        jMenuBar1.add(ImnCadastroUsuario);

        jMenu4.setText("Configurações");
        jMenu4.setName("menuConfiguracoes"); // NOI18N

        imnParametrosSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/preferences_desktop_user_password.png"))); // NOI18N
        imnParametrosSistema.setText("Alterar senha");
        imnParametrosSistema.setName("janelas.JdgAlteracaoSenha"); // NOI18N
        imnParametrosSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imnParametrosSistemaActionPerformed(evt);
            }
        });
        jMenu4.add(imnParametrosSistema);

        jMenuItem1.setText("Parâmetros do Sistema");
        jMenuItem1.setName("janelas.JdgParametrosSistema"); // NOI18N
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuItem2.setText("Configuração de E-mail");
        jMenuItem2.setName("janelas.JdgCadastroEmail"); // NOI18N
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);
        jMenuItem2.getAccessibleContext().setAccessibleName("Cadastro de Email");

        jMenuBar1.add(jMenu4);

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

    private void imnParametrosSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imnParametrosSistemaActionPerformed
        JdgAlteracaoSenha alteracaoSenha = new JdgAlteracaoSenha(this, rootPaneCheckingEnabled, userH);
        alteracaoSenha.setVisible(true);
    }//GEN-LAST:event_imnParametrosSistemaActionPerformed

    private void ImnCadastroFaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImnCadastroFaseActionPerformed
        JdgCadastroFase cadastroFase = new JdgCadastroFase(this, true);
        cadastroFase.setVisible(true);
    }//GEN-LAST:event_ImnCadastroFaseActionPerformed

    private void ImnCadastroProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImnCadastroProjetoActionPerformed
        JdgCadastroProjeto cadastroProjeto = new JdgCadastroProjeto(this, true);
        cadastroProjeto.setVisible(true);
    }//GEN-LAST:event_ImnCadastroProjetoActionPerformed

    private void imnCadastroMotivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imnCadastroMotivoActionPerformed
        JdgCadastroMotivo cadastroMotivo = new JdgCadastroMotivo(this, true);
        cadastroMotivo.setVisible(true);
    }//GEN-LAST:event_imnCadastroMotivoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        JdgParametrosSistema parametrosSistema = new JdgParametrosSistema(this, true);
        parametrosSistema.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void ImnCadastroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImnCadastroUsuarioActionPerformed
        

    }//GEN-LAST:event_ImnCadastroUsuarioActionPerformed

    private void imnCadastroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imnCadastroUsuarioActionPerformed
        // TODO add your handling code here:
        JdgCadastroUsuario cadastroUsuario = new JdgCadastroUsuario(this, true);
        cadastroUsuario.setVisible(true);
    }//GEN-LAST:event_imnCadastroUsuarioActionPerformed

    private void ImnCadastroPrioridadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImnCadastroPrioridadeActionPerformed
        JdgCadastroPrioridade cadastroPrioridade = new JdgCadastroPrioridade(this, true);
        cadastroPrioridade.setVisible(true);
    }//GEN-LAST:event_ImnCadastroPrioridadeActionPerformed

    private void ImnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImnClientesActionPerformed
        JdgCadastroCliente cadastroCliente = new JdgCadastroCliente(this, true);
        cadastroCliente.setVisible(true);
    }//GEN-LAST:event_ImnClientesActionPerformed

    private void ImnPermissoesUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImnPermissoesUsuarioActionPerformed
        JdgListaPermissoes listaPermissoes = new JdgListaPermissoes(this, true, userH);
        listaPermissoes.setVisible(true);
    }//GEN-LAST:event_ImnPermissoesUsuarioActionPerformed

    private void ImnTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImnTarefaActionPerformed
        JdgCadastroTarefa cadastroTarefa = new JdgCadastroTarefa(this, false, userH);
        cadastroTarefa.setVisible(true);
    }//GEN-LAST:event_ImnTarefaActionPerformed

    private void menuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuItemSairActionPerformed

    private void ImnCadastroModuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImnCadastroModuloActionPerformed
        JdgCadastroModulo cadastroModulo = new JdgCadastroModulo(this, true);
        cadastroModulo.setVisible(true);
    }//GEN-LAST:event_ImnCadastroModuloActionPerformed

    private void ImnCadastroVersaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImnCadastroVersaoActionPerformed
        JdgCadastroVersao cadastroVersao = new JdgCadastroVersao(this, true);
        cadastroVersao.setVisible(true);
    }//GEN-LAST:event_ImnCadastroVersaoActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        JdgCadastroEmail cadastroEmail = new JdgCadastroEmail(this, true);
        cadastroEmail.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void imnListaTarefasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imnListaTarefasActionPerformed
        Cliente cliente = new Cliente();
        Modulo modulo = new Modulo();
        Prioridade prioridade = new Prioridade();
        Projeto projeto = new Projeto();
        Fase fase = new Fase();
        Versao versaoBug = new Versao();
        Versao versaoCorrecao = new Versao();
        Usuario autor = new Usuario();
        Usuario responsavel = new Usuario();
        Date data = new Date();
        Motivo motivo = new Motivo();
        Tarefa tarefa = new Tarefa();

        
        JdgListaTarefa listaTarefa = new JdgListaTarefa(null, false, tarefa,motivo,autor, responsavel, projeto, prioridade, modulo, versaoBug, versaoCorrecao, fase,cliente);
        listaTarefa.setVisible(true);
        
        ArrayList<Tarefa> tarefas = new ArrayList<>();
        ControleTarefa controleTarefa = new ControleTarefa();
        tarefas = controleTarefa.listarUmId(tarefa);
        try {
        tarefa = tarefas.get(0);    
        } catch (Exception e) {
            
        }
        
        
       // JOptionPane.showMessageDialog(rootPane, tarefa.getTitulo());
        

        if (tarefa.getId()>0) {
           // JOptionPane.showMessageDialog(rootPane, motivo.getId() + tarefa.getMotivo().getId());
//            motivo.setId(tarefa.getMotivo().getId());
//            tarefa.setMotivo(motivo);
            JdgCadastroTarefa cadastroTarefa = new JdgCadastroTarefa(null, true,tarefa,motivo,autor, responsavel, modulo, projeto, prioridade, fase, versaoBug, versaoCorrecao,cliente);
            cadastroTarefa.setVisible(true);
        }
    }//GEN-LAST:event_imnListaTarefasActionPerformed

    /**
     * @param args the command line arguments
     */
    static final LogHeasy logH = new LogHeasy();
    
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
    private javax.swing.JMenuItem ImnCadastroModulo;
    private javax.swing.JMenuItem ImnCadastroPrioridade;
    private javax.swing.JMenuItem ImnCadastroProjeto;
    private javax.swing.JMenu ImnCadastroUsuario;
    private javax.swing.JMenuItem ImnCadastroVersao;
    private javax.swing.JMenuItem ImnClientes;
    private javax.swing.JMenuItem ImnPermissoesUsuario;
    private javax.swing.JMenuItem ImnTarefa;
    private javax.swing.JMenuItem imnCadastroMotivo;
    private javax.swing.JMenuItem imnCadastroUsuario;
    private javax.swing.JMenuItem imnCidades;
    private javax.swing.JMenuItem imnListaTarefas;
    private javax.swing.JMenuItem imnParametrosSistema;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblVersao;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenuItem menuItemSair;
    // End of variables declaration//GEN-END:variables
}
