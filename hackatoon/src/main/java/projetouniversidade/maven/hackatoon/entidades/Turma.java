package projetouniversidade.maven.hackatoon.entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Table(name = "turmas")
@Entity
@Data
public class Turma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "turma")
    @JsonIgnore
    private List<Aluno> alunos;

    @OneToMany(mappedBy = "turma")
    @JsonIgnore
    private List<Disciplina> disciplinas;

    private int ano;

}
