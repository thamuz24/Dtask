package com.task.model;

import jakarta.persistence.*;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Field field;

    private String name;
    private String description;

    public long getId() {
        return id;
    }

    public Task setId(long id) {
        this.id = id;
        return this;
    }

    public Field getField() {
        return field;
    }

    public Task setField(Field field) {
        this.field = field;
        return this;
    }

    public String getName() {
        return name;
    }

    public Task setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Task setDescription(String description) {
        this.description = description;
        return this;
    }
}
