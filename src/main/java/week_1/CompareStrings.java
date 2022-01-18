package week_1;

import static input.InputUtils.stringInput;

public class CompareStrings {
    public static void main(String[] args) {

        String college = stringInput("Which college do you attend?");

        // .equals and .equalsIgnoreCase are used to compare strings not ==
        if (college.equalsIgnoreCase("MCTC")) {
            System.out.println("Yay, MCTC!");
        } else {
            System.out.println("To bad you should check out MCTC.");
        }

    }
}
