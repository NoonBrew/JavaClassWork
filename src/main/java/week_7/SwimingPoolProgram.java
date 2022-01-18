package week_7;

public class SwimingPoolProgram {
    public static void main(String[] args) {

        Pool ymca = new Pool("YMCA", 50);

        double totalSwam = ymca.distanceForLaps(6);
        System.out.println(ymca);
        System.out.println("The total distance is " + totalSwam + " meters");

        Pool como = new Pool("Como Park", 25);
        System.out.println(como.distanceForLaps(12));

        System.out.println(como);

        Pool edina = new Pool("Edina", 50);
        System.out.println(edina);
        System.out.println(edina.distanceForLaps(12));

    }
}
