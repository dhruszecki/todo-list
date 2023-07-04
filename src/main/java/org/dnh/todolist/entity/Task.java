package org.dnh.todolist.entity;

import java.security.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.GeneratedValue;

@Getter
@Setter
@AllArgsConstructor
@Entity
public class Task {
    @Id
    @GeneratedValue
    private int id;
    private String title;
    private String description;
    private int priority;
    private Timestamp dueDate;
}
