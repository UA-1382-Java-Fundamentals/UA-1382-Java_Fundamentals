package com.softserve.academy.edu1.practice.lesson4;

import java.util.Scanner;

public class CountryContinent {
    enum Continent {
        EUROPE, ASIA, AFRICA, NORTH_AMERICA, SOUTH_AMERICA, AUSTRALIA, ANTARCTICA
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter country: ");
        String country = scanner.nextLine();

        Continent continent;

        switch (country.toLowerCase()) {
            case "germany":
            case "france":
            case "ukraine":
                continent = Continent.EUROPE;
                break;
            case "china":
            case "japan":
            case "india":
                continent = Continent.ASIA;
                break;
            case "egypt":
            case "nigeria":
                continent = Continent.AFRICA;
                break;
            case "usa":
            case "canada":
                continent = Continent.NORTH_AMERICA;
                break;
            case "brazil":
            case "argentina":
                continent = Continent.SOUTH_AMERICA;
                break;
            case "australia":
                continent = Continent.AUSTRALIA;
                break;
            case "antarctica":
                continent = Continent.ANTARCTICA;
                break;
            default:
                System.out.println("Country not found.");
                return;
        }

        System.out.println("Continent: " + continent);
    }
}
