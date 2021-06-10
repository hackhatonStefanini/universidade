package projetouniversidade.maven.hackatoon.entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "alunos")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "turmaId")
    @JsonIgnore
    private Turma turma;

    private String cpf;

    private String endereco;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "cursoId")
    @JsonIgnore
    private Curso curso;

    private String matricula;

    public Aluno(Long id, String nome, Turma turma, String cpf, String endereco, Curso curso, String matricula) {
        this.id = id;
        this.nome = nome;
        this.turma = turma;
        this.cpf = cpf;
        this.endereco = endereco;
        this.curso = curso;
        this.matricula = matricula;
    }

    public Aluno() {

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

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

}
