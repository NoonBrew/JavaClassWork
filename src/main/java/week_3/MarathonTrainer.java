package week_3;

public class MarathonTrainer {
    public static void main(String[] args) {

        double currentMiles = 1.0;
        double targetDistance = 26.2;
        double percentIncrease = 1.10;
        int weekCounter = 1;
        // loop until the current distacne is greater than the target distance
        // loop tracks number of weeks.
        while(currentMiles < targetDistance) {
            // video solution
            System.out.println(weekCounter + " " + currentMiles);
            currentMiles = currentMiles * percentIncrease; // increases by 10 percent
            weekCounter++;

            // My solution
//            weekCounter = weekCounter + 1;
//            currentMiles = currentMiles * 1.1;
//            System.out.printf("For Week %d you should run %.2f miles.\n", weekCounter, currentMiles);

        }
        // part of video solutions, prints out one last week that is greater than target distance.
        System.out.println(weekCounter + " " + currentMiles);
    }
}
