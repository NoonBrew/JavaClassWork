package week_4;

import java.util.ArrayList;
import java.util.List;

public class AddingLists {
    public static void main(String[] args) {

        List<Integer> classCodes = new ArrayList<>();
        classCodes.add(2545);
        classCodes.add(1150);
        classCodes.add(1250);
        System.out.println(classCodes);
        System.out.println(classCodes.size());

        for (int classCode: classCodes) {
            System.out.println("ITEC " + classCode);
        }
    }
}
