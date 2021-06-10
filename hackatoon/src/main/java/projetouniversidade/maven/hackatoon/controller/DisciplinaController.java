package projetouniversidade.maven.hackatoon.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projetouniversidade.maven.hackatoon.entidades.Disciplina;
import projetouniversidade.maven.hackatoon.entidades.repositorios.DisciplinaRepositorio;
import projetouniversidade.maven.hackatoon.services.CursoService;
import projetouniversidade.maven.hackatoon.services.DisciplinaService;

import java.util.List;

@RestController
@RequestMapping("/disciplina")
@RequiredArgsConstructor
public class DisciplinaController {

    private DisciplinaRepositorio disciplinaRepository;
    private CursoService cursoService;

//    @PostMapping("/")
//    ResponseEntity createDisciplina(@RequestBody Disciplina disciplinaBody) {
//        try {
//           disciplinaBody.setTotalHorasDisciplina(cursoService.duracaoTotal(disciplinaBody));
//           Disciplina disciplina = disciplinaRepository.save(cursoService.duracaoTotal(disciplinaBody));
//           return ResponseEntity.status(HttpStatus.CREATED).body(disciplina);
//        } catch (Exception ex) {
//            return ResponseEntity.badRequest().body(ex.getMessage());
//        }
//    }









}
