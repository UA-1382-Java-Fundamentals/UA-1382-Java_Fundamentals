package com.softserve.academy.edu09;

public class EntityDemo {

    public static void main(String[] args) {
        // Create three Entity objects
        Entity entity1 = new Entity();
        Entity entity2 = new Entity();
        Entity entity3 = new Entity();

        System.out.println("Count of entities: " + Entity.getCount());
    }
}
