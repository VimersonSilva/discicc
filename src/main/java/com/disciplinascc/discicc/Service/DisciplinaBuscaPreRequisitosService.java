package com.disciplinascc.discicc.Service;

import com.disciplinascc.discicc.DTO.DisciplinaDTO;
import com.disciplinascc.discicc.Repository.DisciplinaRepository;
import com.disciplinascc.discicc.entities.Disciplina;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisciplinaBuscaPreRequisitosService implements DisciplinaBuscaPreRequisitosServiceInterface{

    @Autowired
    DisciplinaRepository disciplinaRepository;

    public List<DisciplinaDTO> buscaPreRequisitos(Long idDisciplina){
        Disciplina result = disciplinaRepository.findById(idDisciplina).get();
        List<DisciplinaDTO> requisitos = result.getPreRequisitos().stream().map(x -> new DisciplinaDTO(x)).toList();
        return requisitos;
    }
}
