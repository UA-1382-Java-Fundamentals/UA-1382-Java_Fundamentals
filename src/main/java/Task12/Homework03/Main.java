package Task12.Homework03;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        ArrayList<Double> moneyList = new ArrayList<>();

        ScanerAction sA = new ScanerAction();

        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);

        for (int i = 0; i <= 4; i++) {
            moneyList.add(sA.getScaner());
        }

        for (int i = 0; i <= moneyList.size()-1; i++){
            String formatDouble = usFormat.format(moneyList.get(i));
            System.out.println("Your amount in USA format is : " + formatDouble);
        }
    }
}
