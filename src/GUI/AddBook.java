package GUI;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class AddBook extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public AddBook() {
		setTitle("Add Book");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAddFictionBook = new JButton("Add Fiction Book");
		btnAddFictionBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!GUIForm.addfictionbook.isVisible())
				{
					GUIForm.addfictionbook.setVisible(true);
					dispose();
				}
				else
				{
					JOptionPane.showMessageDialog(getComponent(0), "Already Opened", "Warning", 0);
				}
			}
		});
		btnAddFictionBook.setBounds(118, 56, 193, 38);
		contentPane.add(btnAddFictionBook);
		
		JButton btnAddNonFictionBook = new JButton("Add Non-Fiction Book");
		btnAddNonFictionBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!GUIForm.addnonfictionbook.isVisible())
				{
					GUIForm.addnonfictionbook.setVisible(true);
					dispose();
				}
				else
				{
					JOptionPane.showMessageDialog(getComponent(0), "Already Opened", "Warning", 0);
				}
			}
		});
		btnAddNonFictionBook.setBounds(118, 124, 193, 38);
		contentPane.add(btnAddNonFictionBook);
		
		JButton btnAddAcademicBook = new JButton("Add Academic Book");
		btnAddAcademicBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!GUIForm.addacademicbook.isVisible())
				{
					GUIForm.addacademicbook.setVisible(true);
					dispose();
				}
				else
				{
					JOptionPane.showMessageDialog(getComponent(0), "Already Opened", "Warning", 0);
				}
			}
		});
		btnAddAcademicBook.setBounds(118, 190, 193, 38);
		contentPane.add(btnAddAcademicBook);
		
		JLabel lblAddBook = new JLabel("Add Book");
		lblAddBook.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAddBook.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddBook.setBounds(108, 11, 210, 34);
		contentPane.add(lblAddBook);
	}
}
