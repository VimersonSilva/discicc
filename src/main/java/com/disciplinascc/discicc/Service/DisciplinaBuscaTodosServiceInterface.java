package com.disciplinascc.discicc.Service;

import com.disciplinascc.discicc.DTO.DisciplinaDTO;

import java.util.List;

@FunctionalInterface
public interface DisciplinaBuscaTodosServiceInterface {
    List<DisciplinaDTO> findAll();
}
