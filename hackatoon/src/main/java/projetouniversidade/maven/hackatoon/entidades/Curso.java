package projetouniversidade.maven.hackatoon.entidades;

import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "cursos")
@Data
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long codigoCurso;

    private Long totalHorasDoCurso;

}
