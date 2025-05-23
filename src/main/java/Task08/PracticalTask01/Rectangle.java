package Task08.PracticalTask01;

import java.util.Scanner;

public class Rectangle {
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int squareRectangle(int a,int b) {
        return a * b;
    }

    public static void main(String[] args) {

    int first = 0 ;
    int second = 0;

        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Hello.Write 1 side of rectangle:");
            first = sc.nextInt();
            if (first < 0) {
                // this gets caught in the catch block
                throw new IllegalArgumentException();
            }

            System.out.println("Hello.Write 2 side of rectangle:");
            second = sc.nextInt();
            if (second < 0) {
                // this gets caught in the catch block
                throw new IllegalArgumentException();
            }

            sc.close();

            Rectangle rectangle = new Rectangle(first,second);
            System.out.println("The square of rectangle :" + rectangle.squareRectangle(first,second));

        } catch (NumberFormatException e ) {
            System.out.println("NumberFormatException");

        } catch (IllegalArgumentException e ) {
            System.out.println("Only Positive Numbers Please!");

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");

        } catch (Exception e) {
            System.out.println("Only NUMBERS Please!");
        }
    }
}
