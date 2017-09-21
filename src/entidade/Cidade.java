package entidade;
// Generated 20/09/2017 22:24:06 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Cidade generated by hbm2java
 */
public class Cidade  implements java.io.Serializable {


     private int id;
     private String descricao;
     private char situacao;
     private Set clientes = new HashSet(0);

    public Cidade() {
    }

	
    public Cidade(int id, char situacao) {
        this.id = id;
        this.situacao = situacao;
    }
    public Cidade(int id, String descricao, char situacao, Set clientes) {
       this.id = id;
       this.descricao = descricao;
       this.situacao = situacao;
       this.clientes = clientes;
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
    public Set getClientes() {
        return this.clientes;
    }
    
    public void setClientes(Set clientes) {
        this.clientes = clientes;
    }




}


