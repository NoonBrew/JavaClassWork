package week_7;

import java.util.Date;

public class DateObjects {

    public static void main(String[] args) {

        // A Date objects represents a point in time

        // Date is a class, so can create date objects like this,
        Date now = new Date();   // Defaults to representing right now
        System.out.println(now);  // Example format: "Wed Oct 23 10:41:28 CDT 2019"

        // Creating objects that have a Date field

        ToDoItem waterPlants = new ToDoItem("Water Plants");
        ToDoItem feedCat = new ToDoItem("Feed Cat");

        System.out.println("Here are your to do items:");
        System.out.println(waterPlants);
        System.out.println(feedCat);
    }
}



