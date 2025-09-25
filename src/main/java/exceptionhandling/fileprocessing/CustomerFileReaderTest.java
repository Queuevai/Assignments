package exceptionhandling.fileprocessing;


public class CustomerFileReaderTest {
    public static void main(String[] args) {
        CustomerFileReader reader = new CustomerFileReader();

        // Path to the customers.txt file
        // Make sure 'customers.txt' is in the root of your project (e.g., AssignmentsDump/)
        String filePath = "C:\\Users\\VSOMESH\\IdeaProjects\\AssignmentsDump\\src\\main\\java\\Assignment6_2\\exceptionhandling\\fileprocessing\\customers.txt"; // Relative path

        System.out.println("--- Test Case 1: Valid File Path ---");
        reader.readAndProcessCustomerData(filePath);
        System.out.println();

        System.out.println("--- Test Case 2: Non-existent File Path ---");
        reader.readAndProcessCustomerData("nonexistent_customers.txt");
        System.out.println();

        // Optional: Test with a file that has read permissions issues (requires manual setup)
        // System.out.println("--- Test Case 3: File with Read Permission Issues (requires manual setup) ---");
        // reader.readAndProcessCustomerData("unreadable_customers.txt");
    }
}
