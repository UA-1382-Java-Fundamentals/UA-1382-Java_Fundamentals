package com.softserve.academy.edu1.Project;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    List<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Task name cannot be null or empty");
        }
        Task task = new Task(name);
        tasks.add(task);
    }

    public void showAllTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    public void markInProgress(int index) {
        if (index < 1 || index > tasks.size()) {
            System.out.println("Wrong task number. Please provide a valid task number.");
            return;
        }

        Task task = tasks.get(index - 1);
        task.setStatus(Task.Status.IN_PROGRESS);
        System.out.println("The task marked as IN_PROGRESS: " + task.getName());
    }

    public void markAsDone(int index) {
        try {
            if (index < 1 || index > tasks.size()) {
                System.out.println("Wrong task number. Please provide a valid task number.");
                return;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Task task = tasks.get(index - 1);
        task.markAsDone();
        System.out.println("The task marked as DONE: " + task.getName());
    }

    public void showTasksByStatus(Task.Status status) {
        List<Task> filtered = tasks.stream()
                .filter(t -> t.getStatus() == status)
                .toList();

        if (filtered.isEmpty()) {
            System.out.println("No tasks with status: " + status);
        } else {
            for (int i = 0; i < filtered.size(); i++) {
                System.out.println((i + 1) + ". " + filtered.get(i));
            }
        }
    }


}
