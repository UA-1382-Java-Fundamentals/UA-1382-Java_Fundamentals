package com.softserve.academy.edu1.Project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("""
                    ╔════════════════════════════════════╗
                    ║            TASK MANAGER            ║
                    ╠════════════════════════════════════╣
                    ║ 1. Add a new task                  ║
                    ║ 2. Show all tasks                  ║
                    ║ 3. Mark task as IN_PROGRESS        ║
                    ║ 4. Mark task as DONE               ║
                    ║ 5. Show tasks by status            ║
                    ║ 0. Exit                            ║
                    ╚════════════════════════════════════╝
                    """);

            String choice = scanner.nextLine();

            switch (choice) {
                case "1" -> {
                    System.out.print("Write the name of the task: ");
                    String name = scanner.nextLine();
                    manager.addTask(name);
                    System.out.println("Task successfully added!");
                }
                case "2" -> {
                    manager.showAllTasks();
                    System.out.println("Press Enter to continue...");
                    scanner.nextLine();
                }

                case "3" -> {
                    try {
                        System.out.print("Number of the task to mark as IN_PROGRESS: ");
                        int index = Integer.parseInt(scanner.nextLine());
                        manager.markInProgress(index);
                        System.out.println("Status updated successfully.");
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid number. Please enter a valid task number.");
                    }
                }

                case "4" -> {
                    try {
                        System.out.print("Number of the task to mark as DONE: ");
                        int index = Integer.parseInt(scanner.nextLine());
                        manager.markAsDone(index);
                        System.out.println("Status updated successfully.");
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid number. Please enter a valid task number.");
                    }
                }

                case "5" -> {
                    System.out.println("Enter the status to filter by (NEW, IN_PROGRESS, DONE): ");
                    String input = scanner.nextLine().toUpperCase();
                    try {
                        Task.Status status = Task.Status.valueOf(input);
                        manager.showTasksByStatus(status);
                        System.out.println("Press Enter to continue...");
                        scanner.nextLine();
                    } catch (IllegalArgumentException e) {
                        System.out.println("Invalid status. Please enter NEW, IN_PROGRESS, or DONE.");
                    }
                }

                case "0" -> {
                    System.out.println("Exiting the program. Goodbye!");
                    return;
                }

                default -> System.out.println("Wrong choice. Please try again.");
            }
        }
    }
}