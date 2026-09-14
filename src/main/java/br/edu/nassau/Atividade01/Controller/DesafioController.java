package br.edu.nassau.Atividade01.Controller;

import br.edu.nassau.Atividade01.Service.DesafioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/desafio")
public class DesafioController {

    private final DesafioService desafioService;

    @GetMapping("/curso")
    @ResponseStatus(HttpStatus.OK)
    public String curso() {
        return desafioService.verCurso();
    }
    @GetMapping("/disciplina")
    @ResponseStatus(HttpStatus.OK)
    public String disciplina() {
        return desafioService.verDisciplina();
    }
    @GetMapping("/aluno")
    @ResponseStatus(HttpStatus.OK)
    public String aluno() {
        return desafioService.verAluno();
    }
}
