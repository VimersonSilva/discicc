package com.disciplinascc.discicc.entities;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.*;

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
    @ManyToMany(cascade=CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "disciplina_prerequisito",
            joinColumns = @JoinColumn(name = "disciplina_id"),
            inverseJoinColumns = @JoinColumn(name="prerequisito_id")
    )
    private List<Disciplina> preRequisitos;
    private String sigla;

    public Disciplina(){}

    public Disciplina(Integer codigoDisciplina, String nomeDisciplina,
                      Integer numPeriodo, Integer quantCreditos,List<Disciplina> preRequisitos, String sigla){
        this.codigoDisciplina = codigoDisciplina;
        this.nomeDisciplina = nomeDisciplina;
        this.preRequisitos = preRequisitos;
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

    public List<Disciplina> getPreRequisitos() {
        return preRequisitos;
    }

    public void setPreRequisitos(List<Disciplina> preRequisitos) {
        this.preRequisitos = preRequisitos;
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
