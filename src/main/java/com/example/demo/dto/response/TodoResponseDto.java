package com.example.demo.dto.response;

public class TodoResponseDto {
    private final Long id;
    private final String todo;

    public TodoResponseDto(Long todoId, String todo) {
        this.id = todoId;
        this.todo = todo;
    }

    public Long getId() {
        return id;
    }

    public String getTodo() {
        return todo;
    }

}
