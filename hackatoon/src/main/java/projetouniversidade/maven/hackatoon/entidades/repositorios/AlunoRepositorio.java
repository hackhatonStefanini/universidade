package projetouniversidade.maven.hackatoon.entidades.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import projetouniversidade.maven.hackatoon.entidades.Aluno;

public interface AlunoRepositorio extends JpaRepository<Aluno, Long> {

}
