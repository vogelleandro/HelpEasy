/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janelas;

import apoio.Formatacao;
import apoio.Validacao;
import controle.ControleCliente;
import entidade.Cidade;
import entidade.Cliente;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Mileto
 */
public class JdgCadastroCliente extends javax.swing.JDialog {

    /**
     * Creates new form JdgCadastroCliente
     */
    private MaskFormatter mascaraCpf;
    private MaskFormatter mascaraCnpj;
    private MaskFormatter mascaraTelefone8Digitos;
    private MaskFormatter mascaraTelefone9Digitos;

    String preValidacao = "";

    Cidade cidade = new Cidade();
    Cliente cliente = new Cliente(cidade);

    public JdgCadastroCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        popularComboBox();
        mascaraCpfCnpj();
        mascaraTelefone();
        atualizarCamposFormatados();
        limparCampos();
        Validacao.setaPermissoes(this.getClass().getName(), this.jPanel1);
    }

    private void mascaraCpfCnpj() {
        try {
            mascaraCpf = new MaskFormatter("###.###.###-##");
            mascaraCnpj = new MaskFormatter("##.###.###/####-##");

        } catch (Exception e) {
        }

    }

    private void mascaraTelefone() {
        try {
            mascaraTelefone8Digitos = new MaskFormatter("(##)####-####");
            mascaraTelefone9Digitos = new MaskFormatter("(##)#####-####");

        } catch (Exception e) {
        }
    }

    private void popularComboBox() {
        cbxTipo.addItem("Pessoa Física");
        cbxTipo.addItem("Pessoa Jurídica");
        atualizarCamposFormatados();
    }

    private void atualizarCamposFormatados() {
        tffCpfCnpj.setValue(null);
        lblSituacaoCPFCNPJ.setIcon(new javax.swing.ImageIcon(getClass().getResource("")));
        if (cbxTipo.getSelectedIndex() == 0) {
            lblRazaoSocial.setText("Nome*");
            lblCpfCnpj.setText("CPF*");
            tffCpfCnpj.setFormatterFactory(new DefaultFormatterFactory(mascaraCpf));

        } else {
            lblRazaoSocial.setText("Razão S.*");
            lblCpfCnpj.setText("CNPJ*");
            tffCpfCnpj.setFormatterFactory(new DefaultFormatterFactory(mascaraCnpj));
        }
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
        jLabel2 = new javax.swing.JLabel();
        tfdId = new javax.swing.JTextField();
        cbxTipo = new javax.swing.JComboBox<>();
        lblSituacaoCPFCNPJ = new javax.swing.JLabel();
        tffCpfCnpj = new javax.swing.JFormattedTextField();
        lblCpfCnpj = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        tffTelefone = new javax.swing.JFormattedTextField();
        lblRazaoSocial = new javax.swing.JLabel();
        tfdRazaoSocial = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        tfdCidade = new javax.swing.JTextField();
        btnLocalizaCidade = new javax.swing.JButton();
        lblEndereco = new javax.swing.JLabel();
        tfdEndereco = new javax.swing.JTextField();
        btnLocalizar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnSalvar1 = new javax.swing.JButton();
        lblEndereco1 = new javax.swing.JLabel();
        tfdEndereco1 = new javax.swing.JTextField();
        lblEndereco2 = new javax.swing.JLabel();
        tfdEndereco2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tfdEmail = new javax.swing.JTextField();
        btnBuscaCEP = new javax.swing.JButton();
        jtfCEP = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("HeapEasy - Cadastro Cliente");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de Cliente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(51, 0, 255))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Código");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        tfdId.setEditable(false);
        jPanel1.add(tfdId, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 80, -1));

        cbxTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxTipoItemStateChanged(evt);
            }
        });
        jPanel1.add(cbxTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 130, -1));
        jPanel1.add(lblSituacaoCPFCNPJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 20, 20));

        try {
            tffCpfCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tffCpfCnpj.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tffCpfCnpjFocusLost(evt);
            }
        });
        tffCpfCnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tffCpfCnpjActionPerformed(evt);
            }
        });
        jPanel1.add(tffCpfCnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 130, -1));

        lblCpfCnpj.setText("CPF*");
        jPanel1.add(lblCpfCnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        lblTelefone.setText("Telefone");
        jPanel1.add(lblTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, -1, -1));

        try {
            tffTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tffTelefone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tffTelefoneFocusLost(evt);
            }
        });
        tffTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tffTelefoneActionPerformed(evt);
            }
        });
        tffTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tffTelefoneKeyReleased(evt);
            }
        });
        jPanel1.add(tffTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 110, -1));

        lblRazaoSocial.setText("Nome*");
        jPanel1.add(lblRazaoSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));
        jPanel1.add(tfdRazaoSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 370, -1));

        lblCidade.setText("Cidade*");
        jPanel1.add(lblCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        tfdCidade.setEditable(false);
        jPanel1.add(tfdCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 270, -1));

        btnLocalizaCidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Lupa3.png"))); // NOI18N
        btnLocalizaCidade.setName("btnSalvar"); // NOI18N
        btnLocalizaCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocalizaCidadeActionPerformed(evt);
            }
        });
        jPanel1.add(btnLocalizaCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 30, 23));

        lblEndereco.setText("Endereço");
        jPanel1.add(lblEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        tfdEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdEnderecoActionPerformed(evt);
            }
        });
        jPanel1.add(tfdEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 370, -1));

        btnLocalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Lupa3.png"))); // NOI18N
        btnLocalizar.setText("Localizar");
        btnLocalizar.setName("btnLocalizar"); // NOI18N
        btnLocalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocalizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLocalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lixeira16x16.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setName("btnExcluir"); // NOI18N
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 100, -1));

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon_Schutdown16.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.setName("btnSair"); // NOI18N
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        jPanel1.add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 90, -1));

        btnSalvar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/confirmar.png"))); // NOI18N
        btnSalvar1.setText("Salvar");
        btnSalvar1.setName("btnSalvar"); // NOI18N
        btnSalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalvar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 100, -1));

        lblEndereco1.setText("Endereço");
        jPanel1.add(lblEndereco1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        tfdEndereco1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdEndereco1ActionPerformed(evt);
            }
        });
        jPanel1.add(tfdEndereco1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 370, -1));

        lblEndereco2.setText("Endereço");
        jPanel1.add(lblEndereco2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        tfdEndereco2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdEndereco2ActionPerformed(evt);
            }
        });
        jPanel1.add(tfdEndereco2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 370, -1));

        jLabel1.setText("E-mail");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));
        jPanel1.add(tfdEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 370, -1));

        btnBuscaCEP.setText("Busca CEP");
        btnBuscaCEP.setName("btnBuscaCEP"); // NOI18N
        btnBuscaCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaCEPActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscaCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, -1, -1));

        jtfCEP.setText("95900068");
        jPanel1.add(jtfCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 80, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 11, 580, 300));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbxTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxTipoItemStateChanged
        atualizarCamposFormatados();
    }//GEN-LAST:event_cbxTipoItemStateChanged

    private void btnLocalizaCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocalizaCidadeActionPerformed
        int auxIdCidade = cliente.getCidade().getId();
        String auxDescricaoCidade = cliente.getCidade().getDescricao();
        cidade.setSituacao('A');
        JdgListaCidade listaCidade = new JdgListaCidade(null, true, cidade);
        listaCidade.setVisible(true);
        cliente.setCidade(cidade);
        if (cliente.getCidade().getId() > 0 && cliente.getCidade().getDescricao().length() > 0) {
            tfdCidade.setText(cliente.getCidade().getDescricao());
        } else {
            cidade.setId(auxIdCidade);
            cidade.setDescricao(auxDescricaoCidade);
            cliente.setCidade(cidade);
            tfdCidade.setText(cliente.getCidade().getDescricao());
        }


    }//GEN-LAST:event_btnLocalizaCidadeActionPerformed

    private void tffCpfCnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tffCpfCnpjActionPerformed

    }//GEN-LAST:event_tffCpfCnpjActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        cliente.setSituacao('I');
