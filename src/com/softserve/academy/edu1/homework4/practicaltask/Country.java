package homework4.practicaltask;

// 3. Declare an enum with the names of continents (e.g., Europe, Asia, Africa, etc.).
// Ask the user to enter the name of the country from the console. Using a switch statement, determine the continent to which the entered country belongs and output the name of the continent.
// Output the result to the console.


import java.util.Scanner;


enum Continents {
    EUROPE, AFRICA, NORTH_AMERICA, SOUTH_AMERICA, AUSTRALIA, ASIA
}

public class Country {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the country: ");
        String input = sc.nextLine().trim().toLowerCase();
        String country = Character.toUpperCase(input.charAt(0)) + input.substring(1).toLowerCase();
        Continents continent = switch (country) {
            case "Ukraine", "Germany", "Italy", "England", "Poland", "Romania", "Croatia", "Slovakia", "Spain",
                 "Denmark", "Finland", "Sweden", "Belgium", "Hungary" -> Continents.EUROPE;
            case "Egypt", "South Africa", "Eritrea", "Somali", "DR Kongo", "Kongo", "Mali", "Malawi", "Sierra Lion",
                 "Cameron", "Morocco", "Tanzania", "Niger", "Nigeria", "Burkino Fasso" -> Continents.AFRICA;
            case "USA", "Canada", "Mexico", "Costa Rica", "Panama", "Nicaragua", "Belize" -> Continents.NORTH_AMERICA;
            case "Brazil", "Argentina", "Columbia", "Venezuela", "Paraguay", "Chili", "Uruguay", "Peru", "Suriname" ->
                    Continents.SOUTH_AMERICA;
            case "China", "Vietnam", "North Korea", "South Korea", "Mongolia", "Turkey" -> Continents.ASIA;
            case "Australia" -> Continents.AUSTRALIA;
            default -> throw new IllegalArgumentException("Unknown country: " + country);
        };
        System.out.println("This country belongs to " + continent);
    }

}