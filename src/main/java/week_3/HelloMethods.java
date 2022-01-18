package week_3;

import static input.InputUtils.stringInput;

public class HelloMethods {
    public static void main(String[] args) {

        String name = stringInput("Please enter your name.");
        String greeting = makeGreeting(name);
        System.out.println(greeting);
    } //This is the end of the main method

    //A new method that we've created.
    //This method takes one argument, a String.
    // It will create a new string made from word "Hello"
    // Plus the string argument, plus an exclamation point !
    // It will than return that new greeting String.

    public static String makeGreeting(String name) {

        String greeting = "Hello " + name + "!";
        return greeting;
    } // The End of the makeGreeting Method
} // End of the HelloMethods class
