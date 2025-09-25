package customexceptions.fileupload;

public class FileTooLargeException extends Exception {
    public FileTooLargeException(String message) {
        super(message);
    }
}
