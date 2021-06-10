package projetouniversidade.maven.hackatoon.entidades.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import projetouniversidade.maven.hackatoon.entidades.Disciplina;

public interface DisciplinaRepositorio extends JpaRepository<Disciplina, Long> {
}
