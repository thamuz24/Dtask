package com.task.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Labels {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String color;

    public long getId() {
        return id;
    }

    public Labels setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Labels setName(String name) {
        this.name = name;
        return this;
    }

    public String getColor() {
        return color;
    }

    public Labels setColor(String color) {
        this.color = color;
        return this;
    }
}
