package customexceptions.fileupload;

public class FileUploader {
    private static final double MAX_FILE_SIZE_MB = 25.0; // 25 MB limit

    /**
     * Simulates uploading a file, validating its size.
     *
     * @param fileName The name of the file to upload.
     * @param fileSizeMB The size of the file in Megabytes.
     * @throws FileTooLargeException if the file size exceeds the maximum allowed limit.
     * @throws IllegalArgumentException if the file size is negative.
     */
    public void uploadFile(String fileName, double fileSizeMB) throws FileTooLargeException {
        System.out.print("Uploading " + fileName + " (" + fileSizeMB + " MB)... ");

        if (fileSizeMB < 0) {
            throw new IllegalArgumentException("File size cannot be negative.");
        }

        if (fileSizeMB > MAX_FILE_SIZE_MB) {
            throw new FileTooLargeException("File size exceeds the " + MAX_FILE_SIZE_MB + " MB limit.");
        }

        // Simulate actual file upload process
        System.out.println("File uploaded successfully.");
        // Logic to actually upload the file to a server, cloud storage, etc.
    }
}
