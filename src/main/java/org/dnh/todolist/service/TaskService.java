package org.dnh.todolist.service;

import java.util.List;

import org.dnh.todolist.entity.Task;
import org.dnh.todolist.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class TaskService {
    
    @Autowired
    private TaskRepository taskRepository;

    public List<Task> findAdll() {
        return taskRepository.findAll();
    }

    @Transactional
    public void save(Task task) {
        taskRepository.save(task);
    }


}
