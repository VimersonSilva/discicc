package com.disciplinascc.discicc.projections;

public interface DisciplinaProjection {

    Long getId();
    Integer getCodigoDisciplina();
    String getNomeDisciplina();

    Integer getNumPeriodo();

    Integer getQuantCreditos();

    String getSigla();

    Integer getPosition();
}
