package projetouniversidade.maven.hackatoon.implementacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projetouniversidade.maven.hackatoon.entidades.Disciplina;
import projetouniversidade.maven.hackatoon.entidades.repositorios.CursoRepositorio;
import projetouniversidade.maven.hackatoon.services.CursoService;



@Service
public class CursoImplementacao implements CursoService {

    @Autowired
    private CursoRepositorio cursoRepositorio;

//    @Autowired
//    private Disciplina disciplina;

//    @Override
//    public int duracaoTotal(List<Disciplina> disciplinas) {
//
//        //return disciplinas.stream().map(disciplina::getTotalHorasDisciplina).reduce(0, (acumulado, atual) -> acumulado+atual);
//        return -1;
//    }
}
