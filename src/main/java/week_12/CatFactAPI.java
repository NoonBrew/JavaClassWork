package week_12;

import kong.unirest.Unirest;

public class CatFactAPI {
    public static void main(String[] args) {
        String url = "https://catfact.ninja/fact";
        CatFact catFact = Unirest.get(url).asObject(CatFact.class).getBody();
        System.out.println(catFact.fact);


    }
}

class CatFact {
    public String fact;
    public int length;
}
