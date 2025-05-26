package softserve.academy.graduation;

import java.util.HashSet;

public class Task {
    protected String name;
    protected boolean isActive;
    protected int priority;
    protected HashSet<Integer> staff;

    Handler HANDLER = new Handler();

    public Task(String name, boolean active, int priority, String staffString) {
        this.name = name;
        this.isActive = active;
        this.priority = priority;
        this.staff = HANDLER.parseStaffString(staffString);
    }

    public boolean isActive() {
        return isActive;
    }

    public int getPriority() {
        return priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setStaff(String staffString) {
        this.staff = HANDLER.parseStaffString(staffString);
    }

    public HashSet<Integer> getStaff() {
        return staff;
    }

    @Override
    public String toString() {
        String status = isActive() ? "active":"closed";
        return String.format("%-35s | %-2d | %s", name, priority, status);
    }
}
