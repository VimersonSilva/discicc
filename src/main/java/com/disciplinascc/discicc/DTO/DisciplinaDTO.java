package com.disciplinascc.discicc.DTO;

import com.disciplinascc.discicc.entities.Disciplina;
import com.disciplinascc.discicc.projections.DisciplinaProjection;
import org.springframework.beans.BeanUtils;

import java.util.List;

public class DisciplinaDTO {

    private Long id;
    private Integer codigoDisciplina;
    private String nomeDisciplina;
    private Integer numPeriodo;
    private Integer quantCreditos;
    private String sigla;

    //private String tipoDisciplina;

    private List<DisciplinaDTO> preRequisitos;


    public DisciplinaDTO(DisciplinaProjection disciplinaProjection){
        this.id = disciplinaProjection.getId();
        this.codigoDisciplina = disciplinaProjection.getCodigoDisciplina();
        this.nomeDisciplina = disciplinaProjection.getNomeDisciplina();
        this.numPeriodo = disciplinaProjection.getNumPeriodo();
        this.quantCreditos = disciplinaProjection.getQuantCreditos();
        this.sigla = disciplinaProjection.getSigla();
    }
    public DisciplinaDTO(Disciplina disciplina){
        BeanUtils.copyProperties(disciplina, this);
    }

    public Integer getCodigoDisciplina() {
        return codigoDisciplina;
    }

    public void setCodigoDisciplina(Integer codigoDisciplina) {
        this.codigoDisciplina = codigoDisciplina;
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

    public List<DisciplinaDTO> getPreRequisitos() {
        return preRequisitos;
    }

    public void setPreRequisitos(List<DisciplinaDTO> preRequisitos) {
        this.preRequisitos = preRequisitos;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
}
