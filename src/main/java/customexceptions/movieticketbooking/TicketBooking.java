package customexceptions.movieticketbooking;


public class TicketBooking {
    private static final int MAX_TICKETS_PER_BOOKING = 6;

    /**
     * Books a specified quantity of tickets for a movie.
     *
     * @param movieName The name of the movie.
     * @param quantity The number of tickets to book.
     * @throws TicketLimitExceededException if the quantity exceeds the maximum allowed.
     */
    public void bookTickets(String movieName, int quantity) {
        System.out.print("Booking " + quantity + " tickets for " + movieName + "... ");

        if (quantity <= 0) {
            // Can also throw IllegalArgumentException here, but problem focuses on limit exceeded
            throw new IllegalArgumentException("Quantity must be positive.");
        }

        if (quantity > MAX_TICKETS_PER_BOOKING) {
            throw new TicketLimitExceededException("Cannot book more than " + MAX_TICKETS_PER_BOOKING + " tickets at once.");
        }

        // Simulate actual booking process
        System.out.println("Booking successful!");
        // Logic to actually reserve tickets, update database, etc.
    }
}
