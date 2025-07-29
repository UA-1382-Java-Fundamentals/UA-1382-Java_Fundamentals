package com.softserve.academy.homework8.practicalTask2;

public class Task2 {
    public static void main(String[] args) throws ColorException, TypeException {
        try {
            Plant plant1 = new Plant("Flower","Red", 3);
            Plant plant2 = new Plant("Tree","White", 66);
            Plant plant3 = new Plant("Bush","Black",8);
            Plant plant4 = new Plant("Grass", "GREEN", 40);
            Plant plant5 = new Plant("Flower", "Blue", 3);
            Plant [] plants = {plant1, plant2, plant3, plant4, plant5};

            for (Plant plant : plants){
                System.out.println(plant);
            }
        } catch (ColorException | TypeException e) {
            System.err.println(e.getMessage() + "\n");
        }
    }
}
