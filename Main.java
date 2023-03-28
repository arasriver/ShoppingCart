import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Create a new ShoppingCart object
        ShoppingCart myCart = new ShoppingCart();

        // Get input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter item details (name, price), or type 'done' to finish:");
        String input = scanner.nextLine().trim();

        while (!input.equalsIgnoreCase("done")) {
            String[] itemDetails = input.split(",");
            String name = itemDetails[0].trim();
            int price = Integer.parseInt(itemDetails[1].trim());

            // Create a new Item object and add it to the cart
            Item item = new Item(name, price);
            myCart.addItem(item);

            // Get input from the user again
            System.out.println("Enter item details (name, price), or type 'done' to finish:");
            input = scanner.nextLine().trim();
        }

        // Calculate the total price of all items in the cart
        int totalPrice = myCart.getTotalPrice();
        System.out.println("Total price: $" + totalPrice);
    }
}
