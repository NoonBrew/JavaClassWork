package week_2;

public class NumberForLoops {
    public static void main(String[] args) {

        for(int x=1; x < 6; x++) {
            System.out.println("Number " + x);
        }

        for(int countDown = 10; countDown >= 0; countDown--) {
            if (countDown > 0) {
                System.out.println(countDown);
            } else {
                System.out.println(countDown + " Blast Off!");
            }
        }
        int miles = 150000;
        for(int oilChanges = 0; oilChanges < 8; oilChanges++ ) {
            miles = miles + 3000;
            System.out.println(miles);
        }
    }
}
