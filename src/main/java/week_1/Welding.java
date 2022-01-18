package week_1;

import static input.InputUtils.yesNoInput;

public class Welding {
    public static void main(String[] args) {

        // When taking Welding classes at MCTC, you must dress safely.
        // You should wear cotton or wool clothes. And, you should wear closed-toe shoes.

        // This program checks if a student is dressed safely for welding.

        boolean cottonClothes = yesNoInput("Are you wearing cotton clothes?");
        boolean woolCloths = yesNoInput("Are you wearing wool clothes?");
        boolean closedToeShoes = yesNoInput("Are you wearing closed-toe shoes?");

        if ((cottonClothes || woolCloths) && closedToeShoes) {
            System.out.println("You are dressed safely.");
        } else {
            System.out.println("You are not dressed safely.");
        }
    }
}
