package com.task.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class SubTask {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public long getId() {
        return id;
    }

    public SubTask setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public SubTask setName(String name) {
        this.name = name;
        return this;
    }
}
