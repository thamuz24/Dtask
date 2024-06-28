package com.task.repository;

import com.task.model.LabelsTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILabelsTaskRepository extends JpaRepository<LabelsTask,Long> {
}
