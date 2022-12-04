package com.allensrmnto.todoapi.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
    TodoRepository todoRepository;

    public Todo retrieveTodo(int todoId) {
        return todoRepository.findById(todoId);
    }

    public Todo addTodo(Todo todo) {
        return todoRepository.insert(todo);
    }

    @Autowired
    public void setTodoRepository(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }
}
