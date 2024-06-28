package com.task.model;

import jakarta.persistence.*;

@Entity
public class UserWorkSpace {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "work_space_id", referencedColumnName = "id")
    private WorkSpace workSpace;

    private String permission;

    public long getId() {
        return id;
    }

    public UserWorkSpace setId(long id) {
        this.id = id;
        return this;
    }

    public User getUser() {
        return user;
    }

    public UserWorkSpace setUser(User user) {
        this.user = user;
        return this;
    }

    public WorkSpace getWorkSpace() {
        return workSpace;
    }

    public UserWorkSpace setWorkSpace(WorkSpace workSpace) {
        this.workSpace = workSpace;
        return this;
    }

    public String getPermission() {
        return permission;
    }

    public UserWorkSpace setPermission(String permission) {
        this.permission = permission;
        return this;
    }
}
