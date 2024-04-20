package com.disciplinascc.discicc.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "tb_belonging_periodo")
public class BelongingPeriodo {

    @EmbeddedId
    private BelongingPeriodoPK id = new BelongingPeriodoPK();
    private Integer position;

    public BelongingPeriodo(){}

    public BelongingPeriodo(Disciplina disciplina, PeriodoList periodo, Integer position){
        this.id.setDisciplina(disciplina);
        this.id.setPeriodoList(periodo);
        this.position = position;
    }

    public BelongingPeriodoPK getId() {
        return id;
    }

    public void setId(BelongingPeriodoPK id) {
        this.id = id;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BelongingPeriodo that = (BelongingPeriodo) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
