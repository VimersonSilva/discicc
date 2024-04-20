package com.disciplinascc.discicc.Service;

import com.disciplinascc.discicc.DTO.PeriodoListDTO;
import com.disciplinascc.discicc.Repository.PeriodoListRepository;
import com.disciplinascc.discicc.entities.PeriodoList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PeriodoListBuscaTodosService implements PeriodoListBuscaTodosServiceInterface{

    @Autowired
    private PeriodoListRepository periodoListRepository;

    @Transactional(readOnly = true)
    public List<PeriodoListDTO> findAll(){
        List<PeriodoList> result = periodoListRepository.findAll();
        List<PeriodoListDTO> periodosDto = result.stream().map(x -> new PeriodoListDTO(x)).toList();
        return periodosDto;
    }

}
