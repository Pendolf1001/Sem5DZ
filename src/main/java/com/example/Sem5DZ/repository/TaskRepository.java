package com.example.Sem5DZ.repository;

import com.example.Sem5DZ.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
