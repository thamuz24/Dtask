package com.task.repository;

import com.task.model.Labels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILabelsRepository extends JpaRepository<Labels,Long> {
}
