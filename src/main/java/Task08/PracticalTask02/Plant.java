package Task08.PracticalTask02;

public class Plant {

    private int size;
    private Color color;
    private Type type ;

    public Plant(int size, String colorStr, String typeStr) throws ColorException, TypeException, SizeException {
        validateSize(size);
        this.size = size;

        this.color = validateColor(colorStr);
        this.type = validateType(typeStr);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "size=" + size +
                ", color=" + color +
                ", type=" + type +
                '}';
    }

    private void validateSize(int size) throws SizeException {
        if (size < 1 || size > 100) {
            throw new SizeException("Size must be between 1 and 100.");
        }
    }

    private Color validateColor(String colorStr) throws ColorException {
        try {
            return Color.valueOf(colorStr.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new ColorException("Invalid color: " + colorStr);
        }
    }

    private Type validateType(String typeStr) throws TypeException {
        try {
            return Type.valueOf(typeStr.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new TypeException("Invalid type: " + typeStr);
        }
    }
}
