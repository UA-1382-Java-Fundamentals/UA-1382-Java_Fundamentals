/*
Create a program (in different java documents) that prompts the user to enter:
• a month number and calculates the number of days in that month based on an array that contains
the number of days in each month.

• 10 integers numbers and calculates the sum of the first five elements if they are positive, or the
product of the last five elements if they are not and output the result.

• 5 integer numbers and find:
o position of second positive number;
o minimum value and its position in the array.
o calculate the product of all entered even numbers (exclude 0 from even if entered by user).
 */

package com.softserve.academy.hw5_t1;

public class Main {
    public static void main(String[] args) {
        Month month = new Month();
        month.setInputMonth(month.inputMonth());
        month.outputNumberOfDays(month.getInputMonth());

        TenNumbers numbers1 = new TenNumbers();
        numbers1.calculateForTenNumbers(numbers1.inputNumbers());

        FiveNumbers numbers2 = new FiveNumbers();
        numbers2.calculateForFiveNumbers(numbers2.inputNumbers());
    }
}
