package com.allensrmnto.todoapi.todo;

import jakarta.persistence.Entity;

import java.util.Date;

@Entity
public class Todo {
    private int todoId;
    private String name;
    private Date created;
    private Date updated;

    public Todo() {
        // no-op
    }

    public int getTodoId() {
        return todoId;
    }

    public void setTodoId(int todoId) {
        this.todoId = todoId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "todoId=" + todoId +
                ", name='" + name + '\'' +
                ", created=" + created +
                ", updated=" + updated +
                '}';
    }
}
