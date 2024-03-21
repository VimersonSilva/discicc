package com.disciplinascc.discicc.Controller;

import com.disciplinascc.discicc.Service.DisciplinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/disciplinas")
public class DisciplinaController {

    @Autowired
    private DisciplinaService disciplinaService;

    @GetMapping
    public List<DisciplinaDTO> findAll() {
        List<DisciplinaDTO> result = disciplinaService.findAll();
        return result;
    }
}
