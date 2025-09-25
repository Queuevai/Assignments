package Assignment8.OnlineShoppingCart;

public class ShoppingCartTest {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        System.out.println("--- Initial Cart State ---");
        cart.displayCart();

        // Add items
        System.out.println("\n--- Adding Items ---");
        cart.addItem(new CartItem(1, "Laptop", 1, 1200.00));
        cart.addItem(new CartItem(2, "Mouse", 2, 25.50));
        cart.addItem(new CartItem(3, "Keyboard", 1, 75.00));
        cart.addItem(new CartItem(1, "Laptop", 1, 1200.00)); // Add existing item
        cart.displayCart();

        // Update quantity
        System.out.println("\n--- Updating Quantity ---");
        cart.updateQuantity(2, 3); // Update Mouse quantity to 3
        cart.updateQuantity(4, 1); // Try to update non-existent item
        cart.displayCart();

        // Search item
        System.out.println("\n--- Searching for Item 3 ---");
        CartItem foundItem = cart.searchItem(3);
        if (foundItem != null) {
            System.out.println("Found: " + foundItem);
        } else {
            System.out.println("Item 3 not found.");
        }

        System.out.println("\n--- Searching for Item 5 ---");
        CartItem notFoundItem = cart.searchItem(5);
        if (notFoundItem != null) {
            System.out.println("Found: " + notFoundItem);
        } else {
            System.out.println("Item 5 not found.");
        }

        // Remove item
        System.out.println("\n--- Removing Item 1 ---");
        cart.removeItem(1);
        cart.removeItem(5); // Try to remove non-existent item
        cart.displayCart();

        // Update quantity to 0 (should remove)
        System.out.println("\n--- Updating Item 2 quantity to 0 ---");
        cart.updateQuantity(2, 0);
        cart.displayCart();
    }
}
