package week_4;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;

public class Removing {
    public static void main(String[] args) {

        List<String> classNames = new ArrayList<>();
        classNames.add("Programming Logic");
        classNames.add("Web Client Server");
        classNames.add("Project Management");
        classNames.add("Info Tech Concepts");

        for (String name: classNames) {
            System.out.println(name);
        }
        System.out.println();
        for (int i = 0; i < classNames.size(); i++) {
            // index - if you need to know index as well as data.
            System.out.println(classNames.get(i));
        }
        System.out.println();
        while(!classNames.isEmpty()) {
            String name = classNames.remove(0);
            System.out.println(name);
        }
        System.out.println(classNames);
    }
}
