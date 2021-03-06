/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import apoio.HibernateUtil;
import entidade.Versao;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author Mileto
 */
public class VersaoDAO extends DAO {

    Versao versao;

    public ArrayList<Versao> listar(Versao versao) {
        this.versao = versao;
        List resultado = null;

        ArrayList<Versao> lista = new ArrayList<>();
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            String sql = "";
            try {
                if (versao.getProjeto().getId() < 1) {
                    if (versao.getId() == 0) {
                        sql = "from Versao "
                                + "where upper(descricao)  like '" + versao.getDescricao().toUpperCase() + "%' "
                                + "and situacao ='A'"
                                + " order by descricao";
                    } else {
                        sql = "from Versao "
                                + "where id = " + versao.getId()
                                + "and situacao ='A'"
                                + " order by descricao";
                    }
                } else {
                    if (versao.getId() == 0) {
                        sql = "from Versao "
                                + " where upper(descricao)  like '" + versao.getDescricao().toUpperCase() + "%' "
                                + " and id_projeto = " + versao.getProjeto().getId()
                                + " and situacao ='A'"
                                + " order by descricao";
                    } else {
                        sql = "from Versao "
                                + " where id = " + versao.getId()
                                + " and id_projeto =" + versao.getProjeto().getId()
                                + " and situacao ='A'"
                                + " order by descricao";
                    }

                }
            } catch (Exception e) {
                if (versao.getId() == 0) {
                    sql = "from Versao "
                            + "where upper(descricao)  like '" + versao.getDescricao().toUpperCase() + "%' "
                            + "and situacao ='A'"
                            + " order by descricao";
                } else {
                    sql = "from Versao "
                            + "where id = " + versao.getId()
                            + "and situacao ='A'"
                            + " order by descricao";
                }
            }

            String sel = sql;
            System.out.println(sel);
            org.hibernate.Query q = session.createQuery(sql);

            resultado = q.list();

            for (Object o : resultado) {
                Versao ver = ((Versao) ((Object) o));
                lista.add(ver);
            }

        } catch (HibernateException he) {
            he.printStackTrace();
        }
        return lista;
    }

}
