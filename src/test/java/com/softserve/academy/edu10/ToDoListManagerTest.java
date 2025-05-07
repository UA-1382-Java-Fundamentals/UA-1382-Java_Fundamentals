package com.softserve.academy.edu10;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ToDoListManagerTest {

    private ToDoListManager manager;
    private String task1;
    private String task2;
    private String task3;

    @BeforeEach
    void setUp() {
        manager = new ToDoListManager();
        task1 = "Buy groceries";
        task2 = "Read a book";
        task3 = "Clean the house";
    }

    /**
     * Tests for the addTask method in the ToDoListManager class.
     * This method adds a task to the to-do list if the task is not null, not empty, and not only whitespace.
     * Returns true if the task was successfully added, otherwise false.
     */

    @Test
    void testAddTask_ValidTask_ShouldReturnTrue() {
        boolean result = manager.addTask(task1);

        assertTrue(result);
        assertEquals(1, manager.size());
        assertTrue(manager.getTasks().contains(task1));
    }

    @Test
    void testAddTask_NullTask_ShouldReturnFalse() {
        boolean result = manager.addTask(null);

        assertFalse(result);
        assertTrue(manager.isEmpty());
    }

    @Test
    void testAddTask_EmptyTask_ShouldReturnFalse() {
        String emptyTask = "";

        boolean result = manager.addTask(emptyTask);

        assertFalse(result);
        assertTrue(manager.isEmpty());
    }

    @Test
    void testAddTask_WhitespaceTask_ShouldReturnFalse() {
        String whitespaceTask = "   ";

        boolean result = manager.addTask(whitespaceTask);

        assertFalse(result);
        assertTrue(manager.isEmpty());
    }

    @Test
    void testAddTask_MultipleValidTasks_ShouldAddAllSuccessfully() {
        boolean result1 = manager.addTask(task1);
        boolean result2 = manager.addTask(task2);

        assertTrue(result1);
        assertTrue(result2);
        assertEquals(2, manager.size());
        assertTrue(manager.getTasks().contains(task1));
        assertTrue(manager.getTasks().contains(task2));
    }

    /**
     * Tests for the removeTask(String) method in the ToDoListManager class.
     * This method removes a task from the to-do list by its value.
     * Returns true if the task was found and removed, false otherwise.
     */

    @Test
    void testRemoveTaskByValue_ExistingTask_ShouldReturnTrue() {
        manager.addTask(task1);
        manager.addTask(task2);

        boolean result = manager.removeTask(task1);

        assertTrue(result);
        assertEquals(1, manager.size());
        assertFalse(manager.getTasks().contains(task1));
        assertTrue(manager.getTasks().contains(task2));
    }

    @Test
    void testRemoveTaskByValue_NonExistingTask_ShouldReturnFalse() {
        manager.addTask(task1);

        boolean result = manager.removeTask("Non-existing task");

        assertFalse(result);
        assertEquals(1, manager.size());
        assertTrue(manager.getTasks().contains(task1));
    }

    @Test
    void testRemoveTaskByValue_NullTask_ShouldReturnFalse() {
        manager.addTask(task1);

        boolean result = manager.removeTask(null);

        assertFalse(result);
        assertEquals(1, manager.size());
        assertTrue(manager.getTasks().contains(task1));
    }

    @Test
    void testRemoveTaskByValue_EmptyList_ShouldReturnFalse() {
        boolean result = manager.removeTask(task1);

        assertFalse(result);
        assertTrue(manager.isEmpty());
    }

    /**
     * Tests for the removeTask(int) method in the ToDoListManager class.
     * This method removes a task from the to-do list by its index.
     * Returns true if the task was removed successfully, throws IndexOutOfBoundsException if the index is invalid.
     */

    @Test
    void testRemoveTaskByIndex_ValidIndex_ShouldReturnTrue() {
        manager.addTask(task1);
        manager.addTask(task2);

        boolean result = manager.removeTask(0);

        assertTrue(result);
        assertEquals(1, manager.size());
        assertFalse(manager.getTasks().contains(task1));
        assertTrue(manager.getTasks().contains(task2));
    }

    @Test
    void testRemoveTaskByIndex_InvalidIndex_ShouldThrowException() {
        manager.addTask(task1);

        assertThrows(IndexOutOfBoundsException.class, () -> manager.removeTask(1));
        assertThrows(IndexOutOfBoundsException.class, () -> manager.removeTask(-1));
        assertEquals(1, manager.size());
        assertTrue(manager.getTasks().contains(task1));
    }

    @Test
    void testRemoveTaskByIndex_EmptyList_ShouldThrowException() {
        assertThrows(IndexOutOfBoundsException.class, () -> manager.removeTask(0));
        assertTrue(manager.isEmpty());
    }

    /**
     * Tests for the clearTasks method in the ToDoListManager class.
     * This method removes all tasks from the to-do list.
     */

    @Test
    void testClearTasks_NonEmptyList_ShouldClearAllTasks() {
        manager.addTask(task1);
        manager.addTask(task2);

        manager.clearTasks();

        assertTrue(manager.isEmpty());
        assertEquals(0, manager.size());
    }

    @Test
    void testClearTasks_EmptyList_ShouldDoNothing() {
        manager.clearTasks();

        assertTrue(manager.isEmpty());
        assertEquals(0, manager.size());
    }

    /**
     * Tests for the updateTask method in the ToDoListManager class.
     * This method updates a task at the specified index with a new task value.
     * Returns true if the task was updated successfully, throws IndexOutOfBoundsException if the index is invalid.
     */

    @Test
    void testUpdateTask_ValidIndexAndTask_ShouldReturnTrue() {
        manager.addTask(task1);
        String newTask = "Updated task";

        boolean result = manager.updateTask(0, newTask);

        assertTrue(result);
        assertEquals(1, manager.size());
        assertEquals(newTask, manager.getTask(0));
    }

    @Test
    void testUpdateTask_InvalidIndex_ShouldThrowException() {
        manager.addTask(task1);

        assertThrows(IndexOutOfBoundsException.class, () -> manager.updateTask(1, "New task"));
        assertThrows(IndexOutOfBoundsException.class, () -> manager.updateTask(-1, "New task"));
        assertEquals(1, manager.size());
        assertEquals(task1, manager.getTask(0));
    }

    @Test
    void testUpdateTask_NullOrEmptyNewTask_ShouldThrowException() {
        manager.addTask(task1);

        assertThrows(IndexOutOfBoundsException.class, () -> manager.updateTask(0, null));
        assertThrows(IndexOutOfBoundsException.class, () -> manager.updateTask(0, ""));
        assertThrows(IndexOutOfBoundsException.class, () -> manager.updateTask(0, "   "));
        assertEquals(1, manager.size());
        assertEquals(task1, manager.getTask(0));
    }

    /**
     * Tests for the getTask method in the ToDoListManager class.
     * This method returns the task at the specified index.
     * Throws IndexOutOfBoundsException if the index is invalid.
     */

    @Test
    void testGetTask_ValidIndex_ShouldReturnTask() {
        manager.addTask(task1);
        manager.addTask(task2);

        String result1 = manager.getTask(0);
        String result2 = manager.getTask(1);

        assertEquals(task1, result1);
        assertEquals(task2, result2);
    }

    @Test
    void testGetTask_InvalidIndex_ShouldThrowException() {
        manager.addTask(task1);

        assertThrows(IndexOutOfBoundsException.class, () -> manager.getTask(1));
        assertThrows(IndexOutOfBoundsException.class, () -> manager.getTask(-1));
    }

    @Test
    void testGetTask_EmptyList_ShouldThrowException() {
        assertThrows(IndexOutOfBoundsException.class, () -> manager.getTask(0));
    }

    /**
     * Tests for the containsTask method in the ToDoListManager class.
     * This method checks if the to-do list contains a specific task.
     * Returns true if the task is found, false otherwise.
     */

    @Test
    void testContainsTask_ExistingTask_ShouldReturnTrue() {
        manager.addTask(task1);
        manager.addTask(task2);

        boolean result = manager.containsTask(task1);

        assertTrue(result);
    }

    @Test
    void testContainsTask_NonExistingTask_ShouldReturnFalse() {
        manager.addTask(task1);

        boolean result = manager.containsTask("Non-existing task");

        assertFalse(result);
    }

    @Test
    void testContainsTask_EmptyList_ShouldReturnFalse() {
        boolean result = manager.containsTask(task1);

        assertFalse(result);
    }

    /**
     * Tests for the sortTasks() method in the ToDoListManager class.
     * This method returns a new list with tasks sorted alphabetically in ascending order.
     * The original list remains unchanged.
     */

    @Test
    void testSortTasks_NonEmptyList_ShouldReturnSortedList() {
        manager.addTask("C Task");
        manager.addTask("A Task");
        manager.addTask("B Task");

        List<String> result = manager.sortTasks();

        assertEquals(3, result.size());
        assertEquals("A Task", result.get(0));
        assertEquals("B Task", result.get(1));
        assertEquals("C Task", result.get(2));

        // Verify original list is unchanged
        List<String> originalTasks = manager.getTasks();
        assertEquals("C Task", originalTasks.get(0));
        assertEquals("A Task", originalTasks.get(1));
        assertEquals("B Task", originalTasks.get(2));
    }

    @Test
    void testSortTasks_EmptyList_ShouldReturnEmptyList() {
        List<String> result = manager.sortTasks();

        assertTrue(result.isEmpty());
    }

    /**
     * Tests for the sortTasksReverse() method in the ToDoListManager class.
     * This method returns a new list with tasks sorted alphabetically in descending order.
     * The original list remains unchanged.
     */

    @Test
    void testSortTasksReverse_NonEmptyList_ShouldReturnReverseSortedList() {
        manager.addTask("C Task");
        manager.addTask("A Task");
        manager.addTask("B Task");

        List<String> result = manager.sortTasksReverse();

        assertEquals(3, result.size());
        assertEquals("C Task", result.get(0));
        assertEquals("B Task", result.get(1));
        assertEquals("A Task", result.get(2));

        // Verify original list is unchanged
        List<String> originalTasks = manager.getTasks();
        assertEquals("C Task", originalTasks.get(0));
        assertEquals("A Task", originalTasks.get(1));
        assertEquals("B Task", originalTasks.get(2));
    }

    @Test
    void testSortTasksReverse_EmptyList_ShouldReturnEmptyList() {
        List<String> result = manager.sortTasksReverse();

        assertTrue(result.isEmpty());
    }

    /**
     * Tests for the sortTasks(Comparator<String>) method in the ToDoListManager class.
     * This method returns a new list with tasks sorted according to the provided comparator.
     * The original list remains unchanged.
     */

    @Test
    void testSortTasksWithComparator_NonEmptyList_ShouldReturnSortedList() {
        manager.addTask("Long task description");
        manager.addTask("Short");
        manager.addTask("Medium length");

        // Sort by length
        List<String> result = manager.sortTasks(Comparator.comparingInt(String::length));

        assertEquals(3, result.size());
        assertEquals("Short", result.get(0));
        assertEquals("Medium length", result.get(1));
        assertEquals("Long task description", result.get(2));

        // Verify original list is unchanged
        List<String> originalTasks = manager.getTasks();
        assertEquals("Long task description", originalTasks.get(0));
        assertEquals("Short", originalTasks.get(1));
        assertEquals("Medium length", originalTasks.get(2));
    }

    @Test
    void testSortTasksWithComparator_EmptyList_ShouldReturnEmptyList() {
        List<String> result = manager.sortTasks(Comparator.naturalOrder());

        assertTrue(result.isEmpty());
    }

    @Test
    void testSortTasksWithComparator_NullComparator_ShouldThrowException() {
        manager.addTask(task1);

        assertThrows(NullPointerException.class, () -> manager.sortTasks(null));

        // Verify original list is unchanged
        assertEquals(1, manager.size());
        assertEquals(task1, manager.getTask(0));
    }

}
