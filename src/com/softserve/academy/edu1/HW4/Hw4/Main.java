package com.softserve.academy.edu1.HW4.Hw4;

public class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog("Leo",1);
        Dog d2 = new Dog("Kasta",1);
        Dog d3 = new Dog("Marela",1);
        d1.checkDogType("Golden_Retriever");
        d2.checkDogType("Labrador_retriever");
        d3.checkDogType("German_Shepherd");
    }
}
