package softserve.academy.graduation;

import java.util.HashSet;
import java.util.Objects;

public class Task {
    private String name;
    private boolean activeFlag;
    private int priority;
    private HashSet<Integer> staff;

    public Task(String name, boolean activeFlag, int priority, HashSet<Integer> staffSet) {
        this.name = name;
        this.activeFlag = activeFlag;
        this.priority = priority;
        this.staff = staffSet;
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

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setStaff(HashSet<Integer> staffSet) {
        this.staff = staffSet;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(name, task.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        String status = isActive() ? "active":"closed";
        return String.format("%-35s | %-2d | %s", name, priority, status);
    }
}
