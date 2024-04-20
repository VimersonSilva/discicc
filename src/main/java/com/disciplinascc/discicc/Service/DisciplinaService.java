package com.disciplinascc.discicc.Service;
import com.disciplinascc.discicc.entities.Disciplina;
import com.disciplinascc.discicc.DTO.DisciplinaDTO;
import com.disciplinascc.discicc.Repository.DisciplinaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DisciplinaService implements DisciplinaServiceInterface{

    DisciplinaRepository disciplinaRepository;
    @Override
    @Transactional(readOnly = true)
    public DisciplinaDTO findById(Long id){
        Disciplina result = disciplinaRepository.findById(id).get();
        DisciplinaDTO disciplinaDTO = new DisciplinaDTO(result);
        return disciplinaDTO;
    }
}
