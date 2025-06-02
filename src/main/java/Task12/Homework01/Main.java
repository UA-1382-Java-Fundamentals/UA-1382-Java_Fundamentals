package Task12.Homework01;

import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        String sentence = "";
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Hello.Write a sentence please : ");
            sentence = sc.nextLine();
        } catch (java.util.InputMismatchException e) {
            System.out.println("No sentence");
        }

        String regex = "[,\\.\\s]";
        String[] wordsArray = sentence.split(regex);

        System.out.println("=Words array=");
        for (int i = 0;i <= wordsArray.length-1;i++){
            System.out.println(wordsArray[i].toLowerCase());
        }

        TreeMap<Integer,String> stringTreeMap = new TreeMap<>();
        for (int i = 0;i <= wordsArray.length-1;i++){
            stringTreeMap.put(wordsArray[i].length(),wordsArray[i]);
        }

        System.out.println("==".repeat(20));

        System.out.println("TreeMap of words : " + stringTreeMap);

        System.out.println("==".repeat(20));

        System.out.println("The longest word in sentence is :" + stringTreeMap.get(stringTreeMap.lastKey()) + " with " + stringTreeMap.lastKey() + " symbols.");

        System.out.println("==".repeat(20));

        char[] charArray = wordsArray[1].toCharArray();

        System.out.println("The second word in sentence is : " + wordsArray[1]);
        System.out.print("Reverse order : ");
        for (int i = charArray.length-1; i>=0; i--){
            System.out.print(charArray[i]);
        }
    }
}
