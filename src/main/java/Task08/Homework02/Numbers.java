package Task08.Homework02;

import java.util.Scanner;

public class Numbers {

    public int readNumber(int start, int end) {
        int result = 0;

        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Hello.Write a number from " + start + " to " + end + ":");
            result = sc.nextInt();
            if (result <= start || result >= end) {
                throw new IllegalArgumentException();
            }
            else {
               return result;
            }
        } catch (NumberFormatException e ) {
            System.out.println("NumberFormatException");

        } catch (IllegalArgumentException e ) {
            System.out.println("Only from " + start + " to " + end + " Please!");

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");

        } catch (Exception e) {
            System.out.println("Only NUMBERS Please!");
        }

        return result;
        }

    public static void main(String[] args){

      Numbers area = new Numbers();
      Integer[] list = new Integer[10];

      for(int i =0 ; i <= 9; i++) {
         list[i] =  area.readNumber(-100, 100);
      }

        for(int i =0 ; i <= list.length -1 ; i++){
            System.out.print(list[i] + " / ");
        }
    }
}

