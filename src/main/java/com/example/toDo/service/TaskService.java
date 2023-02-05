package com.example.toDo.service;

import com.example.toDo.entities.Task;
import com.example.toDo.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    TaskRepository taskRepository;
    public Task saveTask(Task task){
        return taskRepository.save(task);
    }
    public List<Task> findAllTasks(){
        return taskRepository.findAll();
    }
}
