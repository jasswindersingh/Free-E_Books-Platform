package Exceptions;

public class MaxBorrowLimit extends Exception {
    private static final long serialVersionUID = 1L;
    
    public MaxBorrowLimit(String message) {
        super(message);
    }
}
