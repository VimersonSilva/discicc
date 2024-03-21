package com.disciplinascc.discicc.Service;

import com.disciplinascc.discicc.Repository.DisciplinaRepository;
import com.disciplinascc.discicc.entities.Disciplina;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DisciplinaService {
    @Autowired
    private DisciplinaRepository disciplinaRepository;

    @Transactional(readOnly = true)
    public List<DisciplinaMinDTO> findAll() {
        List<Disciplina> result = disciplinaRepository.findAll();
        List<DisciplinaMinDTO> dto = result.stream().map(x -> new DisciplinaMinDTO(x)).toList();
        return dto;
    }
}
