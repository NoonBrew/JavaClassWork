package week_2;

import static input.InputUtils.stringInput;

public class WhileLoopPassword {
    public static void main(String[] args) {

        String secretPassword = "kittens";
        System.out.println();
        String userPassword = stringInput("Enter the password");
        int maxGuesses = 5;
        //Always use the .equals() method to check if two strings have the exact same characters

        //Before we let the user in, we need to check that the password is correct
        //This loop will repeat while the password is NOT kittens, our secret password.
        while (! userPassword.equals(secretPassword) && maxGuesses > 1) {

            //The user got the password wrong. print an error message
            System.out.println("Password incorrect, access denied!");
            // ask the user to try again
            System.out.println("Try again");
            // Replace userPassword with new attempt.
            userPassword = stringInput("Enter the password");
            //If the user gets it wrong, loop continues.
            maxGuesses--;
        }

        if(maxGuesses > 1) {
            // if the loop condition is false, the user got the password right.
            // Print 'access granted' method.

            System.out.println("Correct password -- Access granted");
        } else {
            System.out.println("Max number of password attempts.");
            System.exit(0);
        }


    }
}
