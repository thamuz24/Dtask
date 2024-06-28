package com.task.repository;

import com.task.model.LabelsTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILabelsTableRepository extends JpaRepository<LabelsTable,Long> {
}
