package entidade;
// Generated 22/09/2017 22:10:23 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Usuario generated by hbm2java
 */
@Entity
@Table(name="usuario"
    ,schema="public"
)
public class Usuario  implements java.io.Serializable {


     private int id;
     private String nome;
     private String login;
     private String senha;
     private char situacao;
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
    public Usuario(int id, String nome, String login, String senha, char situacao, Set usuarioPermissaoTelas, Set tarefaUsuarios, Set tarefasForIdUsuarioResponsavel, Set tarefasForIdUsuarioAutor) {
       this.id = id;
       this.nome = nome;
       this.login = login;
       this.senha = senha;
       this.situacao = situacao;
       this.usuarioPermissaoTelas = usuarioPermissaoTelas;
       this.tarefaUsuarios = tarefaUsuarios;
       this.tarefasForIdUsuarioResponsavel = tarefasForIdUsuarioResponsavel;
       this.tarefasForIdUsuarioAutor = tarefasForIdUsuarioAutor;
    }
   
     @Id 

    
    @Column(name="id", nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="nome", nullable=false, length=150)
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    @Column(name="login", unique=true, nullable=false, length=100)
    public String getLogin() {
        return this.login;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }

    
    @Column(name="senha", nullable=false, length=45)
    public String getSenha() {
        return this.senha;
    }
    
    public void setSenha(String senha) {
        this.senha = senha;
    }

    
    @Column(name="situacao", nullable=false, length=1)
    public char getSituacao() {
        return this.situacao;
    }
    
    public void setSituacao(char situacao) {
        this.situacao = situacao;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="usuario")
    public Set getUsuarioPermissaoTelas() {
        return this.usuarioPermissaoTelas;
    }
    
    public void setUsuarioPermissaoTelas(Set usuarioPermissaoTelas) {
        this.usuarioPermissaoTelas = usuarioPermissaoTelas;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="usuario")
    public Set getTarefaUsuarios() {
        return this.tarefaUsuarios;
    }
    
    public void setTarefaUsuarios(Set tarefaUsuarios) {
        this.tarefaUsuarios = tarefaUsuarios;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="usuarioByIdUsuarioResponsavel")
    public Set getTarefasForIdUsuarioResponsavel() {
        return this.tarefasForIdUsuarioResponsavel;
    }
    
    public void setTarefasForIdUsuarioResponsavel(Set tarefasForIdUsuarioResponsavel) {
        this.tarefasForIdUsuarioResponsavel = tarefasForIdUsuarioResponsavel;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="usuarioByIdUsuarioAutor")
    public Set getTarefasForIdUsuarioAutor() {
        return this.tarefasForIdUsuarioAutor;
    }
    
    public void setTarefasForIdUsuarioAutor(Set tarefasForIdUsuarioAutor) {
        this.tarefasForIdUsuarioAutor = tarefasForIdUsuarioAutor;
    }




}


