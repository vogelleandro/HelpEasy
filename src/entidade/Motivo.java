package entidade;
// Generated 15/09/2017 21:15:41 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Motivo generated by hbm2java
 */
public class Motivo  implements java.io.Serializable {


     private int id;
     private String descricao;
     private char situacao;
     private Set tarefas = new HashSet(0);

    public Motivo() {
    }

	
    public Motivo(int id, String descricao, char situacao) {
        this.id = id;
        this.descricao = descricao;
        this.situacao = situacao;
    }
    public Motivo(int id, String descricao, char situacao, Set tarefas) {
       this.id = id;
       this.descricao = descricao;
       this.situacao = situacao;
       this.tarefas = tarefas;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public char getSituacao() {
        return this.situacao;
    }
    
    public void setSituacao(char situacao) {
        this.situacao = situacao;
    }
    public Set getTarefas() {
        return this.tarefas;
    }
    
    public void setTarefas(Set tarefas) {
        this.tarefas = tarefas;
    }




}


