package week_2;

import static input.InputUtils.intInput;

public class ContinueExampleAddingNumbers {
    public static void main(String[] args) {

        // ask user for 5 numbers between 1 and 100, and add them up. ignore numbers outside this range.

        int numbersEntered = 0;

        int sumOfNumbers = 0;

        while (numbersEntered < 5) {
            int number = intInput("Please enter a number between 0 and 100.");

            if (number < 0 || number > 100) {
                System.out.println("You must enter a number between 0 and 100");
                continue;
            }

            numbersEntered++;

            System.out.println("You have now entered " + numbersEntered + " number(s). The last valid number you" +
                    "entered was " + number);

            sumOfNumbers = sumOfNumbers +number;
        }

        System.out.println("Thanks for using the program. The total of all the numbers was" + sumOfNumbers);
        System.out.println("And the average of all 5 numbers was " + sumOfNumbers/5);
    }
}
