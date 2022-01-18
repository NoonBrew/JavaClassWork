package week_5;

import java.util.HashMap;
import java.util.Map;

import static input.InputUtils.*;

public class Snow {
    public static void main(String[] args) {

        Map<String, Double> snowFall = new HashMap<>();
        snowFall.put("January", 3.1);
        snowFall.put("February", 10.8);
        snowFall.put("December", 3.1);

        System.out.println(snowFall);

        snowFall.put("February", 12.4);

        System.out.println(snowFall);

        System.out.println("The snow in January is " + snowFall.get("January") + " inches");

        System.out.println("The snow in july is " + snowFall.get("July") + " inches");

        if(snowFall.containsKey("July")) {
            System.out.println("There was snow in July!");
        } else {
            System.out.println("There was no snow in July");
        }

        snowFall.put("March", 4.1);
        snowFall.put("April", 0.0);
        double total = 0;
        for (double snow: snowFall.values()) {
            total += snow;
        }
        System.out.println(total);

        for (String month: snowFall.keySet()) {
            System.out.println("For " + month + " it snowed " + snowFall.get(month) + " inches");
        }
        String newMonth = stringInput("What month do you want to enter data for?");
        double snowMeasured = positiveDoubleInput("How much snow fell in inches");
//        snowFall.put(newMonth, snowMeasured);

        if(snowFall.containsKey(newMonth)) {
            // ask if we should overwrite
            double snow = snowFall.get(newMonth);
            System.out.println("The hashmap already contains the month " + newMonth + " snow= " + snow + " inches");
            boolean overWrite = yesNoInput("Overwrite data?");
            if (overWrite) {
                snowFall.put(newMonth, snowMeasured);
            } else {
                System.out.println("data was not entered. ");
            }

        }else {
            snowFall.put(newMonth, snowMeasured);
        }
        System.out.println(snowFall);
    }
}
