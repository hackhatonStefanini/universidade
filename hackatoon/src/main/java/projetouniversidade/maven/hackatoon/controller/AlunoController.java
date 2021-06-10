package projetouniversidade.maven.hackatoon.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projetouniversidade.maven.hackatoon.entidades.Aluno;
import projetouniversidade.maven.hackatoon.entidades.Disciplina;
import projetouniversidade.maven.hackatoon.entidades.repositorios.AlunoRepositorio;
import projetouniversidade.maven.hackatoon.services.AlunoService;

@RestController
@RequestMapping("/aluno")
@RequiredArgsConstructor
public class AlunoController {
    @Autowired
    private AlunoService alunoService;

    @Autowired
    private AlunoRepositorio alunoRepositorio;

    @PostMapping("/")
    ResponseEntity createDisciplina(@RequestBody Aluno aluno) {
        if (!alunoService.ownerCpfValidation(aluno.getCpf())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("CPF: " + aluno.getCpf() + " é inválido!");
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(alunoRepositorio.save(aluno));
    }

    @GetMapping("/listar-alunos")
    public Page<Aluno> listarAlunos(final Pageable page) {
        return alunoRepositorio.findAll(page);
    }

}




