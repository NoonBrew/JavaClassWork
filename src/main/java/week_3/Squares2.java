package week_3;

import static input.InputUtils.doubleInput;

public class Squares2 {
    public static void main(String[] args) {

        double number = doubleInput("Please enter a number and I'll square it.");
        double squaredNumber = square(number);
        System.out.println("The square of " + number + " is " + squaredNumber);

        for (int x=1; x<=10; x++) {
            double s = square(x);
            System.out.println("The square of " + x + " is " + s);

        }

    } // This is the end of the main method.

    // This method takes one argument, a number
    // It calculates the square of that number (by multiplying it by itself)
    // and then returns the square value.

    public static double square(double n) {

        double sq = n * n;
        return sq;

    }
}
