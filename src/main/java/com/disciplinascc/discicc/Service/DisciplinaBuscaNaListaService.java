package com.disciplinascc.discicc.Service;

import com.disciplinascc.discicc.Repository.DisciplinaRepository;
import com.disciplinascc.discicc.projections.DisciplinaProjection;
import com.disciplinascc.discicc.DTO.DisciplinaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DisciplinaBuscaNaListaService implements DisciplinaBuscaNaListaServiceInterface{
    @Autowired
    private DisciplinaRepository disciplinaRepository;

    @Transactional(readOnly = true)
    public List<DisciplinaDTO> findByList(Long listId){
        List<DisciplinaProjection> result = disciplinaRepository.searchByList(listId);
        List<DisciplinaDTO> dto = result.stream().map(x -> new DisciplinaDTO(x)).toList();
        return dto;
    }
}
