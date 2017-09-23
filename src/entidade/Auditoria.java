package entidade;
// Generated 22/09/2017 22:10:23 by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Auditoria generated by hbm2java
 */
@Entity
@Table(name="auditoria"
    ,schema="public"
)
public class Auditoria  implements java.io.Serializable {


     private long id;
     private int idUsuario;
     private String tabela;
     private Date dataHora;
     private Character tipo;
     private String ordem;
     private String campos;

    public Auditoria() {
    }

	
    public Auditoria(long id, int idUsuario, String tabela) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.tabela = tabela;
    }
    public Auditoria(long id, int idUsuario, String tabela, Date dataHora, Character tipo, String ordem, String campos) {
       this.id = id;
       this.idUsuario = idUsuario;
       this.tabela = tabela;
       this.dataHora = dataHora;
       this.tipo = tipo;
       this.ordem = ordem;
       this.campos = campos;
    }
   
     @Id 

    
    @Column(name="id", nullable=false)
    public long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }

    
    @Column(name="id_usuario", nullable=false)
    public int getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    
    @Column(name="tabela", nullable=false, length=100)
    public String getTabela() {
        return this.tabela;
    }
    
    public void setTabela(String tabela) {
        this.tabela = tabela;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="data_hora", length=29)
    public Date getDataHora() {
        return this.dataHora;
    }
    
    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    
    @Column(name="tipo", length=1)
    public Character getTipo() {
        return this.tipo;
    }
    
    public void setTipo(Character tipo) {
        this.tipo = tipo;
    }

    
    @Column(name="ordem")
    public String getOrdem() {
        return this.ordem;
    }
    
    public void setOrdem(String ordem) {
        this.ordem = ordem;
    }

    
    @Column(name="campos")
    public String getCampos() {
        return this.campos;
    }
    
    public void setCampos(String campos) {
        this.campos = campos;
    }




}


