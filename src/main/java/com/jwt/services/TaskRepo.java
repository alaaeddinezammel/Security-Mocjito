package com.jwt.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jwt.entites.Task;

@Repository
public interface TaskRepo extends JpaRepository<Task, Long> {

}
