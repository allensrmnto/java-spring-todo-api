package com.allensrmnto.todoapi.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {
    TodoService todoService;

    @GetMapping("/todo/{todoId}")
    public ResponseEntity<Todo> getTodo(@PathVariable String todoId) {
        Todo todo = todoService.retrieveTodo(Integer.parseInt(todoId));
        if (todo == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(todo);
    }

    @Autowired
    public void setTodoService(TodoService todoService) {
        this.todoService = todoService;
    }
}
