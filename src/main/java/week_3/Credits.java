package week_3;

import static input.InputUtils.intInput;

public class Credits {
    public static void main(String[] args) {
        int needed = intInput("How many credits does your program require to graduate?");
        int earned = intInput("How many credits have you completed?");
        int creditsRemaining = howManyCreditsToGraduate(needed, earned);
        System.out.println("You need " + creditsRemaining + " credits to graduate.");

    } // end of the main method.

    public static int howManyCreditsToGraduate(int creditsNeeded, int creditsEarned){
        int creditsToGraduate = creditsNeeded - creditsEarned;
        return creditsToGraduate;

    }// end of the CreditsMethod.
}
