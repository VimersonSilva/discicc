package com.disciplinascc.discicc.Controller;

import com.disciplinascc.discicc.DTO.DisciplinaDTO;
import com.disciplinascc.discicc.DTO.PeriodoListDTO;
import com.disciplinascc.discicc.Service.DisciplinaBuscaNaListaService;
import com.disciplinascc.discicc.Service.DisciplinaBuscaNaListaServiceInterface;
import com.disciplinascc.discicc.Service.PeriodoListBuscaTodosService;
import com.disciplinascc.discicc.Service.PeriodoListBuscaTodosServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class PeriodoListController {
    @Autowired
    private DisciplinaBuscaNaListaServiceInterface disciplinaBuscaNaListaService;

    @Autowired
    private PeriodoListBuscaTodosServiceInterface periodoListService;

    @GetMapping
    public List<PeriodoListDTO> findAll(){
        List<PeriodoListDTO> periodos = periodoListService.findAll();
        return periodos;
    }

    @GetMapping(value = "/{listId}/disciplinas")
    public List<DisciplinaDTO> findByList(@PathVariable Long listId){
        List<DisciplinaDTO> result = disciplinaBuscaNaListaService.findByList(listId);
        return result;
    }

}
