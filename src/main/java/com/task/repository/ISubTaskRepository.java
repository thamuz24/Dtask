package com.task.repository;

import com.task.model.SubTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISubTaskRepository extends JpaRepository<SubTask,Long> {
}
