package com.disciplinascc.discicc.Service;

import com.disciplinascc.discicc.DTO.DisciplinaDTO;

@FunctionalInterface
public interface DisciplinaServiceInterface {
    DisciplinaDTO findById(Long idCodigoDisciplina);
}
