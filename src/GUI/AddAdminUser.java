package GUI;
import javax.swing.JFrame;

public class AddAdminUser extends JFrame {
    private static final long serialVersionUID = 1L;
    
    public AddAdminUser() {
        setTitle("Add Admin User");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 500, 400);
        setVisible(false);
    }
}
