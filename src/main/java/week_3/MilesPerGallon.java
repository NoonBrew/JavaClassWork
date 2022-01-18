package week_3;

import static input.InputUtils.doubleInput;

public class MilesPerGallon {
    public static void main(String[] args) {

        double milesDriven = doubleInput("How many miles have you driven?");
        double gallonsUsed = doubleInput("How many gallons of gas did you use?");

        double milesPerGal = mpgCalculator(milesDriven, gallonsUsed);

        System.out.println("You have driven " + milesDriven + " miles, using " + gallonsUsed + " gallons " +
                "making your miles per gallon = " + milesPerGal);

    } // End of main function

    public static double mpgCalculator(double miles, double gallons){
       double fuelEfficiency = miles/gallons;
       return fuelEfficiency;

    }
}
