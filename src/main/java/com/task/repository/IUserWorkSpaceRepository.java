package com.task.repository;

import com.task.model.UserWorkSpace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserWorkSpaceRepository extends JpaRepository<UserWorkSpace,Long> {
}
