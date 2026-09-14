package br.edu.nassau.Atividade01.Repository;

import br.edu.nassau.Atividade01.Model.CursoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICursoRepository extends JpaRepository<CursoEntity, Long> {

    Boolean existsByNome(String nome);
}
