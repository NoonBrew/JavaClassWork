package week_2;

import java.util.Arrays;

import static input.InputUtils.stringInput;

public class LoopGetDataForArray {
    public static void main(String[] args) {

        String[] textBooks = new String[5];

        // Loop - repeat 5 times. Notice the loop counter variable 'number'
        // counts from 0, 1, 2, 3, 4 - this is the same as the array element numbers
        // So, we can use the variable number to refer to each array element in turn
        // Can use a loop to read from, or write to, every array element in turn.

        for (int number  = 0; number < textBooks.length; number++) {
            //Get data about one book from the user
            String bookName = stringInput("Please enter name of textbook");

            //Use the loop counter to write to eeach array element in turn.
            textBooks[number] = bookName;
        }

        System.out.println("Thank you: Here is the data you entered.");
        for (int number = 0; number < textBooks.length; number++) {
            System.out.println("Book " + (number + 1) + " is " + textBooks[number]);
        }
    }
}
