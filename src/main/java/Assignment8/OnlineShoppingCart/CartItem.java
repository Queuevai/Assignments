package Assignment8.OnlineShoppingCart;

import java.util.Objects;

public class CartItem {
    private int itemId;
    private String itemName;
    private int quantity;
    private double pricePerUnit;

    public CartItem(int itemId, String itemName, int quantity, double pricePerUnit) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    // Getters
    public int getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    // Setter for quantity (for update operations)
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "CartItem{" +
                "itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", quantity=" + quantity +
                ", pricePerUnit=$" + String.format("%.2f", pricePerUnit) +
                ", totalItemPrice=$" + String.format("%.2f", (quantity * pricePerUnit)) +
                '}';
    }

    // Two CartItem objects are equal if their itemId is the same.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CartItem cartItem = (CartItem) o;
        return itemId == cartItem.itemId;
    }

    // hashCode must be consistent with equals.
    @Override
    public int hashCode() {
        return Objects.hash(itemId);
    }
}
