package com.disciplinascc.discicc.Controller;

import com.disciplinascc.discicc.Service.PeriodoListBuscaTodosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/lists")
public class PeriodoListController {

    @Autowired
    private PeriodoListBuscaTodosService periodoListService;
}
