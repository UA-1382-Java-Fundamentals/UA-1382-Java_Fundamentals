/*
Create a console application that validates user input for their first and last name, ensuring that
they only contain English letters, spaces, and hyphens. If the input data is incorrect, prompt the user
to re-enter the data. Upon successful entry of the user's first and last names, generate a random
greeting message that includes the user's name.

To validate the user input, utilize String class methods, control loops, and regular expressions.
Generate the random greeting message (use printf() method for output) by creating an array of
phrases that contain various text options with the user's name inserted.
 */

package com.softserve.academy.hw12_t4;

public class Main {
    public static void main(String[] args) throws Exception {
        TextOperations textOperations = new TextOperations();

        textOperations.validateFirstNameAndLastName();
        textOperations.printf();
    }
}
