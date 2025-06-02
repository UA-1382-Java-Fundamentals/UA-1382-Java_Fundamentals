package com.softserve.academy.edu13;

import java.io.IOException;

@FunctionalInterface
public interface Task {
    void execute(String name);
}

class TaskDemo {
    public static void main(String[] args) {
        Task task = name -> {
            try {
                if (name == null) {
                    throw new IOException("Name cannot be null");
                }
                System.out.println("Executing task for " + name);
            } catch (IOException e) {
                System.err.println("Error: " + e.getMessage());
            }
        };
        task.execute("Homework");
    }
}
