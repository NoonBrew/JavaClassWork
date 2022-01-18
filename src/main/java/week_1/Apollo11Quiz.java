package week_1;

import static input.InputUtils.intInput;

public class Apollo11Quiz {
    public static void main(String[] args) {

        System.out.println("Quiz time!");
        System.out.println("What year did the Apollo 11 Spaceship land on the moon");

        int answer = intInput();

        if (answer != 1969) {
            System.out.println("Wrong answer - it was 1969");
        }

    }
}
