package Books;

public class FictionBook extends Book {
    private static final long serialVersionUID = 1L;
    
    private String subGenre; // Fantasy, Sci-Fi, Romance, Mystery, etc.
    private String targetAudience; // Children, Young Adult, Adult
    private boolean isSeries;
    private int seriesNumber;
    private String seriesName;
    
    public FictionBook(String title, String author, String isbn, String genre, 
                      String description, String language, int totalPages, 
                      String filePath, String publisher, String subGenre, 
                      String targetAudience) throws Exception {
        super(title, author, isbn, genre, description, language, totalPages, filePath, publisher);
        this.subGenre = subGenre;
        this.targetAudience = targetAudience;
        this.isSeries = false;
        this.seriesNumber = 0;
        this.seriesName = null;
    }
    
    public void setSeriesInfo(String seriesName, int seriesNumber) {
        this.isSeries = true;
        this.seriesName = seriesName;
        this.seriesNumber = seriesNumber;
    }
    
    // Getters and Setters
    public String getSubGenre() { return subGenre; }
    public void setSubGenre(String subGenre) { this.subGenre = subGenre; }
    
    public String getTargetAudience() { return targetAudience; }
    public void setTargetAudience(String targetAudience) { this.targetAudience = targetAudience; }
    
    public boolean isSeries() { return isSeries; }
    public void setSeries(boolean series) { this.isSeries = series; }
    
    public int getSeriesNumber() { return seriesNumber; }
    public void setSeriesNumber(int seriesNumber) { this.seriesNumber = seriesNumber; }
    
    public String getSeriesName() { return seriesName; }
    public void setSeriesName(String seriesName) { this.seriesName = seriesName; }
    
    @Override
    public String toString() {
        String seriesInfo = isSeries ? " (Series: " + seriesName + " #" + seriesNumber + ")" : "";
        return super.toString() + ", Sub-Genre: " + subGenre + 
               ", Audience: " + targetAudience + seriesInfo;
    }
}
