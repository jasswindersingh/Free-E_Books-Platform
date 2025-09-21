package GUI;
import javax.swing.JFrame;

public class AddFictionBook extends JFrame {
    private static final long serialVersionUID = 1L;
    
    public AddFictionBook() {
        setTitle("Add Fiction Book");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 600, 500);
        setVisible(false);
    }
}
