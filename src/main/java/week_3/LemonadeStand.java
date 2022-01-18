package week_3;

import static input.InputUtils.doubleInput;
import static input.InputUtils.intInput;

public class LemonadeStand {
    public static void main(String[] args) {

        double lemonadeProfit = calculateProfitForProduct("lemonade");
        System.out.println("lemonade profit = $" + lemonadeProfit);

        double cookieProfit = calculateProfitForProduct("cookies");
        System.out.println("Cookie profit = $" + cookieProfit);

    } // End of Main method

    public static double calculateProfitForProduct(String productName){
        System.out.println("How much did you spend on " + productName + " supplies?");
        double productSuppliesCost = doubleInput();
        System.out.println("What did you sell one " + productName + " for?");
        double productSalePrice = doubleInput();
        System.out.println("How many" + productName + " did you sell?");
        int productSold = intInput();

        // caluclate profit
        double productProfit = (productSold * productSalePrice) - productSuppliesCost;
        return productProfit;

    }
}
