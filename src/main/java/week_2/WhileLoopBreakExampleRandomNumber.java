package week_2;

import java.util.Random;

import static input.InputUtils.stringInput;

public class WhileLoopBreakExampleRandomNumber {
    public static void main(String[] args) {

        Random randomNumberGenerator = new Random();

        while (true) {

            System.out.println("Would you like a random number?");
            System.out.println("Enter any key for a random number, or Q to quit");

            String userInput = stringInput();

            if (userInput.equalsIgnoreCase("Q")) {
                break; //immediately stops the loop, jumps to next statement after loop
            }
            //If we get to this line, the loop didn't break
            //jGenerate and display a random number.
            int randomNumber = randomNumberGenerator.nextInt();

            // .nextInt() with no argument generate a random number from all possible integer values.

            System.out.println("Your random number is " + randomNumber);
        }

        System.out.println("Thanks for using the program - bye!");
    }
}
