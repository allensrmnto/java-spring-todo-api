package com.allensrmnto.todoapi.todo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class TodoRepository {
    @PersistenceContext
    EntityManager entityManager;

    public Todo findById(int id) {
        return entityManager.find(Todo.class, id);
    }

    public Todo insert(Todo todo) {
        return entityManager.merge(todo);
    }
}
