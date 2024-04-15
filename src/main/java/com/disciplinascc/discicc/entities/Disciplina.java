package com.disciplinascc.discicc.entities;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name = "tb_disciplina")
public class Disciplina implements Serializable {
    @Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private Integer codigoDisciplina;
    private String nomeDisciplina;
    private Integer numPeriodo;
    private Integer quantCreditos;

    //private String tipoDisciplina;

    //private List<Disciplina> preRequisitos;
    private String sigla;

    public Disciplina(){}

    public Disciplina(Integer codigoDisciplina, String nomeDisciplina,
                      Integer numPeriodo, Integer quantCreditos, String sigla){
        this.codigoDisciplina = codigoDisciplina;
        this.nomeDisciplina = nomeDisciplina;
        this.numPeriodo = numPeriodo;
        this.sigla = sigla;
        this.quantCreditos = quantCreditos;
    }

    public Long getId() {
        return id;
    }

    public Integer getCodigoDisciplina() {
        return codigoDisciplina;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public Integer getNumPeriodo() {
        return numPeriodo;
    }

    public Integer getQuantCreditos() {
        return quantCreditos;
    }


    public String getSigla() {
        return sigla;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Disciplina that = (Disciplina) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
