package com.task.model;

import jakarta.persistence.*;

@Entity
public class Field {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "work_space_id", referencedColumnName = "id")
    private WorkSpace workSpace;

    private String name;

    public long getId() {
        return id;
    }

    public Field setId(long id) {
        this.id = id;
        return this;
    }

    public WorkSpace getWorkSpace() {
        return workSpace;
    }

    public Field setWorkSpace(WorkSpace workSpace) {
        this.workSpace = workSpace;
        return this;
    }

    public String getName() {
        return name;
    }

    public Field setName(String name) {
        this.name = name;
        return this;
    }
}
