package week_1;

import static input.InputUtils.*;

public class groceryPrices {
    public static void main(String[] args) {
        String productName = stringInput("What is the name of the product?");
        double price = doubleInput("What does " + productName + " cost?");
        int quantity = intInput("How many " + productName + " to buy?");

        double totalPrice = price * quantity;

        System.out.println(quantity + " of " + productName + " at $" + price + " each cost $"
                + totalPrice);
        System.out.printf("%d of %s at $%.2f each cost $%.2f", quantity, productName, price, totalPrice);
    }
}
