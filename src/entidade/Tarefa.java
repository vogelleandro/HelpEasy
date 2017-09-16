package entidade;
// Generated 15/09/2017 21:15:41 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Tarefa generated by hbm2java
 */
public class Tarefa  implements java.io.Serializable {


     private int id;
     private Cliente cliente;
     private Fase fase;
     private Modulo modulo;
     private Motivo motivo;
     private Prioridade prioridade;
     private Projeto projeto;
     private Usuario usuarioByIdUsuarioResponsavel;
     private Usuario usuarioByIdUsuarioAutor;
     private Versao versaoByIdVersaoCorrecao;
     private Versao versaoByIdVersaoBug;
     private String titulo;
     private String descricao;
     private Date datahoraCriacao;
     private Date datahoraPrevisao;
     private Date datahoraConclusao;
     private char situacao;
     private Set movimentoTarefas = new HashSet(0);
     private Set tarefaUsuarios = new HashSet(0);

    public Tarefa() {
    }

	
    public Tarefa(int id, Cliente cliente, Fase fase, Modulo modulo, Motivo motivo, Prioridade prioridade, Projeto projeto, Usuario usuarioByIdUsuarioResponsavel, Usuario usuarioByIdUsuarioAutor, Versao versaoByIdVersaoCorrecao, Versao versaoByIdVersaoBug, String titulo, Date datahoraCriacao, Date datahoraPrevisao, char situacao) {
        this.id = id;
        this.cliente = cliente;
        this.fase = fase;
        this.modulo = modulo;
        this.motivo = motivo;
        this.prioridade = prioridade;
        this.projeto = projeto;
        this.usuarioByIdUsuarioResponsavel = usuarioByIdUsuarioResponsavel;
        this.usuarioByIdUsuarioAutor = usuarioByIdUsuarioAutor;
        this.versaoByIdVersaoCorrecao = versaoByIdVersaoCorrecao;
        this.versaoByIdVersaoBug = versaoByIdVersaoBug;
        this.titulo = titulo;
        this.datahoraCriacao = datahoraCriacao;
        this.datahoraPrevisao = datahoraPrevisao;
        this.situacao = situacao;
    }
    public Tarefa(int id, Cliente cliente, Fase fase, Modulo modulo, Motivo motivo, Prioridade prioridade, Projeto projeto, Usuario usuarioByIdUsuarioResponsavel, Usuario usuarioByIdUsuarioAutor, Versao versaoByIdVersaoCorrecao, Versao versaoByIdVersaoBug, String titulo, String descricao, Date datahoraCriacao, Date datahoraPrevisao, Date datahoraConclusao, char situacao, Set movimentoTarefas, Set tarefaUsuarios) {
       this.id = id;
       this.cliente = cliente;
       this.fase = fase;
       this.modulo = modulo;
       this.motivo = motivo;
       this.prioridade = prioridade;
       this.projeto = projeto;
       this.usuarioByIdUsuarioResponsavel = usuarioByIdUsuarioResponsavel;
       this.usuarioByIdUsuarioAutor = usuarioByIdUsuarioAutor;
       this.versaoByIdVersaoCorrecao = versaoByIdVersaoCorrecao;
       this.versaoByIdVersaoBug = versaoByIdVersaoBug;
       this.titulo = titulo;
       this.descricao = descricao;
       this.datahoraCriacao = datahoraCriacao;
       this.datahoraPrevisao = datahoraPrevisao;
       this.datahoraConclusao = datahoraConclusao;
       this.situacao = situacao;
       this.movimentoTarefas = movimentoTarefas;
       this.tarefaUsuarios = tarefaUsuarios;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Fase getFase() {
        return this.fase;
    }
    
    public void setFase(Fase fase) {
        this.fase = fase;
    }
    public Modulo getModulo() {
        return this.modulo;
    }
    
    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }
    public Motivo getMotivo() {
        return this.motivo;
    }
    
    public void setMotivo(Motivo motivo) {
        this.motivo = motivo;
    }
    public Prioridade getPrioridade() {
        return this.prioridade;
    }
    
    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }
    public Projeto getProjeto() {
        return this.projeto;
    }
    
    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }
    public Usuario getUsuarioByIdUsuarioResponsavel() {
        return this.usuarioByIdUsuarioResponsavel;
    }
    
    public void setUsuarioByIdUsuarioResponsavel(Usuario usuarioByIdUsuarioResponsavel) {
        this.usuarioByIdUsuarioResponsavel = usuarioByIdUsuarioResponsavel;
    }
    public Usuario getUsuarioByIdUsuarioAutor() {
        return this.usuarioByIdUsuarioAutor;
    }
    
    public void setUsuarioByIdUsuarioAutor(Usuario usuarioByIdUsuarioAutor) {
        this.usuarioByIdUsuarioAutor = usuarioByIdUsuarioAutor;
    }
    public Versao getVersaoByIdVersaoCorrecao() {
        return this.versaoByIdVersaoCorrecao;
    }
    
    public void setVersaoByIdVersaoCorrecao(Versao versaoByIdVersaoCorrecao) {
        this.versaoByIdVersaoCorrecao = versaoByIdVersaoCorrecao;
    }
    public Versao getVersaoByIdVersaoBug() {
        return this.versaoByIdVersaoBug;
    }
    
    public void setVersaoByIdVersaoBug(Versao versaoByIdVersaoBug) {
        this.versaoByIdVersaoBug = versaoByIdVersaoBug;
    }
    public String getTitulo() {
        return this.titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Date getDatahoraCriacao() {
        return this.datahoraCriacao;
    }
    
    public void setDatahoraCriacao(Date datahoraCriacao) {
        this.datahoraCriacao = datahoraCriacao;
    }
    public Date getDatahoraPrevisao() {
        return this.datahoraPrevisao;
    }
    
    public void setDatahoraPrevisao(Date datahoraPrevisao) {
        this.datahoraPrevisao = datahoraPrevisao;
    }
    public Date getDatahoraConclusao() {
        return this.datahoraConclusao;
    }
    
    public void setDatahoraConclusao(Date datahoraConclusao) {
        this.datahoraConclusao = datahoraConclusao;
    }
    public char getSituacao() {
        return this.situacao;
    }
    
    public void setSituacao(char situacao) {
        this.situacao = situacao;
    }
    public Set getMovimentoTarefas() {
        return this.movimentoTarefas;
    }
    
    public void setMovimentoTarefas(Set movimentoTarefas) {
        this.movimentoTarefas = movimentoTarefas;
    }
    public Set getTarefaUsuarios() {
        return this.tarefaUsuarios;
    }
    
    public void setTarefaUsuarios(Set tarefaUsuarios) {
        this.tarefaUsuarios = tarefaUsuarios;
    }




}


