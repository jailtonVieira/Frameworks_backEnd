package br.edu.nassau.Atividade01.Controller;

import br.edu.nassau.Atividade01.Model.CursoEntity;
import br.edu.nassau.Atividade01.Service.CursoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cursos")
public class CursoController {
    private final CursoService cursoService;

    private CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<CursoEntity> lista() {
        return this.cursoService.list();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<CursoEntity> procuraID(@PathVariable long id) {
        return this.cursoService.findID(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void criar(@RequestBody CursoEntity curso) {
        this.cursoService.save(curso);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void atualizar(@PathVariable long id, @RequestBody CursoEntity curso) {
         this.cursoService.troca(id, curso);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable long id) {
        this.cursoService.clear(id);
    }


}
