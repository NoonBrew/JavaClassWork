package week_2;

import java.util.Random;

import static input.InputUtils.intInput;

public class SecretNumber {
    public static void main(String[] args) {

        Random randomNumber = new Random();
        int secretNumber = randomNumber.nextInt(100) + 1; // 1 - 100
        int userNumber = intInput("Guess what number I am thinking of.");

        while(userNumber != secretNumber) {
            System.out.println("That is not the number I am thinking of.");
            if (userNumber < secretNumber) {
                System.out.println("Your number was too low.");
            }else {
                System.out.println("Your number was too high.");
            }
            userNumber = intInput("Guess again.");
        }

        System.out.println("That is correct, the number I was thinking of was " + secretNumber);
    }
}
