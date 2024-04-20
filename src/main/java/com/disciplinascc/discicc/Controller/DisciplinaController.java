package com.disciplinascc.discicc.Controller;

import com.disciplinascc.discicc.DTO.DisciplinaDTO;
import com.disciplinascc.discicc.Repository.DisciplinaRepository;
import com.disciplinascc.discicc.Service.DisciplinaBuscaPreRequisitosServiceInterface;
import com.disciplinascc.discicc.Service.DisciplinaBuscaTodosServiceInterface;
import com.disciplinascc.discicc.Service.DisciplinaServiceInterface;
import com.disciplinascc.discicc.entities.Disciplina;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/disciplinas")
public class DisciplinaController {

    @Autowired
    private DisciplinaBuscaTodosServiceInterface disciplinaBuscaTodosService;

    @Autowired
    private DisciplinaServiceInterface disciplinaService;
    @Autowired
    private DisciplinaBuscaPreRequisitosServiceInterface disciplinaBuscaPreRequisitos;
    @Autowired
    private DisciplinaRepository disciplinaRepository;

    @GetMapping
    public List<DisciplinaDTO> findAll() {
        List<DisciplinaDTO> result = disciplinaBuscaTodosService.findAll();
        return result;
    }

    @GetMapping(value = "/{idDisciplina}")
    public DisciplinaDTO findById(@PathVariable Long idDisciplina) {
        //DisciplinaDTO result = disciplinaService.findById(idDisciplina);
        Disciplina result = disciplinaRepository.findById(idDisciplina).get();
        DisciplinaDTO disciplinaDTO = new DisciplinaDTO(result);
        return disciplinaDTO;
    }

    @GetMapping(value = "/{idDisciplina}/pre-requisitos")
    public List<DisciplinaDTO> findRequirements(@PathVariable Long idDisciplina){
        //return disciplinaBuscaPreRequisitos.buscaPreRequisitos(idDisciplina);
        Disciplina result = disciplinaRepository.findById(idDisciplina).get();
        List<DisciplinaDTO> requisitos = result.getPreRequisitos().stream().map(x -> new DisciplinaDTO(x)).toList();
        return requisitos;
    }
}
