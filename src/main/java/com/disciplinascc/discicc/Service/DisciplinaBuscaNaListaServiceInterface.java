package com.disciplinascc.discicc.Service;

import com.disciplinascc.discicc.DTO.DisciplinaDTO;

import java.util.List;

public interface DisciplinaBuscaNaListaServiceInterface {

    public List<DisciplinaDTO> findByList(Long listId);
}
