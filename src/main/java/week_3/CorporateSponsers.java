package week_3;

import java.util.Arrays;

public class CorporateSponsers {
    public static void main(String[] args) {
        // modify array, make strings uppercase.
        String[] sponsers = {"ikea", "at&t", "cvs", "3m"};

        for(int x = 0; x < sponsers.length; x++) {
//            System.out.println(sponsers[x]);
//            String sponsor = sponsers[x];
//            sponsor = sponsor.toUpperCase();
//            sponsers[x] = sponsor;\

            sponsers[x] = sponsers[x].toUpperCase();


        }

        System.out.println(Arrays.toString(sponsers));
    }
}
