package com.disciplinascc.discicc.Service;

import com.disciplinascc.discicc.DTO.DisciplinaDTO;
import com.disciplinascc.discicc.Repository.DisciplinaRepository;
import com.disciplinascc.discicc.entities.Disciplina;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DisciplinaBuscaTodosService implements DisciplinaBuscaTodosServiceInterface {
    @Autowired
    private DisciplinaRepository disciplinaRepository;

    @Override
    @Transactional(readOnly = true)
    public List<DisciplinaDTO> findAll() {
        List<Disciplina> result = disciplinaRepository.findAll();
        List<DisciplinaDTO> dto = result.stream().map(x -> new DisciplinaDTO(x)).toList();
        return dto;
    }
}
