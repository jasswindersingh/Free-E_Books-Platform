package GUI;
import javax.swing.JFrame;

public class BookViewer extends JFrame {
    private static final long serialVersionUID = 1L;
    
    public BookViewer() {
        setTitle("Book Viewer");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 800, 600);
        setVisible(false);
    }
}
