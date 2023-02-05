package com.example.toDo.controller;

import com.example.toDo.entities.Task;
import com.example.toDo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {
    @Autowired
    TaskService taskService;

    @PostMapping
    public ResponseEntity<Task> saveTask(@RequestBody Task task){
        return ResponseEntity.ok(taskService.saveTask(task));
    }
    @GetMapping
    public ResponseEntity<List<Task>> findAllTasks(){
        return ResponseEntity.ok(taskService.findAllTasks());
    }
}
