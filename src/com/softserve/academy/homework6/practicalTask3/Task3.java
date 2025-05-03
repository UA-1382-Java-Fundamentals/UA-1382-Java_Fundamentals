package softserve.academy.homework6.practicalTask3;

public class Task3 {
    public static void main(String[] args) {
        Line[] lines = {
                new Line(new Point(0, 0), new Point(1, 1)),
                new ColorLine(new Point(2, 3), new Point(3, 2), "Red"),
        };
        for (Line line : lines) {
            line.print();
        }
    }
}
