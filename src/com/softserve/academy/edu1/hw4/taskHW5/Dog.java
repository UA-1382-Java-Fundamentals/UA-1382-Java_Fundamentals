package softserve.academy.edu1.hw4.taskHW5;

import java.util.Arrays;
import java.util.Scanner;

public class Dog {
    private final String name;
    private final Breed breed;
    private final int age;

    static final Scanner SCANNER = new Scanner(System.in);

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.age = age;
        this.breed = breedToEnum(breed);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static Breed breedToEnum(String label) {
        for (Breed breedInstance : Breed.values()) {
            if (breedInstance.name().equalsIgnoreCase(label)) {
                return breedInstance;
            }
        }
        throw new IllegalArgumentException("Breed not found! Choose from: " + Arrays.toString(Breed.values()));
    }

    public static Dog inputNewDog() {
        String name = inputText("Enter dog's name: ");
        String breed = inputText("Enter dog's breed: ");
        int age = inputAge("Enter dog's age: ");
        return new Dog(name, breed, age);
    }

    public static int inputAge(String message) {
        int value = 0;
        while (true) {
            try {
                System.out.print(message);
                value = Integer.parseInt(SCANNER.nextLine());
                if (value < 0) {
                    throw new ArithmeticException("The age cannot be negative!");
                }
                if (value > 35) {
                    throw new ArithmeticException("Unfortunately, the dogs don't live that long yet!");
                }
                return value;
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Enter a valid integer!");
            }
        }
    }

    public static String inputText(String message) {
        System.out.print(message);
        String output = SCANNER.nextLine();
        if (output.isEmpty()) {
            throw new IllegalArgumentException("The input cannot be empty!");
        }
        return output;
    }

    public static boolean isNameUnique(Dog... dogs) {
        for (int i = 0; i < dogs.length; i++) {
            for (int j = 0; j < dogs.length; j++) {
                if (j != i) {
                    if (dogs[i].getName().equalsIgnoreCase(dogs[j].getName())) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static Dog getEldestDog(Dog... dogs) {
        Dog eldestDog = new Dog("NoName", "Poodle", 0);
        for (Dog dog : dogs) {
            if (dog.getAge() >= eldestDog.getAge()) {
                eldestDog = dog;
            }
        }
        return eldestDog;
    }

    @Override
    public String toString() {
        return breed.name().toLowerCase() + " " + name + " (" + age + ")";
    }
}

