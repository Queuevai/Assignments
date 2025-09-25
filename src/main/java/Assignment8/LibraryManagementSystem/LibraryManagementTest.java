package Assignment8.LibraryManagementSystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LibraryManagementTest {

    public static void main(String[] args) {
        List<Book> library = new ArrayList<>();

        // Adding at least 5 books
        library.add(new Book(101, "The Great Gatsby", "F. Scott Fitzgerald", 12.50));
        library.add(new Book(102, "1984", "George Orwell", 9.99));
        library.add(new Book(103, "To Kill a Mockingbird", "Harper Lee", 15.75));
        library.add(new Book(104, "Pride and Prejudice", "Jane Austen", 11.20));
        library.add(new Book(105, "The Catcher in the Rye", "J.D. Salinger", 10.00));
        library.add(new Book(106, "Brave New World", "Aldous Huxley", 13.00));

        System.out.println("--- Original Book List ---");
        library.forEach(System.out::println);

        // Sorting by title (Natural Ordering using Comparable)
        System.out.println("\n--- Books Sorted by Title (Alphabetical) ---");
        Collections.sort(library); // Uses Book's compareTo() method
        library.forEach(System.out::println);

        // Sorting by price (using BookPriceComparator)
        System.out.println("\n--- Books Sorted by Price (Ascending) ---");
        Collections.sort(library, new BookPriceComparator());
        library.forEach(System.out::println);

        // Sorting by author (using BookAuthorComparator)
        System.out.println("\n--- Books Sorted by Author (Alphabetical) ---");
        Collections.sort(library, new BookAuthorComparator());
        library.forEach(System.out::println);
    }
}
