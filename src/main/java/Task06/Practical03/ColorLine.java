package Task06.Practical03;

public class ColorLine extends Line {

    private String color;

    public ColorLine( Point a, Point b, String color) {
        super( a, b);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + " color='" + color + '\'' +
                '}';
    }
}
