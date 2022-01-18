package week_6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadNumbersFromFile {

    public static void main(String[] args) throws IOException {

        List<Integer> numbers = new ArrayList<>();
        String filename = "numbers.txt";

        BufferedReader reader = new BufferedReader(new FileReader(filename));

        String line = reader.readLine();

        while (line != null) {
            // ignore anything that isn't an integer.
            try {
                int number = Integer.parseInt(line);
                numbers.add(number);
            } catch (NumberFormatException e){
                System.out.println(line + " Is not an integer.");
            }
            line = reader.readLine();
        }

        System.out.println(numbers);
    }
}
