package softserve.academy.homework6.practicalTask3;

public class Line   {
    private Point start;
    private Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public void print(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Line{" +
                "start = " + start +
                ", end = " + end +
                '}';
    }
}
