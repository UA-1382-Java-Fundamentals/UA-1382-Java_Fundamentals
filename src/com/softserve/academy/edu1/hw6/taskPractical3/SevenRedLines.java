package softserve.academy.edu1.hw6.taskPractical3;

class Point {
    protected int x;
    protected int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void print() {
        System.out.println(x + ", " + y);
    }

    @Override
    public String toString() {
        return x + ", " + y;
    }
}

class Line {
    protected Point point1;
    protected Point point2;

    public Line(Point point1, Point point2) {
        this.point1 = new Point(point1.x, point1.y);
        this.point2 = new Point(point2.x, point2.y);
    }

    public void print() {
        System.out.println(point1.toString() + " -> " + point2.toString());
    }

    @Override
    public String toString() {
        return point1.toString() + ", " + point2.toString();
    }
}

class ColorLine extends Line {
    protected String color;

    public ColorLine(Point point1, Point point2, String color) {
        super(point1, point2);
        this.color = color;
    }

    @Override
    public void print() {
        System.out.println(point1.toString() + " -> (" + color + ") -> " + point2.toString());
    }

    @Override
    public String toString() {
        return point1.toString() + " -> (" + color + ") -> " + point2.toString();
    }

}

public class SevenRedLines {
    public static void main(String[] args) {
        Line[] lines = {
                new Line(new Point(5, 5), new Point(5, 15)),
                new Line(new Point(5, 15), new Point(15, 15)),
                new Line(new Point(15, 15), new Point(15, 5)),
                new Line(new Point(15, 5), new Point(5, 5)),
                new ColorLine(new Point(0, 0), new Point(0, 20), "Red"),
                new ColorLine(new Point(0, 20), new Point(20, 20), "Green"),
                new ColorLine(new Point(20, 20), new Point(20, 0), "Blue"),
                new ColorLine(new Point(20, 0), new Point(0, 0), "White")
        };

        System.out.println("=====================================");
        for (Line line : lines) {
            line.print();
        }
        System.out.println("=====================================");
    }
}
