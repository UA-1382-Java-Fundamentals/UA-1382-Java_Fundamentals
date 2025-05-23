package Task10.PracticalTask03;

import java.util.*;

public class Main {

    public static void main(String[] args){

        Random r = new Random();
        int max = 100;
        int min = -100;

        List<Integer> myCollection = new ArrayList<>();
        for (int i = 0; i <= 10; i++){
            myCollection.add(r.nextInt(max - min +1) + min);
        }

        System.out.println("MYCOLLECTION" + myCollection);

        List<Integer> newCollection = new ArrayList<>();
        for(int i = 0; i <= myCollection.size()-1; i++){
            if(myCollection.get(i) > 5){
                newCollection.add(myCollection.get(i));
            }
        }

        System.out.println("COLLECTION WITH > '5' NUMBERS" + newCollection);

        List<Integer> newCollection1 = new ArrayList<>();
        for(int i = 0; i <= myCollection.size()-1; i++) {
            if (myCollection.get(i) < 20) {
                newCollection1.add(myCollection.get(i));
            }
        }

        System.out.println("COLLECTION WITH < '20' NUMBERS" + newCollection1);

        try {
            myCollection.add(1, 2);
            myCollection.add(8, -3);
            myCollection.add(5, -4);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("This index not exist");
        }

        for(int i = 0; i <= myCollection.size()-1; i++) {
            System.out.println("Position " + i + " , value of element - " + myCollection.get(i));
        }

        myCollection.sort(null);
        System.out.println("Sorted list : " + myCollection);
    }
}
