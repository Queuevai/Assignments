package exceptionhandling.travelbooking;


import java.util.Arrays;

public class FlightBooking {
    // seats array: false = available, true = booked
    public boolean[] seats; // Array to represent seats

    public FlightBooking(int numberOfSeats) {
        if (numberOfSeats <= 0) {
            throw new IllegalArgumentException("Number of seats must be positive.");
        }
        this.seats = new boolean[numberOfSeats]; // Initialize all seats as available (false)
        System.out.println("Flight initialized with " + numberOfSeats + " seats.");
        printSeatStatus();
    }

    /**
     * Attempts to book a seat.
     *
     * @param seatNumber The 1-based index of the seat to book.
     * @throws ArrayIndexOutOfBoundsException if the seat number is out of the valid range.
     * @throws IllegalStateException if the seat is already booked.
     */
    public void bookSeat(int seatNumber) {
        // Adjust for 0-based array indexing
        int arrayIndex = seatNumber - 1;

        // Check for ArrayIndexOutOfBoundsException
        if (arrayIndex < 0 || arrayIndex >= seats.length) {
            throw new ArrayIndexOutOfBoundsException("Seat number " + seatNumber + " is out of range. Valid seats are 1 to " + seats.length + ".");
        }

        // Check for IllegalStateException (already booked)
        if (seats[arrayIndex]) {
            throw new IllegalStateException("Seat " + seatNumber + " is already booked.");
        }

        // Book the seat
        seats[arrayIndex] = true;
        System.out.println("Seat " + seatNumber + " successfully booked.");
    }

    public void printSeatStatus() {
        System.out.print("Current Seat Status (1-" + seats.length + "): [");
        for (int i = 0; i < seats.length; i++) {
            System.out.print( (seats[i] ? "X" : (i + 1)) + (i == seats.length - 1 ? "" : ", ") );
        }
        System.out.println("]");
    }
}
