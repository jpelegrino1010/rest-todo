package com.julioluis.resttodo.controller;

import com.julioluis.resttodo.model.Todo;
import com.julioluis.resttodo.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/todos")
public class TodoController {
    @Autowired
    private TodoService service;

    @GetMapping
    public List<Todo> findAll() {
        return service.getTodoList();
    }

    @PostMapping
    public Todo create(@RequestBody Todo todo) {
        Todo newTodo = service.addTodo(todo);
        return newTodo;
    }
}
