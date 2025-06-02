package Task10.HomeworkTask01;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args){

        int t = 0;

        Random r = new Random();
        int max = 100;
        int min = -100;

        LinkedList<Integer> myCollection = new LinkedList<>();
        for (int i = 0; i <= 9; i++){
            myCollection.add(r.nextInt(max - min +1) + min);
        }

        System.out.println("MY COLLECTION" + myCollection);

        ListMethods list = new ListMethods(myCollection);

        myCollection.sort(null);

        System.out.println("MY COLLECTION sorted : " + myCollection);

        list.firstToLast(myCollection);
        System.out.println("MY COLLECTION first to last :" + myCollection);

        list.insertZero(myCollection);
        System.out.println("MY COLLECTION with '0' : " + myCollection);

        list.halfInOrder(myCollection);
        list.halfInReverse(myCollection);

        list.randomNumber(myCollection);
        System.out.println("MY COLLECTION with random three-digit number : " + myCollection);


    }


}
