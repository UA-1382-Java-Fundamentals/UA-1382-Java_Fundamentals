package com.softserve.academy.homework4.practicalTask4;

public class Task4 {
    public static void main(String[] args) {
        Product Butter = new Product(103.2,"Butter",1);
        Product Egg = new Product(14, "Egg", 12);
        Product Apple = new Product(60, "Apple",3);
        Product Milk = new Product(234, "Milk", 4);

        Product mostExpensive = Butter;
        if(Apple.price > mostExpensive.price){
            mostExpensive = Apple;
        }
        if (Egg.price > mostExpensive.price){
            mostExpensive = Egg;
        }
        if (Milk.price > mostExpensive.price){
            mostExpensive = Milk;
        }

        Product mostQuantity = Butter;
        if(Apple.quantity > mostExpensive.quantity){
            mostQuantity = Apple;
        }
        if (Egg.quantity > mostExpensive.quantity){
            mostQuantity = Egg;
        }
        if (Milk.quantity > mostExpensive.quantity){
            mostQuantity = Milk;
        }

        System.out.println("Most expensive product: " + mostExpensive.name + ", Quantity: " + mostExpensive.quantity);
        System.out.println("Product with the largest quantity: " + mostQuantity.name);

    }
}
