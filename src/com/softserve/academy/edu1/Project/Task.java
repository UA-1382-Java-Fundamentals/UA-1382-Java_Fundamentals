package com.softserve.academy.edu1.Project;

import jdk.jshell.Snippet;

public class Task {
    private String name;
    private Status status;

    public enum Status {
        NEW,
        IN_PROGRESS,
        DONE
    }

    public String getName() {
        return name;
    }

    public Status getStatus() {
        return status;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Task name cannot be null or empty");
        }
        this.name = name;
    }

    public void setStatus(Status status) {
        if (status == null) {
            throw new IllegalArgumentException("Status cannot be null");
        }
        this.status = status;
    }

    public Task(String name) {
        this.name = name;
        this.status = Status.NEW;
    }

    public void markAsDone() {
        this.status = Status.DONE;
    }


    @Override
    public String toString() {
        return "[" + status + "] " + name;
    }
}
