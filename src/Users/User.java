package Users;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Exceptions.InvalidUserData;
import Exceptions.MaxBorrowLimit;

public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String username;
    private String email;
    private String password;
    private String fullName;
    private String userId;
    private Date registrationDate;
    private List<String> borrowedBooks;
    private List<String> readingHistory;
    private List<String> bookmarks;
    private int maxBorrowLimit;
    private boolean isActive;
    
    public User(String username, String email, String password, String fullName, int maxBorrowLimit) throws Exception {
        if (username == null || username.trim().isEmpty()) {
            throw new InvalidUserData("Username cannot be empty");
        }
        if (email == null || !email.contains("@")) {
            throw new InvalidUserData("Invalid email format");
        }
        if (password == null || password.length() < 6) {
            throw new InvalidUserData("Password must be at least 6 characters");
        }
        
        this.username = username;
        this.email = email;
        this.password = password;
        this.fullName = fullName;
        this.userId = 10000 + (int) (Math.random() * 89999) + "";
        this.registrationDate = new Date();
        this.borrowedBooks = new ArrayList<>();
        this.readingHistory = new ArrayList<>();
        this.bookmarks = new ArrayList<>();
        this.maxBorrowLimit = maxBorrowLimit;
        this.isActive = true;
    }
    
    public void borrowBook(String bookId) throws MaxBorrowLimit {
        if (borrowedBooks.size() >= maxBorrowLimit) {
            throw new MaxBorrowLimit("Maximum borrow limit reached: " + maxBorrowLimit);
        }
        if (!borrowedBooks.contains(bookId)) {
            borrowedBooks.add(bookId);
        }
    }
    
    public void returnBook(String bookId) {
        borrowedBooks.remove(bookId);
        if (!readingHistory.contains(bookId)) {
            readingHistory.add(bookId);
        }
    }
    
    public void addBookmark(String bookId) {
        if (!bookmarks.contains(bookId)) {
            bookmarks.add(bookId);
        }
    }
    
    public void removeBookmark(String bookId) {
        bookmarks.remove(bookId);
    }
    
    public boolean hasBorrowedBook(String bookId) {
        return borrowedBooks.contains(bookId);
    }
    
    public boolean isBookmarked(String bookId) {
        return bookmarks.contains(bookId);
    }
    
    // Getters and Setters
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    
    public String getUserId() { return userId; }
    
    public Date getRegistrationDate() { return registrationDate; }
    
    public List<String> getBorrowedBooks() { return new ArrayList<>(borrowedBooks); }
    
    public List<String> getReadingHistory() { return new ArrayList<>(readingHistory); }
    
    public List<String> getBookmarks() { return new ArrayList<>(bookmarks); }
    
    public int getMaxBorrowLimit() { return maxBorrowLimit; }
    public void setMaxBorrowLimit(int maxBorrowLimit) { this.maxBorrowLimit = maxBorrowLimit; }
    
    public boolean isActive() { return isActive; }
    public void setActive(boolean active) { this.isActive = active; }
    
    public int getBorrowedBooksCount() { return borrowedBooks.size(); }
    
    @Override
    public String toString() {
        return "Name: " + fullName + ", Username: " + username + ", ID: " + userId + 
               ", Borrowed: " + borrowedBooks.size() + "/" + maxBorrowLimit + 
               ", Type: " + this.getClass().getSimpleName();
    }
}
