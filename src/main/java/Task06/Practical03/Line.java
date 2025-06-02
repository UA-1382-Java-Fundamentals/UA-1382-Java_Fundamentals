package Task06.Practical03;

public class Line extends Point  {

    protected Point a = new Point(getX(),getY());
    protected Point b = new Point(getX(),getY());

    public Line( Point a, Point b) {
        super();
        this.a = a;
        this.b = b;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return super.toString() + "Line{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
