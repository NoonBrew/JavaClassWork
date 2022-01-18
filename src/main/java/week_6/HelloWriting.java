package week_6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class HelloWriting {
    public static void main(String[] args) {

        // if file doesn't exist it will be created, if it does exist
        // it will be overwritten.
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("hello.txt"))) {
//        FileWriter writer = new FileWriter("hello.txt");
//        BufferedWriter bufferedWriter = new BufferedWriter(writer);

            bufferedWriter.write("Hello\n");
//        bufferedWriter.newLine(); also creates a new line.
            bufferedWriter.write("Write more data here\n");
            bufferedWriter.write("Goodbye\n");
            // close essentially allows the data to go throw a save procedure.
            bufferedWriter.close(); // do not forget.
        } catch (IOException e){
            System.out.println("Error writing to file " + e);
        }

        try (FileWriter writer2 = new FileWriter("hello.txt", true)) { // append flag = true means data to end.
            BufferedWriter bufferedWriter2 = new BufferedWriter(writer2);
            bufferedWriter2.write("Other data!");
            bufferedWriter2.newLine();
            bufferedWriter2.write("Hello programmers!");
            bufferedWriter2.newLine();
            bufferedWriter2.write("End of file!");
            bufferedWriter2.newLine();

            bufferedWriter2.close();
        }catch (IOException e){
            System.out.println("Error appending data to file " + e);
        }
    }
}
