package com.disciplinascc.discicc.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "belonging_periodo")
public class BelongingPeriodo {

    @EmbeddedId
    private BelongingPK id = new BelonginPK();
    private Integer position;

    public BelongingPeriodo(){}

    public BelongingPeriodo(Disciplina dsiciplina, PeriodoList periodo, Integer position){
        this.id.setDisciplina(disciplina);
        this.id.setPeriodoList(periodo);
        this.position = position;
    }
}