/*
The task involves inputting a sentence of five words through the console. The following actions
must be performed:
• Identify the longest word in the sentence and display it on the console.
• Determine the number of letters in the longest word.
• Display the second word of the sentence in reverse order on the console.
 */

package com.softserve.academy.hw12_t1;

public class Main {
    public static void main(String[] args) throws Exception {
        Words words = new Words();

        words.inputElements();
        System.out.println("The first longest word: " + words.theFirstLongestWord());
        System.out.println("Number of letters in the longest word: " + words.numberOfLettersInTheLongestWord());
        System.out.println("The second word: " + words.defineTheSecondWord());
    }
}
