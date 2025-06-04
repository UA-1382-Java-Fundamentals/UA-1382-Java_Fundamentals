package softserve.academy.graduation;

import java.util.HashSet;
import java.util.Objects;

public class Task {
    private final Integer id;
    private String name;
    private boolean activeFlag;
    private Integer priority;
    private HashSet<Integer> staff;

    public Task(Integer id, String name, boolean activeFlag, int priority, HashSet<Integer> staffSet) {
        if (!Objects.isNull(id)) {
            this.id = id;
            this.name = name;
            this.activeFlag = activeFlag;
            this.priority = priority;
            this.staff = staffSet;
        } else {
            throw new IllegalArgumentException("Task ID cannot be null!");
        }
    }

    public boolean isActive() {
        return activeFlag;
    }

    public int getPriority() {
        return priority;
    }

    public String getName() {
        return name;
    }

    public HashSet<Integer> getStaff() {
        return staff;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setActive(boolean activeFlag) {
        this.activeFlag = activeFlag;
    }

    public void setPriority(Integer priority) {
        if (!Objects.isNull(priority)) {
            this.priority = priority;
        } else {
            throw new IllegalArgumentException("Task priority cannot be null!");
        }
    }

    public void setStaff(HashSet<Integer> staffSet) {
        if (!Objects.isNull(staffSet)) {
            this.staff = staffSet;
        } else {
            throw new IllegalArgumentException("Task staff cannot be null!");
        }

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(id, task.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        String status = isActive() ? "active":"closed";
        return String.format("%-35s | %-2d | %s", name, priority, status);
    }
}