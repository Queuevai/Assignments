package customexceptions.fileupload;


public class FileUploadTest {
    public static void main(String[] args) {
        FileUploader uploader = new FileUploader();

        System.out.println("--- File Upload Size Validation ---");

        // Test Case 1: Valid file upload
        try {
            uploader.uploadFile("report.pdf", 12.5);
        } catch (FileTooLargeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println();

        // Test Case 2: File exceeding limit
        try {
            uploader.uploadFile("movie.mp4", 30.0);
        } catch (FileTooLargeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println();

        // Test Case 3: Another valid file
        try {
            uploader.uploadFile("document.docx", 24.9);
        } catch (FileTooLargeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println();

        // Test Case 4: File with negative size
        try {
            uploader.uploadFile("invalid.txt", -5.0);
        } catch (FileTooLargeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println();
    }
}
