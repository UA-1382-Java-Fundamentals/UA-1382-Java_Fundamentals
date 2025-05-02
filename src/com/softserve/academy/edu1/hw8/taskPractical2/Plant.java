package softserve.academy.edu1.hw8.taskPractical2;

import java.util.Arrays;

public class Plant {
    private int size;
    private Color color;
    private Type type;

    public Plant(int size, String colorInput, String typeInput) throws ColorException, TypeException, SizeTooSmallException, SizeTooBigException {
        Color enumColor = colorToEnum(colorInput);
        Type enumType = typeToEnum(typeInput);
        this.size = validateSize(size);
        this.color = enumColor;
        this.type = enumType;
    }

    public int validateSize(int size) throws SizeTooSmallException, SizeTooBigException {
        if (size >= 5 && size <= 40) {
            return size;
        } else if (size < 5) {
            throw new SizeTooSmallException("Size too small! It must be between 5 and 40!");
        } else {
            throw new SizeTooBigException("Size too big! It must be between 5 and 40!");
        }

    }

    public Color colorToEnum(String colorInput) throws ColorException {
        colorInput = colorInput.toUpperCase();
        for (Color colorLabel : Color.values()) {
            if (colorLabel.toString().equals(colorInput)) {
                return Color.valueOf(colorInput);
            }
        }
        throw new ColorException("Invalid color! Choose a valid color among: " + Arrays.toString(Color.values()));
    }

    public Type typeToEnum(String typeInput) throws TypeException {
        typeInput = typeInput.toUpperCase();
        for (Type typeLabel : Type.values()) {
            if (typeLabel.toString().equals(typeInput)) {
                return Type.valueOf(typeInput);
            }
        }
        throw new TypeException("Invalid type! Choose a valid type among: " + Arrays.toString(Type.values()));
    }

    @Override
    public String toString() {
        return color.toString().toLowerCase() + " " + type.toString().toLowerCase() + ", size: " + size;
    }
}
