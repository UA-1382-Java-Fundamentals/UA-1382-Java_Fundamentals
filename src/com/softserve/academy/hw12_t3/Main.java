/*
The task requires implementation of a pattern to match US currency format, which includes a
dollar sign ($) followed by any number of digits, a dot, and two digits after the dot.

The next step is to input a text containing several instances of US currency format via the console.

Finally, display all the occurrences of US currency format on the console screen.
 */

package com.softserve.academy.hw12_t3;

public class Main {
    public static void main(String[] args) throws Exception {
        Text text = new Text();

        text.inputText();
        text.outputUsCurrencyFormat();
    }
}
