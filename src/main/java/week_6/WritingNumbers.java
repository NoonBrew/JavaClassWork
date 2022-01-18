package week_6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingNumbers {
    public static void main(String[] args) throws IOException {

        int data1 = 67;
        int data2 = 65;
        int data3 = 84;

        double number = 12.34;

        FileWriter writer = new FileWriter("numbers.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        // when you write with just an int number it interprets it as unicode number
        // another method is to use Integer.toString() or you can also just append an empty string.
        bufferedWriter.write(data1 + "\n");
        bufferedWriter.write(data2 + "\n");
        bufferedWriter.write(data3 + "\n"); // int number argument

        bufferedWriter.write(number + "\n");
        bufferedWriter.write("Test"); // write a string

        bufferedWriter.close();
    }
}
