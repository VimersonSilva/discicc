package com.disciplinascc.discicc.Controller;

import com.disciplinascc.discicc.DTO.DisciplinaDTO;
import com.disciplinascc.discicc.Service.DisciplinaBuscaTodosServiceInterface;
import com.disciplinascc.discicc.Service.DisciplinaServiceInterface;
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

    @GetMapping
    public List<DisciplinaDTO> findAll() {
        List<DisciplinaDTO> result = disciplinaBuscaTodosService.findAll();
        return result;
    }

    @GetMapping(value = "/{idDisciplina}")
    public DisciplinaDTO findById(@PathVariable Long idDisciplina) {
        DisciplinaDTO result = disciplinaService.findById(idDisciplina);
        return result;
    }
}
