package com.disciplinascc.discicc.entities;

import org.springframework.data.annotation.Id;

public class Disciplina {
    private Long idCodigoDisciplina;
    private String nomeDisciplina;
    private Integer numPeriodo;
    private Integer quantCreditos;

    //private String tipoDisciplina;

    private String[] preRequisitos;
    private String sigla;

}
