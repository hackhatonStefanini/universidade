package projetouniversidade.maven.hackatoon.entidades.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import projetouniversidade.maven.hackatoon.entidades.Turma;

public interface TurmaRepositorio extends JpaRepository<Turma, Long> {
}
