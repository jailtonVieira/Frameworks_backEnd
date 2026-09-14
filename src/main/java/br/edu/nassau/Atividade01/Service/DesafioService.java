package br.edu.nassau.Atividade01.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DesafioService {

    public String verCurso() {
        return "Ciência da Computação";
    }
    public String verDisciplina() {
        return "Back-End Frameworks";
    }
    public String verAluno() {
        return "Aluno matriculado em Back-End Frameworks";
    }
}
