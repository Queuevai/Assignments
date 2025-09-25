package Assignment8.LibraryManagementSystem;

import java.util.Comparator;

public class BookAuthorComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        // Sort by author alphabetically
        return b1.getAuthor().compareTo(b2.getAuthor());
    }
}
