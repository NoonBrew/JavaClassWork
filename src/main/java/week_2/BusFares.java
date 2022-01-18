package week_2;

import static input.InputUtils.doubleInput;

public class BusFares {
    public static void main(String[] args) {

        String[] dayNames = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        // int busTrips = 7; old method of loop limiting
        double busFare;
        double totalBusFare = 0.0;

        for(int trip = 0; trip < dayNames.length; trip++) {
            busFare = doubleInput("On " + dayNames[trip] + " of the week, what did you spend on bus fare?");
            totalBusFare = totalBusFare + busFare;
        }
        System.out.printf("For the week, you spent $%.2f for bus fares.", totalBusFare);
    }
}
