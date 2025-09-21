package Books;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

import Exceptions.InvalidBookData;

public class Book implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String bookId;
    private String title;
    private String author;
    private String isbn;
    private String genre;
    private String description;
    private String language;
    private int totalPages;
    private String filePath;
    private String coverImagePath;
    private Date publicationDate;
    private String publisher;
    private double rating;
    private int totalRatings;
    private List<String> tags;
    private boolean isAvailable;
    private String currentBorrowerId;
    private Date borrowDate;
    private Date dueDate;
    private int borrowCount;
    
    public Book(String title, String author, String isbn, String genre, 
               String description, String language, int totalPages, 
               String filePath, String publisher) throws Exception {
        
        if (title == null || title.trim().isEmpty()) {
            throw new InvalidBookData("Title cannot be empty");
        }
        if (author == null || author.trim().isEmpty()) {
            throw new InvalidBookData("Author cannot be empty");
        }
        if (isbn == null || isbn.trim().isEmpty()) {
            throw new InvalidBookData("ISBN cannot be empty");
        }
        
        this.bookId = "BK" + (10000 + (int) (Math.random() * 89999));
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.genre = genre;
        this.description = description;
        this.language = language;
        this.totalPages = totalPages;
        this.filePath = filePath;
        this.publisher = publisher;
        this.publicationDate = new Date();
        this.rating = 0.0;
        this.totalRatings = 0;
        this.tags = new ArrayList<>();
        this.isAvailable = true;
        this.currentBorrowerId = null;
        this.borrowDate = null;
        this.dueDate = null;
        this.borrowCount = 0;
    }
    
    public void borrowBook(String userId) {
        if (isAvailable) {
            this.isAvailable = false;
            this.currentBorrowerId = userId;
            this.borrowDate = new Date();
            // Set due date to 14 days from now
            this.dueDate = new Date(System.currentTimeMillis() + (14 * 24 * 60 * 60 * 1000L));
            this.borrowCount++;
        }
    }
    
    public void returnBook() {
        this.isAvailable = true;
        this.currentBorrowerId = null;
        this.borrowDate = null;
        this.dueDate = null;
    }
    
    public void addRating(double rating) {
        if (rating >= 0 && rating <= 5) {
            double totalRating = this.rating * this.totalRatings;
            this.totalRatings++;
            this.rating = (totalRating + rating) / this.totalRatings;
        }
    }
    
    public void addTag(String tag) {
        if (!tags.contains(tag)) {
            tags.add(tag);
        }
    }
    
    public boolean isOverdue() {
        if (dueDate == null) return false;
        return new Date().after(dueDate);
    }
    
    public long getDaysOverdue() {
        if (!isOverdue()) return 0;
        return (new Date().getTime() - dueDate.getTime()) / (24 * 60 * 60 * 1000);
    }
    
    // Getters and Setters
    public String getBookId() { return bookId; }
    
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    
    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }
    
    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }
    
    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }
    
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    
    public String getLanguage() { return language; }
    public void setLanguage(String language) { this.language = language; }
    
    public int getTotalPages() { return totalPages; }
    public void setTotalPages(int totalPages) { this.totalPages = totalPages; }
    
    public String getFilePath() { return filePath; }
    public void setFilePath(String filePath) { this.filePath = filePath; }
    
    public String getCoverImagePath() { return coverImagePath; }
    public void setCoverImagePath(String coverImagePath) { this.coverImagePath = coverImagePath; }
    
    public Date getPublicationDate() { return publicationDate; }
    public void setPublicationDate(Date publicationDate) { this.publicationDate = publicationDate; }
    
    public String getPublisher() { return publisher; }
    public void setPublisher(String publisher) { this.publisher = publisher; }
    
    public double getRating() { return rating; }
    
    public int getTotalRatings() { return totalRatings; }
    
    public List<String> getTags() { return new ArrayList<>(tags); }
    
    public boolean isAvailable() { return isAvailable; }
    
    public String getCurrentBorrowerId() { return currentBorrowerId; }
    
    public Date getBorrowDate() { return borrowDate; }
    
    public Date getDueDate() { return dueDate; }
    
    public int getBorrowCount() { return borrowCount; }
    
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ID: " + bookId + 
               ", Genre: " + genre + ", Rating: " + String.format("%.1f", rating) + 
               ", Available: " + isAvailable + ", Type: " + this.getClass().getSimpleName();
    }
}
