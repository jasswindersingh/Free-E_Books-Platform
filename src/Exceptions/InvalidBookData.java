package Exceptions;

public class InvalidBookData extends Exception {
    private static final long serialVersionUID = 1L;
    
    public InvalidBookData(String message) {
        super(message);
    }
}
