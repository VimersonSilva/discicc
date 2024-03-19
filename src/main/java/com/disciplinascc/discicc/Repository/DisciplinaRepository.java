package com.disciplinascc.discicc.Repository;

import org.springframework.data.annotation.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DisciplinaRepository extends JpaRepository<Long, Id> {
}
