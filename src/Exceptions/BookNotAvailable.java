package Exceptions;

public class BookNotAvailable extends Exception {
    private static final long serialVersionUID = 1L;
    
    public BookNotAvailable(String message) {
        super(message);
    }
}
