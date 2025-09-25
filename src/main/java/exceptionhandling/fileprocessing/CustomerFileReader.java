package exceptionhandling.fileprocessing;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CustomerFileReader {

    public void readAndProcessCustomerData(String filePath) {
        System.out.println("Attempting to read customer data from: " + filePath);
        // Using try-with-resources to ensure BufferedReader and FileReader are closed automatically
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int lineNumber = 0;
            while ((line = reader.readLine()) != null) {
                lineNumber++;
                System.out.print("Processing Line " + lineNumber + ": '" + line + "' -> ");
                try {
                    String[] parts = line.split(",");
                    if (parts.length != 2) {
                        throw new IllegalArgumentException("Invalid format: Expected 'Name,Balance'");
                    }
                    String name = parts[0].trim();
                    double balance = Double.parseDouble(parts[1].trim());

                    System.out.println("Customer: " + name + ", Balance: $" + balance);

                } catch (NumberFormatException e) {
                    System.err.println("Error on line " + lineNumber + ": Invalid balance format. Balance must be a number. Details: " + e.getMessage());
                } catch (IllegalArgumentException e) {
                    System.err.println("Error on line " + lineNumber + ": " + e.getMessage());
                } catch (Exception e) { // Catch any other unexpected exceptions during line processing
                    System.err.println("Error on line " + lineNumber + ": An unexpected error occurred. Details: " + e.getMessage());
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error: File not found at " + filePath + ". Please ensure the file exists and the path is correct.");
        } catch (IOException e) {
            System.err.println("Error: An I/O error occurred while reading the file. Details: " + e.getMessage());
        } finally {
            System.out.println("Finished attempting to read customer data.");
        }
    }
}
