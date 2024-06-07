package com.julioluis.resttodo.services;

import ch.qos.logback.core.util.StringUtil;
import com.julioluis.resttodo.model.Todo;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

    private List<Todo> todoList = new ArrayList<>();

    public Todo addTodo(Todo todo) {
        todo.setId(RandomStringUtils.randomAlphabetic(10));
        todoList.add(todo);
        return todoList.get(todoList.size()-1);
    }

    public List<Todo> getTodoList() {
        return todoList;
    }
}
