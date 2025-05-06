package softserve.academy.edu4.taskHW4;

public enum Seasons {
    SPRING ("Spring", "Second semester", 0.8),
    SUMMER ("Summer", "Vacation", 0.05),
    AUTUMN ("Autumn", "First semester", 0.9),
    WINTER ("Winter", "Exams", 0.95);

    private final String name;
    private final String events;
    private final double attendanceFactor;

    Seasons (String name, String events, double attendanceFactor) {
        this.name = name;
        this.events = events;
        this.attendanceFactor = attendanceFactor;
    }

    public String getEvents() {
        return events;
    }

    public String getName() {
        return name;
    }

    public double getAttendanceFactor() {
        return attendanceFactor;
    }
}

