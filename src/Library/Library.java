package Library;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultListModel;

import Users.*;
import Books.*;
import Exceptions.*;

public class Library implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private User[] users = new User[1000];
    private Book[] books = new Book[10000];
    private int userCount = 0;
    private int bookCount = 0;
    
    // User Management Methods
    public int addUser(User user) {
        if (userCount >= users.length) {
            return -1; // Library is full
        }
        users[userCount] = user;
        return userCount++;
    }
    
    public int addStudentUser(String username, String email, String password, String fullName,
                             String institutionName, String studentId, String major) throws Exception {
        StudentUser user = new StudentUser(username, email, password, fullName, 
                                         institutionName, studentId, major);
        return addUser(user);
    }
    
    public int addPremiumUser(String username, String email, String password, String fullName,
                             String subscriptionType, Date subscriptionExpiry) throws Exception {
        PremiumUser user = new PremiumUser(username, email, password, fullName, 
                                         subscriptionType, subscriptionExpiry);
        return addUser(user);
    }
    
    public int addAdminUser(String username, String email, String password, String fullName,
                           String adminLevel, String department) throws Exception {
        AdminUser user = new AdminUser(username, email, password, fullName, 
                                     adminLevel, department);
        return addUser(user);
    }
    
    public User findUser(String userId) {
        for (int i = 0; i < userCount; i++) {
            if (users[i] != null && users[i].getUserId().equals(userId)) {
                return users[i];
            }
        }
        return null;
    }
    
    public User findUserByUsername(String username) {
        for (int i = 0; i < userCount; i++) {
            if (users[i] != null && users[i].getUsername().equals(username)) {
                return users[i];
            }
        }
        return null;
    }
    
    public User authenticateUser(String username, String password) {
        User user = findUserByUsername(username);
        if (user != null && user.getPassword().equals(password) && user.isActive()) {
            return user;
        }
        return null;
    }
    
    // Book Management Methods
    public int addBook(Book book) {
        if (bookCount >= books.length) {
            return -1; // Library is full
        }
        books[bookCount] = book;
        return bookCount++;
    }
    
    public int addFictionBook(String title, String author, String isbn, String genre,
                             String description, String language, int totalPages,
                             String filePath, String publisher, String subGenre,
                             String targetAudience) throws Exception {
        FictionBook book = new FictionBook(title, author, isbn, genre, description,
                                         language, totalPages, filePath, publisher,
                                         subGenre, targetAudience);
        return addBook(book);
    }
    
    public int addNonFictionBook(String title, String author, String isbn, String genre,
                                String description, String language, int totalPages,
                                String filePath, String publisher, String subject,
                                String academicLevel, String edition) throws Exception {
        NonFictionBook book = new NonFictionBook(title, author, isbn, genre, description,
                                                language, totalPages, filePath, publisher,
                                                subject, academicLevel, edition);
        return addBook(book);
    }
    
    public int addAcademicBook(String title, String author, String isbn, String genre,
                              String description, String language, int totalPages,
                              String filePath, String publisher, String subject,
                              String academicLevel, String edition, String courseCode,
                              String semester, String department) throws Exception {
        AcademicBook book = new AcademicBook(title, author, isbn, genre, description,
                                           language, totalPages, filePath, publisher,
                                           subject, academicLevel, edition, courseCode,
                                           semester, department);
        return addBook(book);
    }
    
    public Book findBook(String bookId) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i] != null && books[i].getBookId().equals(bookId)) {
                return books[i];
            }
        }
        return null;
    }
    
    public List<Book> searchBooks(String query) {
        List<Book> results = new ArrayList<>();
        String lowerQuery = query.toLowerCase();
        
        for (int i = 0; i < bookCount; i++) {
            if (books[i] != null) {
                Book book = books[i];
                if (book.getTitle().toLowerCase().contains(lowerQuery) ||
                    book.getAuthor().toLowerCase().contains(lowerQuery) ||
                    book.getGenre().toLowerCase().contains(lowerQuery) ||
                    book.getIsbn().toLowerCase().contains(lowerQuery)) {
                    results.add(book);
                }
            }
        }
        return results;
    }
    
    public List<Book> getBooksByGenre(String genre) {
        List<Book> results = new ArrayList<>();
        
        for (int i = 0; i < bookCount; i++) {
            if (books[i] != null && books[i].getGenre().equalsIgnoreCase(genre)) {
                results.add(books[i]);
            }
        }
        return results;
    }
    
    public List<Book> getAvailableBooks() {
        List<Book> results = new ArrayList<>();
        
        for (int i = 0; i < bookCount; i++) {
            if (books[i] != null && books[i].isAvailable()) {
                results.add(books[i]);
            }
        }
        return results;
    }
    
    // Borrowing System
    public void borrowBook(String userId, String bookId) throws UserNotFound, BookNotAvailable, MaxBorrowLimit {
        User user = findUser(userId);
        if (user == null) {
            throw new UserNotFound("User not found");
        }
        
        Book book = findBook(bookId);
        if (book == null) {
            throw new BookNotAvailable("Book not found");
        }
        
        if (!book.isAvailable()) {
            throw new BookNotAvailable("Book is currently not available");
        }
        
        user.borrowBook(bookId);
        book.borrowBook(userId);
    }
    
    public void returnBook(String userId, String bookId) throws UserNotFound, BookNotAvailable {
        User user = findUser(userId);
        if (user == null) {
            throw new UserNotFound("User not found");
        }
        
        Book book = findBook(bookId);
        if (book == null) {
            throw new BookNotAvailable("Book not found");
        }
        
        if (!user.hasBorrowedBook(bookId)) {
            throw new BookNotAvailable("User has not borrowed this book");
        }
        
        user.returnBook(bookId);
        book.returnBook();
    }
    
    public void addBookmark(String userId, String bookId) throws UserNotFound, BookNotAvailable {
        User user = findUser(userId);
        if (user == null) {
            throw new UserNotFound("User not found");
        }
        
        Book book = findBook(bookId);
        if (book == null) {
            throw new BookNotAvailable("Book not found");
        }
        
        user.addBookmark(bookId);
    }
    
    public void removeBookmark(String userId, String bookId) throws UserNotFound, BookNotAvailable {
        User user = findUser(userId);
        if (user == null) {
            throw new UserNotFound("User not found");
        }
        
        Book book = findBook(bookId);
        if (book == null) {
            throw new BookNotAvailable("Book not found");
        }
        
        user.removeBookmark(bookId);
    }
    
    // Display Methods
    public DefaultListModel<String> displayUsers() {
        DefaultListModel<String> list = new DefaultListModel<>();
        for (int i = 0; i < userCount; i++) {
            if (users[i] != null) {
                list.addElement(users[i].toString());
            }
        }
        return list;
    }
    
    public DefaultListModel<String> displayBooks() {
        DefaultListModel<String> list = new DefaultListModel<>();
        for (int i = 0; i < bookCount; i++) {
            if (books[i] != null) {
                list.addElement(books[i].toString());
            }
        }
        return list;
    }
    
    public DefaultListModel<String> displayAvailableBooks() {
        DefaultListModel<String> list = new DefaultListModel<>();
        for (int i = 0; i < bookCount; i++) {
            if (books[i] != null && books[i].isAvailable()) {
                list.addElement(books[i].toString());
            }
        }
        return list;
    }
    
    // Getters
    public User[] getUsers() { return users; }
    public Book[] getBooks() { return books; }
    public int getUserCount() { return userCount; }
    public int getBookCount() { return bookCount; }
    
    // Statistics
    public int getTotalBorrowedBooks() {
        int count = 0;
        for (int i = 0; i < userCount; i++) {
            if (users[i] != null) {
                count += users[i].getBorrowedBooksCount();
            }
        }
        return count;
    }
    
    public int getOverdueBooks() {
        int count = 0;
        for (int i = 0; i < bookCount; i++) {
            if (books[i] != null && books[i].isOverdue()) {
                count++;
            }
        }
        return count;
    }
}
