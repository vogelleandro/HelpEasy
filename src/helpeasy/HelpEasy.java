/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpeasy;

import apoio.ConexaoBD;
import apoio.Formatacao;
import apoio.Util;
import janelas.JdgCadastroCidade;
import janelas.Senha;
import janelas.TelaPrincipal;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.mail.MessagingException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Mileto
 */
public class HelpEasy {
    List<String> to;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MessagingException {
        
        
        
       
     //   Util.enviodeEmail();
        
        
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            // If Nimbus is not available, you can set the GUI to another look and feel.
        }

        if (ConexaoBD.getInstance()
                .getConnection() != null) {
//            JOptionPane.showMessageDialog(null, "conectou");
            Senha senha = new Senha();
            senha.setVisible(true);

            
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao abrir banco de dados, entre em contato com o suporte!");
        }

        
    }

}
