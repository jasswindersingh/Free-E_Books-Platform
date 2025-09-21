package Users;
import java.util.Date;

public class PremiumUser extends User {
    private static final long serialVersionUID = 1L;
    
    private String subscriptionType;
    private Date subscriptionExpiry;
    private boolean hasOfflineAccess;
    private boolean hasPrioritySupport;
    
    public PremiumUser(String username, String email, String password, String fullName, 
                      String subscriptionType, Date subscriptionExpiry) throws Exception {
        super(username, email, password, fullName, 10); // Premium users can borrow 10 books
        this.subscriptionType = subscriptionType;
        this.subscriptionExpiry = subscriptionExpiry;
        this.hasOfflineAccess = true;
        this.hasPrioritySupport = true;
    }
    
    public boolean isSubscriptionActive() {
        return subscriptionExpiry != null && subscriptionExpiry.after(new java.util.Date());
    }
    
    // Getters and Setters
    public String getSubscriptionType() { return subscriptionType; }
    public void setSubscriptionType(String subscriptionType) { this.subscriptionType = subscriptionType; }
    
    public Date getSubscriptionExpiry() { return subscriptionExpiry; }
    public void setSubscriptionExpiry(Date subscriptionExpiry) { this.subscriptionExpiry = subscriptionExpiry; }
    
    public boolean hasOfflineAccess() { return hasOfflineAccess; }
    public void setHasOfflineAccess(boolean hasOfflineAccess) { this.hasOfflineAccess = hasOfflineAccess; }
    
    public boolean hasPrioritySupport() { return hasPrioritySupport; }
    public void setHasPrioritySupport(boolean hasPrioritySupport) { this.hasPrioritySupport = hasPrioritySupport; }
    
    @Override
    public String toString() {
        return super.toString() + ", Subscription: " + subscriptionType + 
               ", Expires: " + subscriptionExpiry + ", Offline Access: " + hasOfflineAccess;
    }
}
