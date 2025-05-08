package softserve.academy.edu10.taskPractical1;

public class HeavyBox {
    private int weight;
    private String contents;

    public HeavyBox(int weight, String contents) {
        this.weight = weight;
        this.contents = contents;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return weight + " kg, contains: " + contents;
    }
}
