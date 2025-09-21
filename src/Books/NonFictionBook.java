package Books;

public class NonFictionBook extends Book {
    private static final long serialVersionUID = 1L;
    
    private String subject; // Science, History, Biography, etc.
    private String academicLevel; // Beginner, Intermediate, Advanced
    private boolean hasReferences;
    private boolean hasIndex;
    private String edition;
    
    public NonFictionBook(String title, String author, String isbn, String genre, 
                         String description, String language, int totalPages, 
                         String filePath, String publisher, String subject, 
                         String academicLevel, String edition) throws Exception {
        super(title, author, isbn, genre, description, language, totalPages, filePath, publisher);
        this.subject = subject;
        this.academicLevel = academicLevel;
        this.edition = edition;
        this.hasReferences = false;
        this.hasIndex = false;
    }
    
    public void setReferenceInfo(boolean hasReferences, boolean hasIndex) {
        this.hasReferences = hasReferences;
        this.hasIndex = hasIndex;
    }
    
    // Getters and Setters
    public String getSubject() { return subject; }
    public void setSubject(String subject) { this.subject = subject; }
    
    public String getAcademicLevel() { return academicLevel; }
    public void setAcademicLevel(String academicLevel) { this.academicLevel = academicLevel; }
    
    public boolean hasReferences() { return hasReferences; }
    public void setHasReferences(boolean hasReferences) { this.hasReferences = hasReferences; }
    
    public boolean hasIndex() { return hasIndex; }
    public void setHasIndex(boolean hasIndex) { this.hasIndex = hasIndex; }
    
    public String getEdition() { return edition; }
    public void setEdition(String edition) { this.edition = edition; }
    
    @Override
    public String toString() {
        return super.toString() + ", Subject: " + subject + 
               ", Level: " + academicLevel + ", Edition: " + edition +
               ", References: " + hasReferences + ", Index: " + hasIndex;
    }
}
