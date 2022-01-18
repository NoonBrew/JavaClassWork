package week_1;

import static input.InputUtils.doubleInput;
import static input.InputUtils.intInput;

public class BloodDonor {
    public static void main(String[] args) {

        System.out.println("What is your weight?");
        double weight = doubleInput();

        System.out.println("How old are you?");
        int age = intInput();

        if (weight >= 100 && age >= 17) {
            System.out.println("You are eligible to be a blood donor.");
        } else {
            System.out.println("Sorry, you are not eligible to donate blood.");
            if (age < 17) {
                System.out.println("You are not old enough.");
            }
            if (weight < 110) {
                System.out.println("You do not weigh enough.");
            }
        }
    }
}
