package week_7;

public class Pool {
    private String name; // field, or a variable.
    private double length; // another field

    public Pool(String poolName, double poolLength) {
        this.name = poolName;
        this.length = poolLength;
    }
    // methods that belong to class called
    // instance method.
    // instance is another word for an object
    // a Pool object is an instance of the pool class.

    public double distanceForLaps(int laps) {
        // 10 laps of pool of length 50, thats 500 meters.
        double total = laps * this.length;
        return total;
    }
    @Override
    public String toString() {
        String description = this.name + " pool is " + this.length + " meters long";
        return description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length < 0 || length > 1000) {
            return;
        }
        this.length = length;
    }
}
