package br.edu.nassau.Atividade01.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "alunos")
public class CursoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private Integer cargaHr;

    public Integer getCargaHr() {
        return cargaHr;
    }

    public void setCargaHr(Integer cargaHr) {
        this.cargaHr = cargaHr;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
