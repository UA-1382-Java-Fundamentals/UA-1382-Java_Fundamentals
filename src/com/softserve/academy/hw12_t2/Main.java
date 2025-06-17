/*
Іnput a sentence that contains words separated by more than one space on the console. The
goal is to replace all consecutive spaces with a single space.
For instance, if you entered the
sentence "I am learning Java Fundamental", the expected result should be "I am learning
Java Fundamental ".
 */

package com.softserve.academy.hw12_t2;

public class Main {
    public static void main(String[] args) throws Exception {
        Words words = new Words();

        words.inputSentence();
        System.out.println("The sentence with single spaces: " + words.replaceSpaces());
    }
}
