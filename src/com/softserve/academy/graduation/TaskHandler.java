package softserve.academy.graduation;

import java.util.*;

public class TaskHandler {
    final static InputReader READER = new InputReader();
    final static InputValidator VALIDATOR = new InputValidator();

    public void addTask(Map<Integer, Task> taskMap,
                        String newName,
                        boolean newStatus,
                        int newPriority,
                        String newStaff) {
        Set<Integer> idSet = taskMap.keySet();
        Integer newId = Collections.max(idSet) + 1;
        HashSet<Integer> staffSet = READER.parseStaffString(newStaff);
        taskMap.put(
                newId,
                new Task(
                        newName,
                        newStatus,
                        newPriority,
                        staffSet
                )
        );
        System.out.printf("Task \"%s\" (ID:%d) added successfully!\n", newName, newId);
    }

    public void removeTaskById(Map<Integer, Task> taskMap, int taskId) {
        if (VALIDATOR.isIdValid(taskMap, taskId)) {
            taskMap.remove(taskId);
            System.out.printf("Task (%d) removed.\n", taskId);
        }
    }

    public void sortTasksById(Map<Integer, Task> taskMap) {
        List<Map.Entry<Integer, Task>> taskList = new ArrayList<>(taskMap.entrySet());
        taskList.sort(Comparator.comparingInt(Map.Entry::getKey));
        taskMap.clear();
        for (Map.Entry<Integer, Task> entry : taskList) {
            taskMap.put(entry.getKey(), entry.getValue());
        }
    }

    public void sortTasksByPriority(Map<Integer, Task> taskMap) {
        List<Map.Entry<Integer, Task>> taskList = new ArrayList<>(taskMap.entrySet());
        taskList.sort(Comparator.comparingInt(t -> t.getValue().getPriority()));
        taskMap.clear();
        for (Map.Entry<Integer, Task> entry : taskList) {
            taskMap.put(entry.getKey(), entry.getValue());
        }
    }

    public void editTask(
            Map<Integer, Task> taskMap,
            Integer targetId,
            String newName,
            boolean newStatus,
            int newPriority,
            String newStaff) {
        Task task = taskMap.get(targetId);
        task.setName(newName);
        task.setActive(newStatus);
        task.setPriority(newPriority);
        task.setStaff(READER.parseStaffString(newStaff));
    }

    public List<Employee> getEmployeesEngaged(Map<Integer, Employee> employeeMap, Map<Integer, Task> taskMap, Integer taskId) {
        Set<Integer> engagedIds = taskMap.get(taskId).getStaff();
        List<Employee> employeesEngaged = new ArrayList<>();
        for (Integer staffId : engagedIds) {
            if (taskMap.get(taskId).getStaff().contains(staffId)) {
                employeesEngaged.add(employeeMap.get(staffId));
            }
        }
        return employeesEngaged;
    }
}
