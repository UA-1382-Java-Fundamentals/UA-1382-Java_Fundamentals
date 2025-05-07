package com.softserve.academy.edu10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * The ToDoListManager class provides functionality to manage a to-do list.
 * It allows adding, removing, updating, sorting, and clearing tasks in the list.
 * The tasks are stored as a list of strings.
 */
public class ToDoListManager {

    private final List<String> tasks;

    /**
     * Constructs a new ToDoListManager with an empty task list.
     */
    public ToDoListManager() {
        this.tasks = new ArrayList<>();
    }

    /**
     * Adds a new task to the to-do list.
     *
     * @param task the task to be added
     * @return true if the task was added successfully, false if the task is null or empty
     */
    public boolean addTask(String task) {
        if (task == null || task.trim().isEmpty()) {
            return false;
        }
        return tasks.add(task);
    }

    /**
     * Removes a task from the to-do list by its value.
     *
     * @param task the task to be removed
     * @return true if the task was found and removed, false otherwise
     */
    public boolean removeTask(String task) {
        if (task == null) {
            return false;
        }
        return tasks.remove(task);
    }

    /**
     * Removes a task from the to-do list by its index.
     *
     * @param index the index of the task to be removed
     * @return true if the task was removed successfully, false if the index is invalid
     */
    public boolean removeTask(int index) {
        if (index < 0 || index >= tasks.size()) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        tasks.remove(index);
        return true;
    }

    /**
     * Clears all tasks from the to-do list.
     */
    public void clearTasks() {
        tasks.clear();
    }

    /**
     * Checks if the to-do list is empty.
     *
     * @return true if the list is empty, false otherwise
     */
    public boolean isEmpty() {
        return tasks.isEmpty();
    }

    /**
     * Returns the number of tasks in the to-do list.
     *
     * @return the number of tasks
     */
    public int size() {
        return tasks.size();
    }

    /**
     * Updates a task at the specified index with a new task value.
     *
     * @param index   the index of the task to update
     * @param newTask the new task value
     * @return true if the task was updated successfully, false if the index is invalid or the new task is null or empty
     */
    public boolean updateTask(int index, String newTask) {
        if (index < 0 || index >= tasks.size() || newTask == null || newTask.trim().isEmpty()) {
           throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        tasks.set(index, newTask);
        return true;
    }

    /**
     * Returns an unmodifiable view of the tasks in the to-do list.
     *
     * @return a new list of tasks
     */
    public List<String> getTasks() {
        return new ArrayList<>(tasks);
    }

    /**
     * Returns a new list with tasks sorted alphabetically in ascending order.
     * The original list remains unchanged.
     *
     * @return a new list with sorted tasks
     */
    public List<String> sortTasks() {
        List<String> sortedList = new ArrayList<>(tasks);
        Collections.sort(sortedList);
        return sortedList;
    }

    /**
     * Returns a new list with tasks sorted alphabetically in descending order.
     * The original list remains unchanged.
     *
     * @return a new list with sorted tasks
     */
    public List<String> sortTasksReverse() {
        List<String> sortedList = new ArrayList<>(tasks);
        Collections.sort(sortedList, Collections.reverseOrder());
        return sortedList;
    }

    /**
     * Returns a new list with tasks sorted according to the provided comparator.
     * The original list remains unchanged.
     *
     * @param comparator the comparator to use for sorting
     * @return a new list with sorted tasks
     * @throws NullPointerException if the comparator is null
     */
    public List<String> sortTasks(Comparator<String> comparator) {
        if (comparator == null) {
            throw new NullPointerException("Comparator cannot be null");
        }
        List<String> sortedList = new ArrayList<>(tasks);
        Collections.sort(sortedList, comparator);
        return sortedList;
    }

    /**
     * Checks if the to-do list contains a specific task.
     * @param task 
     * @return true if the task is found, false otherwise
     */
    public boolean containsTask(String task) {
        return tasks.contains(task);
    }

    /**
     * Returns the task at the specified index.
     * @param index
     * @return
     */
    public String getTask(int index) {
        if (index < 0 || index >= tasks.size()) {
           throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        return tasks.get(index);
    }
}