//        if (verificarCadastrado()) {

        cliente.setSituacao('I');
        ControleCliente controleCliente = new ControleCliente();
        String mensagem = controleCliente.salvar(cliente);
        if (mensagem.equals("ok")) {
            limparCampos();
            JOptionPane.showMessageDialog(null, "Cadastro de cliente excluído com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, mensagem);
            janelas.TelaPrincipal.logH.gravaInfo(this.getClass().getName(), mensagem);
        }

//                ClienteDAO clienteDAO = new ClienteDAO();
//                clienteDAO.salvar(cliente);

    }//GEN-LAST:event_btnExcluirActionPerformed
    private void limparCampos() {
        cliente.setId(0);
        cidade.setId(0);
        cliente.setSituacao('0');
        cliente.setCpfCnpj("");
        tfdId.setText("");
        tffCpfCnpj.setText("");
        tffTelefone.setText("");
        tfdCidade.setText("");
        tfdRazaoSocial.setText("");
        tfdEndereco.setText("");
        tfdEmail.setText("");

        tfdRazaoSocial.requestFocus();
        tffCpfCnpj.setEnabled(true);
        lblSituacaoCPFCNPJ.setIcon(null);
        cbxTipo.setEnabled(true);
    }
    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void tffTelefoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tffTelefoneKeyReleased

    }//GEN-LAST:event_tffTelefoneKeyReleased

    private void tffTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tffTelefoneActionPerformed

    }//GEN-LAST:event_tffTelefoneActionPerformed

    private void tffTelefoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tffTelefoneFocusLost
        // System.out.println(tffTelefone.getText().length());
        String a = "";
        if (tffTelefone.getText().replace(" ", "").length() == 13) {
            a = "" + tffTelefone.getText().charAt(1) + tffTelefone.getText().charAt(2)
                    + tffTelefone.getText().charAt(4) + tffTelefone.getText().charAt(5)
                    + tffTelefone.getText().charAt(6) + tffTelefone.getText().charAt(7)
                    + tffTelefone.getText().charAt(8) + tffTelefone.getText().charAt(10)
                    + tffTelefone.getText().charAt(11) + tffTelefone.getText().charAt(12);
            // System.out.println(tffTelefone.getText().replace(" ", "").length());
            tffTelefone.setFormatterFactory(new DefaultFormatterFactory(mascaraTelefone8Digitos));
            tffTelefone.setText(a);

        }
    }//GEN-LAST:event_tffTelefoneFocusLost

    private void btnLocalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocalizarActionPerformed

        limparCampos();
        JdgListaCliente clientes = new JdgListaCliente(null, true, cliente, cidade);
        clientes.setVisible(true);
        if (cliente.getId() > 0) {
            tffCpfCnpj.setEnabled(false);
            cbxTipo.setEnabled(false);

        } else {
            tffCpfCnpj.setEnabled(true);
            cbxTipo.setEnabled(true);
        }

        verificarCadastroSelecionado();


    }//GEN-LAST:event_btnLocalizarActionPerformed

    private void tffCpfCnpjFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tffCpfCnpjFocusLost
        if (tffCpfCnpj.getText().length() > 14) {
            if (Validacao.validarCNPJ(Formatacao.removerFormatacao(tffCpfCnpj.getText()))) {

                lblSituacaoCPFCNPJ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/confirmar.png")));
            } else {

                lblSituacaoCPFCNPJ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon_button_cancel.png")));
            }
        } else {
            if (Validacao.validarCPF(Formatacao.removerFormatacao(tffCpfCnpj.getText()))) {
                // System.out.println("ok");
                lblSituacaoCPFCNPJ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/confirmar.png")));
            } else {
                //System.out.println("false");
                lblSituacaoCPFCNPJ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon_button_cancel.png")));
            }
        }

    }//GEN-LAST:event_tffCpfCnpjFocusLost

    private void tfdEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdEnderecoActionPerformed

    private void btnSalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvar1ActionPerformed
        //  if (validarCampos()) {
        if (tfdId.getText().length() > 0) {
            cliente.setId(Integer.parseInt(tfdId.getText()));
        }
        cliente.setRazaoSocial(tfdRazaoSocial.getText());
        cliente.setCpfCnpj(tffCpfCnpj.getText().replace(".", "").replace("-", "").replace("/", ""));
        cliente.setEndereco(tfdEndereco.getText());
        cliente.setTelefone(tffTelefone.getText().replace("(", "").replace(")", "").replace("-", "").replace(" ", ""));
        cliente.setCidade(cidade);
        cliente.setEmail(tfdEmail.getText());
        if (cbxTipo.getSelectedIndex() == 0) {
            cliente.setTipoCadastro('F');
        } else {
            cliente.setTipoCadastro('J');
        }

        cliente.setSituacao('A');

        ControleCliente controleCliente = new ControleCliente();
        String mensagem = controleCliente.salvar(cliente);
        if (mensagem.equals("ok")) {
            limparCampos();
            JOptionPane.showMessageDialog(rootPane, "Cliente cadastrado com sucesso");
        } else {
            JOptionPane.showMessageDialog(rootPane, mensagem);
        }

        //  }
    }//GEN-LAST:event_btnSalvar1ActionPerformed

    private void tfdEndereco1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdEndereco1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdEndereco1ActionPerformed

    private void tfdEndereco2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdEndereco2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdEndereco2ActionPerformed

    private void btnBuscaCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaCEPActionPerformed
        //System.out.println("1 - " + Cep.ClienteWs.getEnderecoPorCep("95900068"));
        //System.out.println("2 - " + Cep.ClienteWs.getMapPorCep("95900068"));

        try {

            String sCep = jtfCEP.getText();
            String sLog = "";
            if (sCep.length() == 8) {
                sLog = Cep.ClienteWs.getEnderecoPorCep(sCep).getLogradouro();
                if (sLog.length() == 0) {
                    JOptionPane.showMessageDialog(rootPane, "CEP não encontrado.");
                } else {
                    tfdEndereco.setText(sLog);
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "CEP Inválido, precisa ter 8");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "CEP não encontrado.");
        }

    }//GEN-LAST:event_btnBuscaCEPActionPerformed
    private boolean validarCampos() {

        preValidacao = "Erro ao salvar cliente:\n";
        boolean ok = true;
        if (tfdRazaoSocial.getText().length() > 150 || tfdRazaoSocial.getText().length() <= 2) {
            preValidacao = preValidacao + "Nome do cliente precisa ter entre 3 a 150 caracteres\n";
            ok = false;
//            lblRazaoSocial.setForeground(Color.red);
        }
        if (tfdEndereco.getText().length() > 150) {
            preValidacao = preValidacao + "Endereço do cliente com mais de 150 caracteres\n";
            ok = false;
//            lblEndereco.setForeground(Color.red);
        }
        if (tfdCidade.getText().length() > 100 || tfdCidade.getText().length() <= 0) {
            preValidacao = preValidacao + "Cidade do cliente não selecionada\n";
            ok = false;
//            lblCidade.setForeground(Color.red);
        }

        if (cbxTipo.getSelectedIndex() == 0) {
            //System.out.println("antes do if..."+tffCpfCnpj.getText());
            try {

                if (!Validacao.validarCPF(Formatacao.removerFormatacao(tffCpfCnpj.getText()))) {
                    // System.out.println("entrou no if do cpf como certo");
                    preValidacao = preValidacao + "CPF do cliente incorreto\n";
                    ok = false;
//                    lblCpfCnpj.setForeground(Color.red);

                }
            } catch (Exception e) {
                preValidacao = preValidacao + "CPF do cliente incorreto\n";
                ok = false;
//                lblCpfCnpj.setForeground(Color.red);
            }

        } else {
            try {
                if (!Validacao.validarCNPJ(Formatacao.removerFormatacao(tffCpfCnpj.getText()))) {
                    preValidacao = preValidacao + "CNPJ do cliente incorreto\n";
                    ok = false;
//                    lblCpfCnpj.setForeground(Color.red);
                }
            } catch (Exception e) {
                preValidacao = preValidacao + "CPF do cliente incorreto\n";
                ok = false;
//                lblCpfCnpj.setForeground(Color.red);

            }
            // System.out.println("ok..."+ok);
        }
        if (tffTelefone.getText().replace(" ", "").replace("(", "").replace(")", "").replace("-", "").length() < 10
                && tffTelefone.getText().replace(" ", "").replace("(", "").replace(")", "").replace("-", "").length() > 1) {

//            lblTelefone.setForeground(Color.red);
            preValidacao = preValidacao + "Telefone do cliente inválido\n";
            ok = false;
        }
        if (tffTelefone.getText().replace(" ", "").replace("(", "").replace(")", "").replace("-", "").length() == 0) {
            cliente.setTelefone("");

        }
        if (tfdEndereco.getText().replace(" ", "").replace("(", "").replace(")", "").replace("-", "").length() == 0) {
            cliente.setEndereco("");

        }

        return ok;
    }

    private boolean verificarCadastrado() {

//        ClienteDAO cliDAO = new ClienteDAO();
//        cliente.setCpfCnpj(tffCpfCnpj.getText().replace(".", "").replace("-", "").replace("/", ""));
//
//        ArrayList<Cliente> clientes = cliDAO.listar(cliente);
//        if (cliente.getId() == 0) {
//
//            if (clientes.size() > 0) {
//
//                if (cliente.getCpfCnpj().equals(clientes.get(0).getCpfCnpj())) {
//                   // System.out.println("false");
//                    return false;
//                } else {
//                  //  System.out.println("true");
//                    return true;
//                }
//            }
//        }
        return true;
    }

    private void verificarCadastroSelecionado() {

        if (cliente.getId() > 0) {
            if (cliente.getTipoCadastro() == 'F') {
                cbxTipo.setSelectedIndex(0);
            } else {
                cbxTipo.setSelectedIndex(1);
            }
            tfdId.setText(String.valueOf(cliente.getId()));
            tfdRazaoSocial.setText(cliente.getRazaoSocial());
            tfdCidade.setText(cliente.getCidade().getDescricao());
            tfdEndereco.setText(cliente.getEndereco());
            tffCpfCnpj.setText(cliente.getCpfCnpj());
            tffTelefone.setText(cliente.getTelefone());
            tfdEmail.setText(cliente.getEmail());

        } else {
            limparCampos();
        }
    }

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
            java.util.logging.Logger.getLogger(JdgCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JdgCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JdgCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JdgCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JdgCadastroCliente dialog = new JdgCadastroCliente(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnBuscaCEP;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLocalizaCidade;
    private javax.swing.JButton btnLocalizar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar1;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jtfCEP;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCpfCnpj;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblEndereco1;
    private javax.swing.JLabel lblEndereco2;
    private javax.swing.JLabel lblRazaoSocial;
    private javax.swing.JLabel lblSituacaoCPFCNPJ;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JTextField tfdCidade;
    private javax.swing.JTextField tfdEmail;
    private javax.swing.JTextField tfdEndereco;
    private javax.swing.JTextField tfdEndereco1;
    private javax.swing.JTextField tfdEndereco2;
    private javax.swing.JTextField tfdId;
    private javax.swing.JTextField tfdRazaoSocial;
    private javax.swing.JFormattedTextField tffCpfCnpj;
    private javax.swing.JFormattedTextField tffTelefone;
    // End of variables declaration//GEN-END:variables
}
