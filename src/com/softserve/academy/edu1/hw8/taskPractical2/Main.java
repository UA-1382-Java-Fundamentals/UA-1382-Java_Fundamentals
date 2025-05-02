package softserve.academy.edu1.hw8.taskPractical2;

import java.util.Random;
import java.util.Scanner;

public class Main {
    final static Random RAND = new Random();
    final static Scanner SCAN = new Scanner(System.in);

    public static void main(String[] args) {

//      Block for manual input of plants;
//        int arraySize = 2;
//        Plant[] plants = new Plant[arraySize];
//        for (int i = 0; i < plants.length; i++) {
//            plants[i] = inputPlant();
//        }

//      Arrays for random generation with all the valid elements;
//        String[] colorNames = {"red", "white", "orange"};
//        String[] typeNames = {"rose", "daisy", "tulip"};

//      Arrays for random generation with one incorrect element;
        String[] colorNames = {"red", "white", "orange", "yellow"};
        String[] typeNames = {"rose", "daisy", "tulip", "sunflower"};

//      Fill Plants array with random values;
        int arraySize = 5;
        Plant[] plants = new Plant[arraySize];
        for (int i = 0; i < arraySize; i++) {
            try {
                plants[i] = nextRandomPlant(colorNames, typeNames);
            } catch (ColorException | SizeTooSmallException | SizeTooBigException | TypeException e) {
                System.out.println(e.getMessage());
            }
        }
//      Print final Plants array;
        System.out.println("===================================");
        for (Plant plant : plants) {
            System.out.println(plant.toString());
        }

    }

//  Method for automatic generation of Plants
    private static Plant nextRandomPlant(String[] colorNames, String[] typeNames) throws ColorException,
            SizeTooSmallException, TypeException, SizeTooBigException {
        while (true) {
            try {
                int colorRandomIndex = RAND.nextInt(colorNames.length);
                int typeRandomIndex = RAND.nextInt(typeNames.length);
                int newRandomSize = RAND.nextInt(60);
                return new Plant(newRandomSize, colorNames[colorRandomIndex], typeNames[typeRandomIndex]);
            } catch (ColorException | TypeException | SizeTooSmallException | SizeTooBigException e) {
                System.out.println(e.getMessage());
            }
        }
    }

//  Method for manual input of Plants
    static Plant inputPlant () {
        while (true) {
            try {
                System.out.println("Enter plant parameters");
                System.out.print("Enter plant size: ");
                int size = Integer.parseInt(SCAN.nextLine());
                System.out.print("Enter plant color: ");
                String color = SCAN.nextLine();
                System.out.print("Enter plant type: ");
                String type = SCAN.nextLine();
                return new Plant(size, color, type);
            } catch (ColorException | TypeException e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Size should be an integer!");
            } catch (SizeTooSmallException e) {
                System.out.println("Size too small! It must be between 5 and 40!");
            } catch (SizeTooBigException e) {
                System.out.println("Size too big! It must be between 5 and 40!");
            }
        }
    }
}
