package exceptionhandling.travelbooking;

import java.util.Scanner;

public class SeatAllocationTest {
    public static void main(String[] args) {
        FlightBooking flight = new FlightBooking(5); // A flight with 5 seats

        Scanner scanner = new Scanner(System.in);
        String inputSeatStr;

        System.out.println("\n--- Flight Seat Booking System ---");

        while (true) {
            System.out.print("Enter seat number to book (1-" + flight.seats.length + ", or 'exit' to quit): ");
            inputSeatStr = scanner.nextLine();

            if (inputSeatStr.equalsIgnoreCase("exit")) {
                System.out.println("Exiting booking system. Goodbye!");
                break;
            }

            try {
                int seatNumber = Integer.parseInt(inputSeatStr);
                flight.bookSeat(seatNumber);
            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter a valid number for the seat.");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (IllegalStateException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
            } finally {
                flight.printSeatStatus();
                System.out.println("------------------------------------");
            }
        }
        scanner.close();
    }
}
