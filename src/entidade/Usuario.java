package entidade;
// Generated 17/10/2017 22:28:34 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private int id;
     private String nome;
     private String login;
     private String senha;
     private char situacao;
     private Set auditorias = new HashSet(0);
     private Set usuarioPermissaoTelas = new HashSet(0);
     private Set tarefaUsuarios = new HashSet(0);
     private Set tarefasForIdUsuarioResponsavel = new HashSet(0);
     private Set tarefasForIdUsuarioAutor = new HashSet(0);

    public Usuario() {
    }

	
    public Usuario(int id, String nome, String login, String senha, char situacao) {
        this.id = id;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.situacao = situacao;
    }
    public Usuario(int id, String nome, String login, String senha, char situacao, Set auditorias, Set usuarioPermissaoTelas, Set tarefaUsuarios, Set tarefasForIdUsuarioResponsavel, Set tarefasForIdUsuarioAutor) {
       this.id = id;
       this.nome = nome;
       this.login = login;
       this.senha = senha;
       this.situacao = situacao;
       this.auditorias = auditorias;
       this.usuarioPermissaoTelas = usuarioPermissaoTelas;
       this.tarefaUsuarios = tarefaUsuarios;
       this.tarefasForIdUsuarioResponsavel = tarefasForIdUsuarioResponsavel;
       this.tarefasForIdUsuarioAutor = tarefasForIdUsuarioAutor;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getLogin() {
        return this.login;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }
    public String getSenha() {
        return this.senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public char getSituacao() {
        return this.situacao;
    }
    
    public void setSituacao(char situacao) {
        this.situacao = situacao;
    }
    public Set getAuditorias() {
        return this.auditorias;
    }
    
    public void setAuditorias(Set auditorias) {
        this.auditorias = auditorias;
    }
    public Set getUsuarioPermissaoTelas() {
        return this.usuarioPermissaoTelas;
    }
    
    public void setUsuarioPermissaoTelas(Set usuarioPermissaoTelas) {
        this.usuarioPermissaoTelas = usuarioPermissaoTelas;
    }
    public Set getTarefaUsuarios() {
        return this.tarefaUsuarios;
    }
    
    public void setTarefaUsuarios(Set tarefaUsuarios) {
        this.tarefaUsuarios = tarefaUsuarios;
    }
    public Set getTarefasForIdUsuarioResponsavel() {
        return this.tarefasForIdUsuarioResponsavel;
    }
    
    public void setTarefasForIdUsuarioResponsavel(Set tarefasForIdUsuarioResponsavel) {
        this.tarefasForIdUsuarioResponsavel = tarefasForIdUsuarioResponsavel;
    }
    public Set getTarefasForIdUsuarioAutor() {
        return this.tarefasForIdUsuarioAutor;
    }
    
    public void setTarefasForIdUsuarioAutor(Set tarefasForIdUsuarioAutor) {
        this.tarefasForIdUsuarioAutor = tarefasForIdUsuarioAutor;
    }




}


