package GUI;
import javax.swing.JFrame;

public class SearchBooks extends JFrame {
    private static final long serialVersionUID = 1L;
    
    public SearchBooks() {
        setTitle("Search Books");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 600, 500);
        setVisible(false);
    }
}
