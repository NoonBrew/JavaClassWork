package week_2;

import static input.InputUtils.intInput;

public class SquareOfStars {
    public static void main(String[] args) {

        // Display a square of *
        //The outer loop prints one row per loop
        for (int x = 0; x < 5; x++){

            //Inner for loop. For each row, prints a star 5 times.
            for (int y = 0; y < 5; y++) {
                //Notice System.out.print - not printLn. this doesn't add a new line
                //at the end of the output, so all the stars are on the same line.
                System.out.print("*");
            }

            //And then move to the next line
            System.out.println();
        }

        int height = intInput("How many rows should the square have?");
        int width = intInput("How many wide should the square be?");

        for (int x = 0; x<height; x++) {

            for (int y=0; y<width; y++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }
}
