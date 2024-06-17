package com.julioluis.resttodo.services;

import ch.qos.logback.core.util.StringUtil;
import com.julioluis.resttodo.model.Todo;
import com.julioluis.resttodo.repositories.TodoRepository;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    private List<Todo> todoList = new ArrayList<>();

    public Todo addTodo(Todo todo) {
       return todoRepository.save(todo);
    }

    public List<Todo> getTodoList() {
        return todoRepository.findAll();
    }

    public void deleteTodo(Long id) {
        todoRepository.deleteById(id);
    }
}
