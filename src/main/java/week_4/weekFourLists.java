package week_4;

import java.util.ArrayList;
import java.util.List;

public class weekFourLists {

    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();

        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("MCTC");
        arrayList.add("Nate");

        for (String s: arrayList) {
            System.out.println(s);
            System.out.println(s.toUpperCase());
            System.out.println(s.length());
        }
        System.out.println(arrayList);

    }
}
