package week_6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CodeStyleCheck {
    public static void main(String[] args) {
        String filename = "ReadNumbersFromFile.java";
        int maxLineLength = 100;
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))){
            String line = reader.readLine();
            boolean linesTooLong = false;
            int lineCounter = 1;

            while (line != null){
//                System.out.println(lineCounter + " " + line); // prints each line of the file.
                if(line.length() > maxLineLength) {
                    System.out.println("Line " + lineCounter + " is too long.");
                    System.out.println("It reads:");
                    System.out.println(line);
                    linesTooLong = true;
                } // end of if statement
                lineCounter++;
                line = reader.readLine();
            }// end of while loop.

            if (linesTooLong) {
                System.out.println("There were lines that were too long");
            } else {
                System.out.println("There were no lines that were too long.");
            }
        } catch (IOException e) {
            System.out.println("File not found. " + e);
        }
    }
}
