package Users;

public class StudentUser extends User {
    private static final long serialVersionUID = 1L;
    
    private String institutionName;
    private String studentId;
    private String major;
    
    public StudentUser(String username, String email, String password, String fullName, 
                      String institutionName, String studentId, String major) throws Exception {
        super(username, email, password, fullName, 5); // Students can borrow 5 books
        this.institutionName = institutionName;
        this.studentId = studentId;
        this.major = major;
    }
    
    // Getters and Setters
    public String getInstitutionName() { return institutionName; }
    public void setInstitutionName(String institutionName) { this.institutionName = institutionName; }
    
    public String getStudentId() { return studentId; }
    public void setStudentId(String studentId) { this.studentId = studentId; }
    
    public String getMajor() { return major; }
    public void setMajor(String major) { this.major = major; }
    
    @Override
    public String toString() {
        return super.toString() + ", Institution: " + institutionName + 
               ", Student ID: " + studentId + ", Major: " + major;
    }
}
