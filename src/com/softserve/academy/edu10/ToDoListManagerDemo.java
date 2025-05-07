package com.softserve.academy.edu10;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * Demo class to demonstrate the functionality of ToDoListManager.
 */
public class ToDoListManagerDemo {
    public static void main(String[] args) {
        // Create a new ToDoListManager
        ToDoListManager manager = new ToDoListManager();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to ToDoList Manager!");

        // Add some initial tasks for demonstration
        manager.addTask("Buy groceries");
        manager.addTask("Read a book");
        manager.addTask("Clean the house");

        while (running) {
            // Display menu
            System.out.println("\n===== ToDoList Manager Menu =====");
            System.out.println("1. View all tasks");
            System.out.println("2. Add a new task");
            System.out.println("3. Remove a task by value");
            System.out.println("4. Remove a task by index");
            System.out.println("5. Update a task");
            System.out.println("6. Check if a task exists");
            System.out.println("7. Get task by index");
            System.out.println("8. Sort tasks alphabetically");
            System.out.println("9. Sort tasks in reverse alphabetical order");
            System.out.println("10. Sort tasks by length");
            System.out.println("11. Clear all tasks");
            System.out.println("12. Exit");
            System.out.print("Enter your choice (1-12): ");

            // Get user choice
            int choice;
            try {
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number between 1 and 12.");
                scanner.nextLine(); // Consume the invalid input
                continue;
            }

            // Process user choice using switch
            switch (choice) {
                case 1: // View all tasks
                    displayAllTasks(manager);
                    break;

                case 2: // Add a new task
                    System.out.print("Enter the task to add: ");
                    String newTask = scanner.nextLine();
                    boolean added = manager.addTask(newTask);
                    if (added) {
                        System.out.println("Task added successfully!");
                    } else {
                        System.out.println("Failed to add task. Task cannot be empty.");
                    }
                    break;

                case 3: // Remove a task by value
                    System.out.print("Enter the task to remove: ");
                    String taskToRemove = scanner.nextLine();
                    boolean removed = manager.removeTask(taskToRemove);
                    if (removed) {
                        System.out.println("Task removed successfully!");
                    } else {
                        System.out.println("Failed to remove task. Task not found.");
                    }
                    break;

                case 4: // Remove a task by index
                    displayAllTasks(manager);
                    System.out.print("Enter the index of the task to remove: ");
                    try {
                        int indexToRemove = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline
                        boolean removedByIndex = manager.removeTask(indexToRemove);
                        if (removedByIndex) {
                            System.out.println("Task removed successfully!");
                        }
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                        scanner.nextLine(); // Consume the invalid input
                    }
                    break;

                case 5: // Update a task
                    displayAllTasks(manager);
                    System.out.print("Enter the index of the task to update: ");
                    try {
                        int indexToUpdate = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline
                        System.out.print("Enter the new task: ");
                        String updatedTask = scanner.nextLine();
                        boolean updated = manager.updateTask(indexToUpdate, updatedTask);
                        if (updated) {
                            System.out.println("Task updated successfully!");
                        }
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                        scanner.nextLine(); // Consume the invalid input
                    }
                    break;

                case 6: // Check if a task exists
                    System.out.print("Enter the task to check: ");
                    String taskToCheck = scanner.nextLine();
                    boolean contains = manager.containsTask(taskToCheck);
                    System.out.println("Task '" + taskToCheck + "' exists: " + contains);
                    break;

                case 7: // Get task by index
                    System.out.print("Enter the index of the task to retrieve: ");
                    try {
                        int indexToRetrieve = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline
                        String task = manager.getTask(indexToRetrieve);
                        System.out.println("Task at index " + indexToRetrieve + ": " + task);
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                        scanner.nextLine(); // Consume the invalid input
                    }
                    break;

                case 8: // Sort tasks alphabetically
                    List<String> sortedTasks = manager.sortTasks();
                    System.out.println("\nTasks sorted alphabetically:");
                    for (int i = 0; i < sortedTasks.size(); i++) {
                        System.out.println((i + 1) + ". " + sortedTasks.get(i));
                    }
                    break;

                case 9: // Sort tasks in reverse alphabetical order
                    List<String> reverseSortedTasks = manager.sortTasksReverse();
                    System.out.println("\nTasks sorted in reverse alphabetical order:");
                    for (int i = 0; i < reverseSortedTasks.size(); i++) {
                        System.out.println((i + 1) + ". " + reverseSortedTasks.get(i));
                    }
                    break;

                case 10: // Sort tasks by length
                    List<String> lengthSortedTasks = manager.sortTasks(Comparator.comparingInt(s -> s.length()));
                    System.out.println("\nTasks sorted by length:");
                    for (int i = 0; i < lengthSortedTasks.size(); i++) {
                        System.out.println((i + 1) + ". " + lengthSortedTasks.get(i) + " (length: " + lengthSortedTasks.get(i).length() + ")");
                    }
                    break;

                case 11: // Clear all tasks
                    manager.clearTasks();
                    System.out.println("All tasks cleared!");
                    break;

                case 12: // Exit
                    running = false;
                    System.out.println("Thank you for using ToDoList Manager. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 12.");
            }
        }

        scanner.close();
    }

    /**
     * Helper method to display all tasks in the manager
     */
    private static void displayAllTasks(ToDoListManager manager) {
        List<String> tasks = manager.getTasks();
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            System.out.println("\nAll tasks:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println(i + ". " + tasks.get(i));
            }
        }
    }
}
