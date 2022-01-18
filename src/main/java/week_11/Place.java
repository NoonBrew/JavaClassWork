package week_11;

public class Place {
    // This is our Place Object Class
    // Map to one row in database.

    // Database will have two columns, name and elevation.
    // This class will have two fields name and elevation.

    private String name;
    private double elevation;

    public Place(String name, double elevation) {
        this.name = name;
        this.elevation = elevation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getElevation() {
        return elevation;
    }

    public void setElevation(double elevation) {
        this.elevation = elevation;
    }

    @Override
    public String toString() {
        return "Place" + "name: " + name + ", elevation: " + elevation + " meters";
    }
}
