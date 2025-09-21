package GUI;
import javax.swing.JFrame;

public class ReturnBook extends JFrame {
    private static final long serialVersionUID = 1L;
    
    public ReturnBook() {
        setTitle("Return Book");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 500, 400);
        setVisible(false);
    }
}
