package softserve.academy.edu12.HW1;

//1. The task involves inputting a sentence of five words through the console. The following actions
//must be performed:
//• Identify the longest word in the sentence and display it on the console.
//• Determine the number of letters in the longest word.
//• Display the second word of the sentence in reverse order on the console.

public class Main {
    public static void main(String[] args) {
        String str = "Qui ipsum dolorem quia dolor sit amet";
        System.out.println("Initial string: \n" + str);
        System.out.println("===".repeat(15));

        String[] words = str.split(" ");
        int maxLength = 0;
        String longestWord = "";
        for (String word : words) {
            if (word.length() > maxLength) {
                longestWord = word;
                maxLength = word.length();
            }
        }
        System.out.printf("The longest word is \"%s\"\n", longestWord);
        System.out.printf("There are %d letters in it\n", longestWord.length());
        System.out.printf("The second word in the sentence is \"%s\"\n", words[1]);
        System.out.printf("Reversed it reads \"%s\"\n", stringReverse(words[1]));
    }

    static String stringReverse(String str) {
        char[] chars = str.toCharArray();
        StringBuilder reversed = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; i--) {
            reversed.append(chars[i]);
        }
        return reversed.toString();
    }
}
