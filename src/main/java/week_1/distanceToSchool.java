package week_1;

import static input.InputUtils.positiveDoubleInput;

public class distanceToSchool {
    public static void main(String[] args) {

        double milesToMCTC = positiveDoubleInput("How many miles is it from your house to MCTC?");

        // Does the user live more than 10 miles away?

        if (milesToMCTC > 10) {
            System.out.println("You live more then 10 miles from MCTC!");
        } else if (milesToMCTC == 10) {
            System.out.println("You live exactly 10 miles form MCTC!");
        } else {
            System.out.println("You live less than 10 miles from MCTC!");
        }

        double milesToKM = milesToMCTC * 1.6;

        System.out.printf("That is %.2f kilometers!", milesToKM);
    }
}
