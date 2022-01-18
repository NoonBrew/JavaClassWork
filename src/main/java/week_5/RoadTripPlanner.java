package week_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static input.InputUtils.positiveIntInput;

public class RoadTripPlanner {
    public static void main(String[] args) {
        // Map.of makes an immutable HashMap which is valuable when you have a
        // Hashmap that you don't want being modified.
        // Can not use cityMiles.put() with this method.
        Map<String, Integer> cityMiles = Map.of(
                "Duluth", 154,
                "Brainerd", 127,
                "Stillwater", 26,
                "Ely", 245,
                "Red Wing", 54
        );

//        Map<String, Integer> cityMiles = new HashMap<>();
//        cityMiles.put("Duluth", 154);
//        cityMiles.put("Brainerd", 127);
//        cityMiles.put("Stillwater", 26);
//        cityMiles.put("Ely", 245);
//        cityMiles.put("Red Wing", 54);

       int howFarToDrive = positiveIntInput("What is the maximum number of miles you are willing to drive?");

       List<String> citiesInRange = new ArrayList<>();

       for(String city: cityMiles.keySet()) {
           if(cityMiles.get(city) <= howFarToDrive) {
               citiesInRange.add(city);
           }
       }
        System.out.println(citiesInRange);

       if (citiesInRange.isEmpty()) {
           System.out.println("Sorry no Minnesota cities are within your driving Distance");
       } else {
           System.out.println("Here are the cities you can drive to " + citiesInRange.size());
           for (String city: citiesInRange) {
               System.out.println(city);
           }
       }
    }
}
