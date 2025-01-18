package com.example.Sem5DZ.service;

import com.example.Sem5DZ.model.Task;
import com.example.Sem5DZ.repository.TaskRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;



@Service
@AllArgsConstructor
public class TaskService {


    private final TaskRepository repositoty;


    public List<Task> getAllTask() {

        return repositoty.findAll();

    }


    public Optional<Task> getTaskById(Long id) {
        return repositoty.findById(id);
    }


    public List<Task> createTask(Task task) {
        repositoty.save(task);
        return repositoty.findAll();
    }


    public List<Task> updateTask(Long id, Task taskDetails) {

        Optional<Task> optionalTask = repositoty.findById(id);

        if (optionalTask.isPresent()) {
            Task task = optionalTask.get();
            task.setDescription(taskDetails.getDescription());


            repositoty.save(task);
            return repositoty.findAll();
        } else {
            throw new IllegalArgumentException("Task not found with id : " + id);
        }


    }

}