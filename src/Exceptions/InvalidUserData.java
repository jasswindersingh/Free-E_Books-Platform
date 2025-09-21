package Exceptions;

public class InvalidUserData extends Exception {
    private static final long serialVersionUID = 1L;
    
    public InvalidUserData(String message) {
        super(message);
    }
}
