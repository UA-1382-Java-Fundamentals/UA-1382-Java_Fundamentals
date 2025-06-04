package softserve.academy.graduation;

import java.util.*;
import java.util.stream.Collectors;

public class TaskHandler {
    final static InputReader READER = new InputReader();
    final static InputValidator VALIDATOR = new InputValidator();

    public void addTask(Map<Integer, Task> tasks,
                        String newName,
                        boolean newStatus,
                        int newPriority,
                        String newStaff) {
        int newId;
        if (!tasks.isEmpty()) {
            newId = Collections.max(tasks.keySet()) + 1;
        } else {
            newId = 1;
        }
        HashSet<Integer> staffSet = (HashSet<Integer>) READER.parseStaffString(newStaff);
        tasks.put(
                newId,
                new Task(
                        newId,
                        newName,
                        newStatus,
                        newPriority,
                        staffSet
                )
        );
        System.out.printf("Task \"%s\" (ID:%d) added successfully!\n", newName, newId);
    }

    public void removeTaskById(Map<Integer, Task> tasks, int taskId) {
        if (VALIDATOR.isIdValid(tasks, taskId)) {
            tasks.remove(taskId);
            System.out.printf("Task (%d) removed.\n", taskId);
        }
    }

    public void sortTasksById(Map<Integer, Task> tasks) {
        List<Map.Entry<Integer, Task>> sortedList = tasks.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .toList();
        tasks.clear();
        for (Map.Entry<Integer, Task> entry : sortedList) {
            tasks.put(entry.getKey(), entry.getValue());
        }
    }

    public void sortTasksByPriority(Map<Integer, Task> tasks) {
        List<Map.Entry<Integer, Task>> sortedList = tasks.entrySet().stream()
                .sorted(Comparator.comparingInt(t -> t.getValue().getPriority()))
                .toList();
        tasks.clear();
        for (Map.Entry<Integer, Task> entry : sortedList) {
            tasks.put(entry.getKey(), entry.getValue());
        }
    }

    public void editTask(
            Map<Integer, Task> tasks,
            Integer targetId,
            String newName,
            boolean newStatus,
            int newPriority,
            String newStaff) {
        Task task = tasks.get(targetId);
        task.setName(newName);
        task.setActive(newStatus);
        task.setPriority(newPriority);
        task.setStaff((HashSet<Integer>) READER.parseStaffString(newStaff));
    }

    public Map<Integer,Employee> getEmployeesEngaged(Map<Integer, Employee> employees, Map<Integer, Task> tasks, Integer taskId) {
        Set<Integer> engagedIds = tasks.get(taskId).getStaff();
        return employees.entrySet().stream()
                .filter(e -> engagedIds.contains(e.getValue().getId()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}
