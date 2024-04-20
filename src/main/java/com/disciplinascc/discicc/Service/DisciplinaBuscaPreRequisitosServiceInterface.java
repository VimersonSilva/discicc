package com.disciplinascc.discicc.Service;

import com.disciplinascc.discicc.DTO.DisciplinaDTO;

import java.util.List;

public interface DisciplinaBuscaPreRequisitosServiceInterface {
    List<DisciplinaDTO> buscaPreRequisitos(Long idDisciplina);
}
