package com.disciplinascc.discicc.Repository;

import com.disciplinascc.discicc.entities.Disciplina;
import com.disciplinascc.discicc.projections.DisciplinaProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DisciplinaRepository extends JpaRepository<Disciplina, Long> {

    @Query(nativeQuery = true, value = """
            SELECT tb_disciplina.id, tb_disciplina.codigo_disciplina, tb_disciplina.nome_disciplina,
             tb_disciplina.num_periodo, tb_disciplina.quant_creditos, tb_disciplina.sigla, tb_belonging_periodo.position
             FROM tb_disciplina
             INNER JOIN tb_belonging_periodo ON tb_disciplina.id = tb_belonging_periodo.disciplina_id
             WHERE tb_belonging_periodo.list_id = :listId
             ORDER BY tb_belonging_periodo.position
                                       """)
    public List<DisciplinaProjection> searchByList(Long listId);
}
