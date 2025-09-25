package Assignment9.ProductPriceCatalog;

import java.util.Objects;

public class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Getters
    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Setter for price (for update operations)
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{productId=" + productId + ", name='" + name + "', price=$" + String.format("%.2f", price) + '}';
    }

    /**
     * Two Product objects are considered equal if their 'productId' is the same.
     * This is useful if Product objects themselves are put into a Set or used as keys in another Map.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productId == product.productId;
    }

    /**
     * The hashCode must be consistent with equals. If two objects are equal (based on productId),
     * their hash codes must be the same.
     */
    @Override
    public int hashCode() {
        return Objects.hash(productId);
    }
}
