package customexceptions.movieticketbooking;


public class MovieTicketBookingTest {
    public static void main(String[] args) {
        TicketBooking bookingSystem = new TicketBooking();

        System.out.println("--- Online Movie Ticket Booking ---");

        // Test Case 1: Valid booking
        try {
            bookingSystem.bookTickets("Avengers: Endgame", 4);
        } catch (TicketLimitExceededException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println();

        // Test Case 2: Exceeding ticket limit
        try {
            bookingSystem.bookTickets("Oppenheimer", 7);
        } catch (TicketLimitExceededException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println();

        // Test Case 3: Another valid booking
        try {
            bookingSystem.bookTickets("Dune: Part Two", 6);
        } catch (TicketLimitExceededException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println();

        // Test Case 4: Invalid quantity (zero)
        try {
            bookingSystem.bookTickets("The Matrix", 0);
        } catch (TicketLimitExceededException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println();
    }
}
