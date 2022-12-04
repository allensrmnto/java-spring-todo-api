package com.allensrmnto.todoapi.todo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class TodoRepository {
    @PersistenceContext
    EntityManager entityManager;

    public List<Todo> findAll() {
        return null;
    }

    public Todo findById(int id) {
        return entityManager.find(Todo.class, id);
    }

    public Todo insert(Todo todo) {
        return entityManager.merge(todo);
    }

    public Todo update(Todo todo) {
        return entityManager.merge(todo);
    }

    public void deleteById(int id) {
        Todo todo = findById(id);
        entityManager.remove(todo);
    }
}
