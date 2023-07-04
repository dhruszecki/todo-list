package org.dnh.todolist.controller;

import java.util.List;

import org.dnh.todolist.entity.Task;
import org.dnh.todolist.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping
    public List<Task> findAll() {
        return taskService.findAdll();
    }

    @PostMapping
    public void save(Task task) {
        taskService.save(task);
    }
    
}
