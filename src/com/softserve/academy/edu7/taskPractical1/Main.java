package softserve.academy.edu7.taskPractical1;

class Dog implements Animal {
    protected String name;

    public Dog (String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println("Dog " + name + " says: Woof!");
    }

    @Override
    public void feed() {
        System.out.println("Dog " + name + " eats dog food!");
    }
}

class Cat implements Animal {
    protected String name;

    public Cat (String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println("Cat " + name + " says: Meow!");
    }

    @Override
    public void feed() {
        System.out.println("Cat " + name + " crunches cat food!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog ("Spot"),
                new Dog ("Lucky"),
                new Cat ("Ginger"),
                new Cat ("Princess"),
                new Cat ("Tiger")
        };
        for (Animal animal : animals) {
            animal.voice();
            animal.feed();
            System.out.println("============================");
        }
    }
}
