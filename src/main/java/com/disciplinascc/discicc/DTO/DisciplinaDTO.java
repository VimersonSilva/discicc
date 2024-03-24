package com.disciplinascc.discicc.DTO;

import com.disciplinascc.discicc.entities.Disciplina;
import org.springframework.beans.BeanUtils;

public class DisciplinaDTO {

    private Long idCodigoDisciplina;
    private String nomeDisciplina;
    private Integer numPeriodo;
    private Integer quantCreditos;

    //private String tipoDisciplina;

    private String[] preRequisitos;
    private String sigla;

    public DisciplinaDTO(Disciplina disciplina){
        BeanUtils.copyProperties(disciplina, this);
    }

    public Long getIdCodigoDisciplina() {
        return idCodigoDisciplina;
    }

    public void setIdCodigoDisciplina(Long idCodigoDisciplina) {
        this.idCodigoDisciplina = idCodigoDisciplina;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public Integer getNumPeriodo() {
        return numPeriodo;
    }

    public void setNumPeriodo(Integer numPeriodo) {
        this.numPeriodo = numPeriodo;
    }

    public Integer getQuantCreditos() {
        return quantCreditos;
    }

    public void setQuantCreditos(Integer quantCreditos) {
        this.quantCreditos = quantCreditos;
    }

    public String[] getPreRequisitos() {
        return preRequisitos;
    }

    public void setPreRequisitos(String[] preRequisitos) {
        this.preRequisitos = preRequisitos;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
}
