package week_4;

import java.util.ArrayList;
import java.util.List;

public class TreeArrayList {
    public static void main(String[] args) {

        List<String> trees = new ArrayList<>(); // create ArrayList

        trees.add("Pine");
        trees.add("Oak");
        trees.add("Elm");
        trees.add("Aspen"); // add data at end of array.

        trees.add(2,"Palm"); // add data at index 2, in the middle

        System.out.println("Tree at index 1 is " + trees.get(1)); // prints index 1

        for (String tree: trees) {
            System.out.println(tree);
        }// Ends for loop

        trees.remove("Oak"); // removed by value
        trees.remove(0); // remove string at index 0, first element

        System.out.println(trees);

        if (trees.contains("Aspen")) {
            System.out.println("Tree list contains Aspen");
        }//end of If statement

        int numberOfTrees = trees.size();
        System.out.println("There are " + numberOfTrees + " trees in the list.");

    }
}
