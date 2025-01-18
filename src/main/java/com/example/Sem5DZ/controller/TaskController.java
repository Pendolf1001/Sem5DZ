package com.example.Sem5DZ.controller;

import com.example.Sem5DZ.model.Task;
import com.example.Sem5DZ.service.TaskService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
@AllArgsConstructor
public class TaskController {

    private final TaskService taskService;




    @GetMapping
    public List<Task> getAllTask(){
        return  taskService.getAllTask();
    }


    @PostMapping
    public void transferMoney(@RequestBody Task task){
       taskService.createTask(task);

    }


}
