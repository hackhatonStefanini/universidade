package projetouniversidade.maven.hackatoon.entidades.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import projetouniversidade.maven.hackatoon.entidades.Curso;

public interface CursoRepositorio extends JpaRepository<Curso, Long> {
}
