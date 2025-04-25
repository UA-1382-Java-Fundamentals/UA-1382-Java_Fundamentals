package softserve.academy.edu1.hw4.taskPractical3;

import java.util.Scanner;

enum Continents {
    AFRICA, EURASIA, NORTHAMERICA, AUSTRALIA, SOUTHAMERICA, ANTARCTICA
}

public class ContinentMatcher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Continents continents;
        int continentSelector = 0;
        String[] countries = new String[6];
        int error = 1;

        countries[0] = "Algeria; Angola; Benin; Botswana; Burkina Faso; Burundi; Cabo Verde; Cameroon; " +
                "Central African Republic; Chad; Comoros; Congo; Democratic Republic of the Congo; Djibouti; Egypt; " +
                "Equatorial Guinea; Eritrea; Eswatini; Ethiopia; Gabon; Gambia; Ghana; Guinea; Guinea-Bissau; " +
                "Côte d'Ivoire; Kenya; Lesotho; Liberia; Libya; Madagascar; Malawi; Mali; Mauritania; Mauritius; " +
                "Morocco; Mozambique; Namibia; Niger; Nigeria; Rwanda; Sao Tome and Principe; Senegal; Seychelles; " +
                "Sierra Leone; Somalia; South Africa; South Sudan; Sudan; Tanzania; Togo; Tunisia; Uganda; Zambia; " +
                "Zimbabwe;";
        countries[0] = countries[0].toLowerCase();

        countries[1] = "Afghanistan; Armenia; Azerbaijan; Bahrain; Bangladesh; Bhutan; " +
                "British Indian Ocean Territory; Brunei; Cambodia; China; Cyprus; Egypt; Georgia; Hong Kong; India; " +
                "Indonesia; Iran; Iraq; Israel; Japan; Jordan; Kazakhstan; Kuwait; Kyrgyzstan; Laos; Lebanon; Macau; " +
                "Malaysia; Maldives; Mongolia; Myanmar; Nepal; North Korea; Oman; Pakistan; Palestine; Philippines; " +
                "Qatar; Saudi Arabia; Singapore; South Korea; Sri Lanka; Syria; Taiwan; Tajikistan; Thailand; " +
                "East Timor; Turkey; Turkmenistan; United Arab Emirates; Uzbekistan; Vietnam; Yemen;" +
                "Albania; Andorra; Armenia; Austria; Azerbaijan; Belarus; Belgium; Bosnia and Herzegovina; Bulgaria; " +
                "Croatia; Cyprus; Czech Republic; Denmark; Estonia; Finland; France; Georgia; Germany; Greece; Hungary; " +
                "Iceland; Ireland; Italy; Kazakhstan; Latvia; Liechtenstein; Lithuania; Luxembourg; Malta; Moldova; " +
                "Monaco; Montenegro; Netherlands; North Macedonia; Norway; Poland; Portugal; Romania; San Marino; " +
                "Serbia; Slovakia; Slovenia; Spain; Sweden; Switzerland; Turkey; Ukraine; United Kingdom; Vatican City;";
        countries[1] = countries[1].toLowerCase();

        countries[2] = "Antigua and Barbuda; Bahamas; Barbados; Belize; Canada; Costa Rica; Cuba; Dominica; " +
                "Dominican Republic; El Salvador; Grenada; Guatemala; Haiti; Honduras; Jamaica; Mexico; Nicaragua; " +
                "Panama; Saint Kitts and Nevis; Saint Lucia; Saint Vincent and the Grenadines; Trinidad and Tobago; " +
                "United States of America;";
        countries[2] = countries[2].toLowerCase();

        countries[3] = "Australia; Fiji; Kiribati; Marshall Islands; Micronesia; Nauru; New Zealand; Palau; " +
                "Papua New Guinea; Samoa; Solomon Islands; Tonga; Tuvalu; Vanuatu;";
        countries[3] = countries[3].toLowerCase();

        countries[4] = "Argentina; Bolivia; Brazil; Chile; Colombia; Ecuador; Guyana; Paraguay; Peru; Suriname; " +
                "Uruguay; Venezuela;";
        countries[4] = countries[4].toLowerCase();

        countries[5] = "Antarctica;";
        countries[5] = countries[5].toLowerCase();

        System.out.println("Enter the name of the country: ");
        String countryName = sc.nextLine();
        countryName = countryName.toLowerCase();

        for (int i = 0; i < countries.length; i++) {
            if (countries[i].contains(countryName)) {
                continentSelector = i;
                error = 0;
                break;
            }
        }

        if (error == 0) {
            continents = switch (continentSelector) {
                case 0 -> Continents.AFRICA;
                case 1 -> Continents.EURASIA;
                case 2 -> Continents.NORTHAMERICA;
                case 3 -> Continents.AUSTRALIA;
                case 4 -> Continents.SOUTHAMERICA;
                case 5 -> Continents.ANTARCTICA;
                default -> throw new IllegalStateException("Unexpected value: " + continentSelector);
            };
            System.out.println(continents);
        }
        else {
            System.out.println("Country not found");
        }
    }
}
