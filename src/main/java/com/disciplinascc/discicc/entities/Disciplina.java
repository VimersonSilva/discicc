package com.disciplinascc.discicc.entities;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.springframework.data.annotation.Id;

@Entity
@Table(name = "tb_disciplina")
public class Disciplina {
    @Id
    private Long idCodigoDisciplina;
    private String nomeDisciplina;
    private Integer numPeriodo;
    private Integer quantCreditos;

    //private String tipoDisciplina;

    private List<Disciplina> preRequisitos;
    private String sigla;

    public Disciplina(){}

    public Disciplina(Long idCodigoDisciplina, String nomeDisciplina,
                      Integer numPeriodo, Integer quantCreditos, String sigla){
        this.idCodigoDisciplina = idCodigoDisciplina;
        this.nomeDisciplina = nomeDisciplina;
        this.numPeriodo = numPeriodo;
        this.sigla = sigla;
        this.quantCreditos = quantCreditos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Disciplina that = (Disciplina) o;
        return Objects.equals(idCodigoDisciplina, that.idCodigoDisciplina);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCodigoDisciplina);
    }
}
