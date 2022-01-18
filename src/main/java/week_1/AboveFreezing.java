package week_1;

import static input.InputUtils.doubleInput;

public class AboveFreezing {
    public static void main(String[] args) {

        System.out.println("Enter today's temperature in F");
        double temp = doubleInput();

        if (temp > 32) {
            System.out.println("It is above freezing");
        } else {
            System.out.println("It's below freezing");
        }

    }
}
