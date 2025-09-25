package Assignment8.LibraryManagementSystem;

import java.util.Objects;

public class Book implements Comparable<Book> {
    private int bookId;
    private String title;
    private String author;
    private double price;

    public Book(int bookId, String title, String author, double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getters
    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book [ID=" + bookId + ", Title='" + title + "', Author='" + author + "', Price=$" + String.format("%.2f", price) + "]";
    }

    // Natural ordering: Sort by title alphabetically
    @Override
    public int compareTo(Book other) {
        return this.title.compareTo(other.title);
    }

    // Optional: equals and hashCode if books are considered equal by ID
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookId == book.bookId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId);
    }
}
