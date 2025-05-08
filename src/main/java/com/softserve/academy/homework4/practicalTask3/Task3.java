package com.softserve.academy.homework4.practicalTask3;

import java.util.Scanner;

import static com.softserve.academy.homework4.practicalTask3.Continent.*;

public class Task3 {

    public static void main(String[] args) {
        System.out.println("Enter the name of the country");
        Scanner scanner = new Scanner(System.in);
        String country = scanner.nextLine();

        Continent Continent = switch (country){
            case "Algeria", "Angola", "Benin", "Botswana", "Burkina Faso", "Burundi", "Cabo Verde", "Cameroon",
                 "Central African Republic", "Chad", "Comoros", "Democratic Republic of the Congo", "Republic of the Congo",
                 "Côte d'Ivoire", "Djibouti", "Egypt", "Equatorial Guinea", "Eritrea", "Eswatini", "Ethiopia", "Gabon", "Gambia",
                 "Ghana", "Guinea", "Guinea-Bissau", "Kenya", "Lesotho", "Liberia", "Libya", "Madagascar", "Malawi", "Mali", "Mauritania",
                 "Mauritius", "Morocco", "Mozambique", "Namibia", "Niger", "Nigeria", "Rwanda", "São Tomé and Príncipe", "Senegal", "Seychelles",
                 "Sierra Leone", "Somalia", "South Africa", "South Sudan", "Sudan", "Tanzania", "Togo", "Tunisia", "Uganda", "Zambia", "Zimbabwe"
                -> AFRICA;
            case "Albania", "Andorra", "Austria", "Belarus", "Belgium", "Bosnia and Herzegovina",
                 "Bulgaria", "Croatia", "Cyprus", "Czech Republic", "Denmark", "Estonia", "Finland", "France", "Georgia", "Germany",
                 "Greece", "Hungary", "Iceland", "Ireland", "Italy", "Kosovo", "Latvia", "Liechtenstein", "Lithuania",
                 "Luxembourg", "Malta", "Moldova", "Monaco", "Montenegro", "Netherlands", "North Macedonia", "Norway", "Poland", "Portugal",
                 "Romania", "San Marino", "Serbia", "Slovakia", "Slovenia", "Spain", "Sweden", "Switzerland", "Turkey", "Ukraine",
                 "United Kingdom", "Vatican City" -> EUROPE;
            case "Afghanistan", "Armenia", "Azerbaijan", "Bahrain", "Bangladesh", "Bhutan", "Brunei", "Cambodia", "China",
                 "India", "Indonesia", "Iran", "Iraq", "Israel", "Japan", "Jordan", "Kazakhstan", "Kuwait",
                 "Kyrgyzstan", "Laos", "Lebanon", "Malaysia", "Maldives", "Mongolia", "Myanmar", "Nepal", "North Korea", "Oman", "Pakistan",
                 "Palestine", "Philippines", "Qatar", "Russia", "Saudi Arabia", "Singapore", "South Korea", "Sri Lanka", "Syria", "Taiwan", "Tajikistan",
                 "Thailand", "Timor-Leste", "Turkmenistan", "United Arab Emirates", "Uzbekistan", "Vietnam", "Yemen" -> ASIA;
            case "Antigua and Barbuda", "Bahamas", "Barbados", "Belize", "Canada", "Costa Rica", "Cuba", "Dominica", "Dominican Republic",
                 "El Salvador", "Grenada", "Guatemala", "Haiti", "Honduras", "Jamaica", "Mexico", "Nicaragua", "Panama", "Saint Kitts and Nevis",
                 "Saint Lucia", "Saint Vincent and the Grenadines", "Trinidad and Tobago", "United States" -> NORTH_AMERICA;
            case "Argentina", "Bolivia", "Brazil", "Chile", "Colombia", "Ecuador", "Guyana", "Paraguay", "Peru", "Suriname", "Uruguay", "Venezuela"
                -> SOUTH_AMERICA;
            case "Australia", "Fiji", "Kiribati", "Marshall Islands", "Micronesia", "Nauru", "New Zealand", "Palau", "Papua New Guinea",
                 "Samoa", "Solomon Islands", "Tonga", "Tuvalu", "Vanuatu" -> AUSTRALIA;
            case "Antarctica"-> ANTARCTICA;
            default-> {
                System.out.println("Country not found.");
                yield null;
            }

        };
        System.out.println(Continent);

    }

}
