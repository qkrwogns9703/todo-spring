package com.example.demo.controller;

import com.example.demo.dto.response.TodoResponseDto;
import com.example.demo.service.TodoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/todo/list/{todoId}")
    public TodoResponseDto getTodoItem(@PathVariable Long todoId) {
        System.out.println("@@@@@@@@@@@@@@@@@@@@" + todoId);
        return todoService.getTodo(todoId);
    }
}
