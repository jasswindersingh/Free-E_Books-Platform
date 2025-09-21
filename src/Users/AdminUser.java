package Users;

public class AdminUser extends User {
    private static final long serialVersionUID = 1L;
    
    private String adminLevel;
    private String department;
    private boolean canManageUsers;
    private boolean canManageBooks;
    private boolean canViewAnalytics;
    
    public AdminUser(String username, String email, String password, String fullName, 
                    String adminLevel, String department) throws Exception {
        super(username, email, password, fullName, 20); // Admins can borrow 20 books
        this.adminLevel = adminLevel;
        this.department = department;
        this.canManageUsers = true;
        this.canManageBooks = true;
        this.canViewAnalytics = true;
    }
    
    // Getters and Setters
    public String getAdminLevel() { return adminLevel; }
    public void setAdminLevel(String adminLevel) { this.adminLevel = adminLevel; }
    
    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
    
    public boolean canManageUsers() { return canManageUsers; }
    public void setCanManageUsers(boolean canManageUsers) { this.canManageUsers = canManageUsers; }
    
    public boolean canManageBooks() { return canManageBooks; }
    public void setCanManageBooks(boolean canManageBooks) { this.canManageBooks = canManageBooks; }
    
    public boolean canViewAnalytics() { return canViewAnalytics; }
    public void setCanViewAnalytics(boolean canViewAnalytics) { this.canViewAnalytics = canViewAnalytics; }
    
    @Override
    public String toString() {
        return super.toString() + ", Admin Level: " + adminLevel + 
               ", Department: " + department + ", Can Manage Users: " + canManageUsers;
    }
}
