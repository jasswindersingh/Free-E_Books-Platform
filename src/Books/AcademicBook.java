package Books;

public class AcademicBook extends NonFictionBook {
    private static final long serialVersionUID = 1L;
    
    private String courseCode;
    private String semester;
    private String department;
    private boolean isRequired;
    private boolean isRecommended;
    private String professor;
    
    public AcademicBook(String title, String author, String isbn, String genre, 
                       String description, String language, int totalPages, 
                       String filePath, String publisher, String subject, 
                       String academicLevel, String edition, String courseCode, 
                       String semester, String department) throws Exception {
        super(title, author, isbn, genre, description, language, totalPages, 
              filePath, publisher, subject, academicLevel, edition);
        this.courseCode = courseCode;
        this.semester = semester;
        this.department = department;
        this.isRequired = false;
        this.isRecommended = false;
        this.professor = null;
    }
    
    public void setCourseInfo(boolean isRequired, boolean isRecommended, String professor) {
        this.isRequired = isRequired;
        this.isRecommended = isRecommended;
        this.professor = professor;
    }
    
    // Getters and Setters
    public String getCourseCode() { return courseCode; }
    public void setCourseCode(String courseCode) { this.courseCode = courseCode; }
    
    public String getSemester() { return semester; }
    public void setSemester(String semester) { this.semester = semester; }
    
    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
    
    public boolean isRequired() { return isRequired; }
    public void setRequired(boolean required) { this.isRequired = required; }
    
    public boolean isRecommended() { return isRecommended; }
    public void setRecommended(boolean recommended) { this.isRecommended = recommended; }
    
    public String getProfessor() { return professor; }
    public void setProfessor(String professor) { this.professor = professor; }
    
    @Override
    public String toString() {
        String courseInfo = isRequired ? " (Required)" : isRecommended ? " (Recommended)" : "";
        return super.toString() + ", Course: " + courseCode + 
               ", Semester: " + semester + ", Department: " + department + courseInfo;
    }
}
