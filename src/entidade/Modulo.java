package entidade;
// Generated 07/08/2017 21:08:37 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Modulo generated by hbm2java
 */
public class Modulo  implements java.io.Serializable {


     private int id;
     private Projeto projeto;
     private String descricao;
     private char situacao;
     private Set tarefas = new HashSet(0);

    public Modulo() {
    }

	
    public Modulo(int id, Projeto projeto, String descricao, char situacao) {
        this.id = id;
        this.projeto = projeto;
        this.descricao = descricao;
        this.situacao = situacao;
    }
    public Modulo(int id, Projeto projeto, String descricao, char situacao, Set tarefas) {
       this.id = id;
       this.projeto = projeto;
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
    public Projeto getProjeto() {
        return this.projeto;
    }
    
    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
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

