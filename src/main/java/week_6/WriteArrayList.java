package week_6;

import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteArrayList {
    public static void main(String[] args) throws IOException {

        final String filename = "ITEC_Classes.txt";
        // Write lines to the file "ITEC 2545 Java" and "ITEC 2560 Web"
        List<String> classNames = List.of("Java", "Web", "C#");

//        List<String> classes = new ArrayList<>();
//        classes.add("Java");
//        classes.add("Web");
//        classes.add("C#");

        List<Integer> classCodes = List.of(2545, 2560, 2505);

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename));

//        for (String name: classNames) {
//            bufferedWriter.write(name + "\n");
//        }

        for (int index = 0; index < classNames.size(); index++) {
            String name = classNames.get(index);
            int code = classCodes.get(index);
            bufferedWriter.write("ITEC " + code + " " + name + "\n");
        }

        bufferedWriter.close();
        // bufferedReader interacts with the file we tell it too. If we wanted it to interact with
        // a different file we would have to call a different filename.
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));

        List<String> classDescriptions = new ArrayList<>();

        String line = bufferedReader.readLine();

        while (line != null) {
            classDescriptions.add(line);
            line = bufferedReader.readLine();

        }
        bufferedReader.close();

        System.out.println("End of File reached");
        System.out.println(classDescriptions);

    }
}
