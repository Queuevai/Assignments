package Assignment9.ProductPriceCatalog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductCatalog {
    private Map<Integer, Product> products; // Key = productId, Value = Product object

    public ProductCatalog() {
        this.products = new HashMap<>();
    }

    // CRUD - Add a new product
    public void addProduct(Product product) {
        if (products.containsKey(product.getProductId())) {
            System.out.println("Product with ID " + product.getProductId() + " already exists. Not added.");
        } else {
            products.put(product.getProductId(), product);
            System.out.println("Added Product: " + product.getName() + " (ID: " + product.getProductId() + ")");
        }
    }

    // CRUD - Remove a product by ID
    public void removeProduct(int productId) {
        if (products.remove(productId) != null) {
            System.out.println("Removed Product with ID: " + productId);
        } else {
            System.out.println("Product with ID " + productId + " not found for removal.");
        }
    }

    // CRUD - Update the price of a product
    public void updateProductPrice(int productId, double newPrice) {
        Product product = products.get(productId);
        if (product != null) {
            double oldPrice = product.getPrice();
            product.setPrice(newPrice);
            System.out.println("Updated Product ID " + productId + " price from $" + String.format("%.2f", oldPrice) + " to $" + String.format("%.2f", newPrice));
        } else {
            System.out.println("Product with ID " + productId + " not found for price update.");
        }
    }

    // CRUD - View all products
    public void viewAllProducts() {
        if (products.isEmpty()) {
            System.out.println("Product catalog is empty.");
            return;
        }
        System.out.println("\n--- All Products in Catalog ---");
        // Iterate over the values (Product objects)
        products.values().forEach(System.out::println);
        System.out.println("-------------------------------");
    }

    // Searching - Find a product by its ID
    public Product findProductById(int productId) {
        return products.get(productId); // Direct lookup by key
    }

    // Searching - Find all products cheaper than a given price
    public List<Product> findProductsCheaperThan(double maxPrice) {
        return products.values().stream()
                .filter(p -> p.getPrice() < maxPrice)
                .collect(Collectors.toList());
    }

    // Sorting - Display products sorted by product name
    public void displayProductsSortedByName() {
        if (products.isEmpty()) {
            System.out.println("No products to sort.");
            return;
        }
        List<Product> sortedList = new ArrayList<>(products.values()); // Convert Map values to List
        Collections.sort(sortedList, new ProductNameComparator());
        System.out.println("\n--- Products Sorted by Name ---");
        sortedList.forEach(System.out::println);
        System.out.println("-------------------------------");
    }

    // Sorting - Display products sorted by price (ascending)
    public void displayProductsSortedByPrice() {
        if (products.isEmpty()) {
            System.out.println("No products to sort.");
            return;
        }
        List<Product> sortedList = new ArrayList<>(products.values()); // Convert Map values to List
        Collections.sort(sortedList, new ProductPriceComparator());
        System.out.println("\n--- Products Sorted by Price (Ascending) ---");
        sortedList.forEach(System.out::println);
        System.out.println("--------------------------------------------");
    }
}
