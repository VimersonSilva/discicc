package com.disciplinascc.discicc.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

@Embeddable
public class BelongingPeriodoPK {
    @ManyToOne
    @JoinColumn(name = "disciplina_id")
    private Disciplina disciplina;

    @ManyToOne
    @JoinColumn(name = "list_id")
    private PeriodoList periodoList;

    public BelongingPeriodoPK(){}

    public BelongingPeriodoPK(Disciplina disciplina, PeriodoList periodoList){
        this.disciplina = disciplina;
        this.periodoList = periodoList;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public PeriodoList getPeriodoList() {
        return periodoList;
    }

    public void setPeriodoList(PeriodoList periodoList) {
        this.periodoList = periodoList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BelongingPeriodoPK that = (BelongingPeriodoPK) o;
        return Objects.equals(disciplina, that.disciplina) && Objects.equals(periodoList, that.periodoList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(disciplina, periodoList);
    }
}
