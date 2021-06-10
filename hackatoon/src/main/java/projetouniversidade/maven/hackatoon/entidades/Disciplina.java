package projetouniversidade.maven.hackatoon.entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
@Table(name = "disciplinas")
@Entity
public class Disciplina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private Long codigoDisciplina;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "disciplinaId")
    @JsonIgnore
    private Turma turma;
    private String conteudoProgramatico;
    private int numeroDeCreditos;
    private int totalHorasDisciplina;

    public Disciplina(Long id, String nome, Long codigoDisciplina, Turma turma, String conteudoProgramatico, int numeroDeCreditos, int totalHorasDisciplina) {
        this.id = id;
        this.nome = nome;
        this.codigoDisciplina = codigoDisciplina;
        this.turma = turma;
        this.conteudoProgramatico = conteudoProgramatico;
        this.numeroDeCreditos = numeroDeCreditos;
        this.totalHorasDisciplina = totalHorasDisciplina;
    }

    public Disciplina() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCodigoDisciplina() {
        return codigoDisciplina;
    }

    public void setCodigoDisciplina(Long codigoDisciplina) {
        this.codigoDisciplina = codigoDisciplina;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public String getConteudoProgramatico() {
        return conteudoProgramatico;
    }

    public void setConteudoProgramatico(String conteudoProgramatico) {
        this.conteudoProgramatico = conteudoProgramatico;
    }

    public int getNumeroDeCreditos() {
        return numeroDeCreditos;
    }

    public void setNumeroDeCreditos(int numeroDeCreditos) {
        this.numeroDeCreditos = numeroDeCreditos;
    }

    public int getTotalHorasDisciplina() {
        return totalHorasDisciplina;
    }

    public void setTotalHorasDisciplina(int totalHorasDisciplina) {
        this.totalHorasDisciplina = totalHorasDisciplina;
    }

}
