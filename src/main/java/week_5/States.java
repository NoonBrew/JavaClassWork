package week_5;

import java.util.HashMap;
import java.util.Map;

public class States {
    public static void main(String[] args) {

        HashMap<String, String> stateAbbreviations = new HashMap<>();
        stateAbbreviations.put("Minnesota", "MN");
        stateAbbreviations.put("Wisconsin", "WI");
        stateAbbreviations.put("Michigan", "MI");
        stateAbbreviations.put("Iowa", "IA");

        System.out.println(stateAbbreviations);

        System.out.println(stateAbbreviations.get("Minnesota"));

        System.out.println(stateAbbreviations.get("Iowa"));

        String wisconsinAbbreviation = stateAbbreviations.get("Wisconsin");
        System.out.println(wisconsinAbbreviation);


        // looking up abbreviations for states.

        for (String stateName: stateAbbreviations.keySet()) {
            System.out.println(stateName);
            System.out.println(stateAbbreviations.get(stateName));
        }

        for (String abbreviation: stateAbbreviations.values()){
            System.out.println(abbreviation);
        }

        // one way - loop over key-value pairs until value is found

        String searchAbbreviation = "MI";
        for (String stateName: stateAbbreviations.keySet()) {
            System.out.println(stateName);
            String abbreviation = stateAbbreviations.get(stateName);
            if (abbreviation.equals(searchAbbreviation)) {
                System.out.println("Found it! The state for " + searchAbbreviation + " is " + stateName);
            }
        }

        Map<String, String> abbreviationsStateNames = new HashMap<>();

        for(Map.Entry<String, String> entry: stateAbbreviations.entrySet()) {
            String state = entry.getKey();
            String abbreviation = entry.getValue();
            abbreviationsStateNames.put(abbreviation, state);

        }
        System.out.println(abbreviationsStateNames);
    }
}
