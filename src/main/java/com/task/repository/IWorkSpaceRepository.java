package com.task.repository;

import com.task.model.WorkSpace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IWorkSpaceRepository extends JpaRepository<WorkSpace,Long> {
}
