package com.task.model;

import jakarta.persistence.*;

@Entity
public class LabelsTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_label", referencedColumnName = "id")
    private Labels label;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "'id_work_space", referencedColumnName = "id")
    private WorkSpace workSpace;

    public long getId() {
        return id;
    }

    public LabelsTable setId(long id) {
        this.id = id;
        return this;
    }

    public Labels getLabel() {
        return label;
    }

    public LabelsTable setLabel(Labels label) {
        this.label = label;
        return this;
    }

    public WorkSpace getWorkSpace() {
        return workSpace;
    }

    public LabelsTable setWorkSpace(WorkSpace workSpace) {
        this.workSpace = workSpace;
        return this;
    }
}
