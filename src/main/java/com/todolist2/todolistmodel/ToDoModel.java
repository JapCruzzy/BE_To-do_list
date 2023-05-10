package com.todolist2.todolistmodel;

import jakarta.persistence.*;

@Entity
@Table(name = "to-do")
public class ToDoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;

    public ToDoModel() {
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ToDoModel(long id, String name) {
        this.id = id;
        this.name = name;
    }
}
