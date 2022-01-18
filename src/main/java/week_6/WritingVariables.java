package week_6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingVariables {
    public static void main(String[] args) throws IOException {

        int classCode = 2454;
        double averageEnrollment = 22.15; // Average number students in a semester.
        String className = "Java";

        FileWriter writer = new FileWriter("java.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        bufferedWriter.write("The class code is: " + classCode + "\n");
        bufferedWriter.write("The average enrollment is: " + averageEnrollment + "\n");
        bufferedWriter.write("The name of the class is: " + className + "\n");

        bufferedWriter.close();

    }
}
