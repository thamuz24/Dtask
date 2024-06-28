package com.task.model;

import jakarta.persistence.*;

@Entity
public class LabelsTask {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_label", referencedColumnName = "id")
    private Labels label;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_task", referencedColumnName = "id")
    private Task task;

    public long getId() {
        return id;
    }

    public LabelsTask setId(long id) {
        this.id = id;
        return this;
    }

    public Labels getLabel() {
        return label;
    }

    public LabelsTask setLabel(Labels label) {
        this.label = label;
        return this;
    }

    public Task getTask() {
        return task;
    }

    public LabelsTask setTask(Task task) {
        this.task = task;
        return this;
    }
}
