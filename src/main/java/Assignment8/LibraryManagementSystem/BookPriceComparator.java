package Assignment8.LibraryManagementSystem;


import java.util.Comparator;

public class BookPriceComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        // Sort by price in ascending order
        return Double.compare(b1.getPrice(), b2.getPrice());
    }
}
