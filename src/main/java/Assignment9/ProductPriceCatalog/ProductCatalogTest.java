package Assignment9.ProductPriceCatalog;


import java.util.List;

public class ProductCatalogTest {
    public static void main(String[] args) {
        ProductCatalog catalog = new ProductCatalog();

        // --- CRUD - Add Products ---
        System.out.println("--- Add Products ---");
        catalog.addProduct(new Product(101, "Laptop", 1200.00));
        catalog.addProduct(new Product(102, "Mouse", 25.50));
        catalog.addProduct(new Product(103, "Keyboard", 75.00));
        catalog.addProduct(new Product(104, "Monitor", 300.00));
        catalog.addProduct(new Product(101, "Laptop Pro", 1500.00)); // Attempt to add duplicate ID
        catalog.viewAllProducts();

        // --- CRUD - Update Product Price ---
        System.out.println("\n--- Update Product 102 Price ---");
        catalog.updateProductPrice(102, 30.00); // Update Mouse price
        catalog.updateProductPrice(999, 100.00); // Update non-existent product
        catalog.viewAllProducts();

        // --- Searching - Find Product by ID ---
        System.out.println("\n--- Search Product by ID 103 ---");
        Product foundProduct = catalog.findProductById(103);
        if (foundProduct != null) {
            System.out.println("Found: " + foundProduct);
        } else {
            System.out.println("Product with ID 103 not found.");
        }

        System.out.println("\n--- Search Product by ID 999 ---");
        Product notFoundProduct = catalog.findProductById(999);
        if (notFoundProduct != null) {
            System.out.println("Found: " + notFoundProduct);
        } else {
            System.out.println("Product with ID 999 not found.");
        }

        // --- Searching - Find all Products Cheaper Than ---
        System.out.println("\n--- Find Products Cheaper Than $100 ---");
        List<Product> cheapProducts = catalog.findProductsCheaperThan(100.00);
        if (!cheapProducts.isEmpty()) {
            cheapProducts.forEach(System.out::println);
        } else {
            System.out.println("No products found cheaper than $100.");
        }

        // --- Sorting - Display Products Sorted by Name ---
        catalog.displayProductsSortedByName();

        // --- Sorting - Display Products Sorted by Price ---
        catalog.displayProductsSortedByPrice();

        // --- CRUD - Remove Product ---
        System.out.println("\n--- Remove Product 104 ---");
        catalog.removeProduct(104);
        catalog.removeProduct(999); // Remove non-existent product
        catalog.viewAllProducts();
    }
}
