package com.disciplinascc.discicc.DTO;

import com.disciplinascc.discicc.entities.PeriodoList;

public class PeriodoListDTO {

    private Long id;
    private String nomePeriodo;

    public PeriodoListDTO(PeriodoList periodoList){
        this.id = periodoList.getId();
        this.nomePeriodo = periodoList.getNomePeriodo();
    }
}
