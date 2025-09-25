package Assignment8.OnlineShoppingCart;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShoppingCart {
    private List<CartItem> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    // Add item (if already present, just increase quantity)
    public void addItem(CartItem newItem) {
        // Create a dummy item to search by ID, leveraging equals()
        int existingIndex = items.indexOf(newItem);

        if (existingIndex != -1) {
            // Item already exists, update quantity
            CartItem existingItem = items.get(existingIndex);
            existingItem.setQuantity(existingItem.getQuantity() + newItem.getQuantity());
            System.out.println("Updated quantity for " + newItem.getItemName() + ". New quantity: " + existingItem.getQuantity());
        } else {
            // Item not present, add new item
            items.add(newItem);
            System.out.println("Added new item: " + newItem.getItemName() + " (Qty: " + newItem.getQuantity() + ")");
        }
    }

    // Remove an item by itemId
    public void removeItem(int itemId) {
        // Create a dummy item for removal using its ID
        CartItem dummyItem = new CartItem(itemId, null, 0, 0.0);
        boolean removed = items.remove(dummyItem); // Uses overridden equals()

        if (removed) {
            System.out.println("Removed item with ID: " + itemId);
        } else {
            System.out.println("Item with ID " + itemId + " not found in cart.");
        }
    }

    // Update item quantity
    public void updateQuantity(int itemId, int newQuantity) {
        if (newQuantity <= 0) {
            removeItem(itemId); // If quantity is 0 or less, remove the item
            System.out.println("Quantity for item ID " + itemId + " set to " + newQuantity + ". Item removed from cart.");
            return;
        }

        CartItem dummyItem = new CartItem(itemId, null, 0, 0.0);
        int index = items.indexOf(dummyItem);

        if (index != -1) {
            CartItem item = items.get(index);
            item.setQuantity(newQuantity);
            System.out.println("Updated quantity for item ID " + itemId + " to " + newQuantity);
        } else {
            System.out.println("Item with ID " + itemId + " not found for quantity update.");
        }
    }

    // Search by itemId
    public CartItem searchItem(int itemId) {
        CartItem dummyItem = new CartItem(itemId, null, 0, 0.0);
        int index = items.indexOf(dummyItem);
        if (index != -1) {
            return items.get(index);
        }
        return null;
    }

    // Return the total cost of items in the cart
    public double getTotalBill() {
        double totalBill = 0;
        for (CartItem item : items) {
            totalBill += item.getQuantity() * item.getPricePerUnit();
        }
        return totalBill;
    }

    // Display all items in the cart
    public void displayCart() {
        if (items.isEmpty()) {
            System.out.println("Shopping cart is empty.");
            return;
        }
        System.out.println("\n--- Current Shopping Cart ---");
        for (CartItem item : items) {
            System.out.println(item);
        }
        System.out.println("-----------------------------");
        System.out.printf("Total Bill: $%.2f%n", getTotalBill());
    }
}
