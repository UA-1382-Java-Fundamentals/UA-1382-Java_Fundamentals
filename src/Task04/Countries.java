package Task04;

import java.util.Scanner;

public class Countries {

    enum Continent {
        AFRIKA, ASIA, EUROPA, SOUTH_AMERIKA, NORTH_AMERIKA, AUSTRALIA, ANTARKTIDA
    }

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Write the name of country please:");
        String country = sc.nextLine();
        sc.close();

        switch(country){
            case "USA":
                System.out.println("This is : " + Continent.NORTH_AMERIKA);
                break;
            case "Poland":
                System.out.println("This is : " + Continent.EUROPA);
                break;
            case "France":
                System.out.println("This is : " + Continent.EUROPA);
                break;
            case "India":
                System.out.println("This is : " + Continent.ASIA);
                break;
            case "Cina":
                System.out.println("This is : " + Continent.ASIA);
                break;
            case "Australia":
                System.out.println("This is : " + Continent.AUSTRALIA);
                break;
            case "Brasil":
                System.out.println("This is : " + Continent.SOUTH_AMERIKA);
                break;
            case "Colombia":
                System.out.println("This is : " + Continent.SOUTH_AMERIKA);
                break;
            case "Cenia":
                System.out.println("This is : " + Continent.AFRIKA);
                break;
            case "Antarktida":
                System.out.println("This is : " + Continent.ANTARKTIDA);
                break;

        }
    }
}
