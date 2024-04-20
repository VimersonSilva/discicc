package com.disciplinascc.discicc;

import com.disciplinascc.discicc.DTO.DisciplinaDTO;
import com.disciplinascc.discicc.Repository.DisciplinaRepository;
import com.disciplinascc.discicc.entities.Disciplina;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.web.servlet.function.RequestPredicates.contentType;

@Transactional
@AutoConfigureMockMvc
@SpringBootTest
public class DisciplinaControllerTests {
    @Autowired
    MockMvc driver;
    @Autowired
    DisciplinaRepository disciplinaRepository;
    ObjectMapper object = new ObjectMapper();
    Disciplina disciplina;

    @BeforeEach
    void setup(){
        object.registerModule(new JavaTimeModule());
 //       disciplina = disciplinaRepository.save(
 //               new Disciplina(1411311,
 //                       "FUND DE MATEMÁTICA P/ C.DA COMPUTAÇÃO I",
 //                       1, 4, "FMCC I")
 //       );
    }

    @AfterEach
    void tearDown(){
        disciplinaRepository.deleteAll();
    }

    @Nested
    class DisciplinaTestsApi{
        DisciplinaDTO disciDTO;

        @BeforeEach
        void setup(){
            disciDTO = new DisciplinaDTO(disciplina);
        }

        @Test
        void searchDisciplina() throws Exception{
            String Json = driver.perform(get("/" + disciplina.getId())
                    .contentType(MediaType.APPLICATION_JSON)
                    .content(object.writeValueAsString((disciDTO))))
                    .andExpect(status().isOk())
                    .andDo(print())
                    .andReturn().getResponse().getContentAsString();

            List<Disciplina> result = object.readValue(Json, new TypeReference<List<Disciplina>>() {});
            Disciplina resultFinal = result.stream().findFirst().orElse(new Disciplina());

            assertAll(
                    () -> assertEquals(disciplina.getId().longValue(), resultFinal.getId())
            );
        }
    }
}
