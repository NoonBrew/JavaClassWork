package week_4;

import java.util.*;

import static input.InputUtils.*;

public class GuestList {
    public static void main(String[] args) {

        Random rnd = new Random();
        int randomNumber = rnd.nextInt(10); // 0-9
        int randomNumberBetween1and10 = rnd.nextInt(10) +1;

        System.out.println(randomNumber + " " + randomNumberBetween1and10);

        List<String> guestList = new ArrayList<>();

        while (true) {
            String guest = stringInput("Enter a name of a guest you would like to add to the list or press " +
                    "enter to quit.");
            if (guest.isEmpty()) {
                break;
            } // end if statement

            if (containsIgnoresCase(guestList, guest)) {
                System.out.println("You already added " + guest);
            } else {
                System.out.println("Adding " + guest + " to list");
                guestList.add(guest);
            }


        }
        Collections.sort(guestList);

        printGuestNames(guestList);

        while(yesNoInput("Would you like to remove a guest from the list?")){
            System.out.println("Here is your current guest list");
            printGuestNames(guestList);
            if (guestList.isEmpty()) {
                System.out.println("There are no more guest to remove.");
                break;
            }
            int index = positiveIntInput("Enter the number of the guest you want to remove");
            index--;
            if (index < guestList.size()) {
                String removedGuest = guestList.remove(index);
                System.out.println("Removed guest " + removedGuest);
            }else {
                System.out.println("Error - please enter a valid guest number");
            }


        }



    } // end of main

    public static void selectPrizeWinner(List<String> guestList) {

        if (guestList.isEmpty()) {
            System.out.println("There is no guest in the list");
            return;
        }

        printGuestNames(guestList);
        System.out.println("The number of guests is :" + guestList.size());

        Random rng = new Random();
        int randomGuestIndex = rng.nextInt(guestList.size());
        System.out.println("Guest number " + (randomGuestIndex+1) +" " +guestList.get(randomGuestIndex)+ " wins a prize!");

    }

    public static void printGuestNames(List<String> guests) {

        if (guests.isEmpty()) {
            System.out.println("There are no guests in the list.");
        } else {
            for (int x = 0; x < guests.size(); x++) {
                System.out.println(x + 1 + ": " + guests.get(x));
            }
        }

    }

    public static boolean containsIgnoresCase(List<String> list, String data) {

        for (String item: list) {
            if (item.equalsIgnoreCase(data)) {
                return true;
            } // end if statement
        } // end for loop.

        return false;
    }
}
