package com.example.demo.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Todo {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public String todo;
    public LocalDateTime createdAt;


    public Todo(String todo) {
        this.todo = todo;
        this.createdAt = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public String getTodo() {
        return todo;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void updateTodo(String todo) {
        this.todo = todo;
    }
}
