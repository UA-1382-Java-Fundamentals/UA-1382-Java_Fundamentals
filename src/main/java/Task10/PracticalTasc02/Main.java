package Task10.PracticalTasc02;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        Integer number = null;

            System.out.println("Hello.Write a numbers like : '1,2,3,4,5' :");
            str = sc.nextLine();

        String[] strNumbs = str.split(",");
        List<Integer> listNumbs =new ArrayList<Integer>();
        for(String l :strNumbs){
            try{
            number = Integer.parseInt(l);
            }catch (NumberFormatException e){
                System.out.println("NumberFormatException. PLEACE ENTER ONLY NUMBERS");
            }
            listNumbs.add(number);
        }

        HashSet<Integer> hsetNumbs = new HashSet<Integer>(listNumbs);

        System.out.println("Result" + hsetNumbs);


    }
}
