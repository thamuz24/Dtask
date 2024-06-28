package com.task.model;

import jakarta.persistence.*;

@Entity
public class WorkSpace {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String background;

    public long getId() {
        return id;
    }

    public WorkSpace setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public WorkSpace setName(String name) {
        this.name = name;
        return this;
    }

    public String getBackground() {
        return background;
    }

    public WorkSpace setBackground(String background) {
        this.background = background;
        return this;
    }
}
