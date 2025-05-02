package Task04;

import java.util.Scanner;

public class OddNumbers {

    private int number;

    public OddNumbers(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return  "" + number;
    }

    public boolean ifOdd(){
        if (number % 2 ==0){
           return true;
        }
        return false;
    }

    public void message () {
         OddNumbers num  = new OddNumbers(number);
        if (num.ifOdd() == true) {
            System.out.println("The number " + number + " is odd");
        }
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("First number is?:");
        int firstNum = sc.nextInt();

        System.out.println("Second number is?:");
        int secondNum = sc.nextInt();

        System.out.println("Third number is?:");
        int thirdNum = sc.nextInt();

        sc.close();

        OddNumbers first = new OddNumbers(firstNum);
        OddNumbers second = new OddNumbers(secondNum);
        OddNumbers third = new OddNumbers(thirdNum);

        first.message();
        second.message();
        third.message();
    }
}
