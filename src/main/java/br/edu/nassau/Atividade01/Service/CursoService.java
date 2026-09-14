package br.edu.nassau.Atividade01.Service;

import br.edu.nassau.Atividade01.Model.CursoEntity;
import br.edu.nassau.Atividade01.Repository.ICursoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursoService {

    private final ICursoRepository cursoRepository;

    private CursoService(ICursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    //Service para buscar todos os cursos
    public List<CursoEntity> list() {
        return this.cursoRepository.findAll();
    }

    //Service para buscar pelo ID
    public Optional<CursoEntity> findID(long id) {
        return this.cursoRepository.findById(id);
    }

    //Service de criar uma curso
    public void save(CursoEntity cursoEntity) {
        if (cursoEntity.getNome() == null || cursoEntity.getNome().isBlank()) {
            throw new RuntimeException("O nome estar vazio!");
        } else if (this.cursoRepository.existsByNome(cursoEntity.getNome())) {
            throw new RuntimeException("Ja existe esse curso!");
        }
        this.cursoRepository.save(cursoEntity);
    }
    //Service de troca
    public void troca(long id, CursoEntity cursoNovo) {
        CursoEntity cursoEntity = this.cursoRepository.findById(id)
            .orElseThrow(()-> new RuntimeException("Id não encontrado"));

        cursoEntity.setNome(cursoNovo.getNome());
        cursoEntity.setCargaHr(cursoNovo.getCargaHr());

        this.cursoRepository.save(cursoEntity);
    }

    //Service de deletar curso
    public void clear(long id) {
        this.cursoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Id não encontrado"));

        this.cursoRepository.deleteById(id);
    }
}

