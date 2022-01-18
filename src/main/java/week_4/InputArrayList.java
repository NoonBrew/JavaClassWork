package week_4;

import java.util.ArrayList;
import java.util.List;

import static input.InputUtils.stringInput;

public class InputArrayList {
    public static void main(String[] args) {
        List<String> todoList = new ArrayList<>();

        while (true) {
            String data = stringInput("Type a task you need to do, or Enter to quit.");
            if (data.length() == 0) {
                break;
            }//end of if statement.
            if (containsIgnoresCase(todoList, data)){
                System.out.println("That task is already on the list");
                continue;
            }
            todoList.add(data);
        }// end of while loop

        System.out.println("Thank you, your tasks are:");

        for (String input: todoList) {
            System.out.println(input);
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
