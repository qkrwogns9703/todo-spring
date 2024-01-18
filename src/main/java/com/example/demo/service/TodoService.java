package com.example.demo.service;

import com.example.demo.domain.entity.Todo;
import com.example.demo.domain.repository.TodoRepository;
import com.example.demo.dto.response.TodoResponseDto;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TodoService {

    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Transactional(readOnly = true)
    public TodoResponseDto getTodo(Long todoId) {
        Todo todo = todoRepository.findById(todoId).orElseThrow();
        return new TodoResponseDto(todo.getId(), todo.getTodo());

    }


}