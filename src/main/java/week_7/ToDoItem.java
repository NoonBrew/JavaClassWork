package week_7;

import java.util.Date;

public class ToDoItem {

    private String text;
    private Date dateCreated;

    ToDoItem(String text) {
        this.text = text;
        this.dateCreated = new Date();  // Right now - when the object is created
    }

    @Override
    public String toString() {
        return "ToDoItem: " +
                text + ", created at " + dateCreated;
    }
}
