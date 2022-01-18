package week_5;

import java.util.HashMap;
import java.util.Map;

public class ClassCodes {
    public static void main(String[] args) {

        Map<Integer, String> classesAndCodes = new HashMap<>();
        classesAndCodes.put(2545, "Java");
        classesAndCodes.put(1425, "Datacom");
        classesAndCodes.put(2560, "Web");
        classesAndCodes.put(2417, "Android");

        for(Integer key: classesAndCodes.keySet()) {
            String className = classesAndCodes.get(key);
            System.out.println("ITEC " + key + " " + className);
        }

        System.out.println("I am taking " + classesAndCodes.size() + " classes");
        int searchCode = 2417;
        if (classesAndCodes.containsKey(searchCode)) {
            System.out.println("This class is found in the HashMap. The class is " + classesAndCodes.get(searchCode));
        } else {
            System.out.println(searchCode + " not found.");
        }

        int searchCodeTwo = 2545; // That is us
        String className = classesAndCodes.get(searchCodeTwo);
        if (className == null) {
            System.out.println(searchCodeTwo + " not found.");
        } else {
            System.out.println("The class is found in the HashMap. The class is " + className);
        }
    }
}
