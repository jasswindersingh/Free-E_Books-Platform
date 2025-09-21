package GUI;
import javax.swing.DefaultListModel;
import Data.FileIO;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JList;
import java.awt.SystemColor;

public class DisplayList extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static DefaultListModel<String> arr = new DefaultListModel<String>();
	private JPanel contentPane;

	
	/**
	 * Create the frame.
	 */
	@SuppressWarnings({ })
	public DisplayList() {
		setTitle("Book List");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 649, 474);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBookList = new JLabel("Book List");
		lblBookList.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBookList.setHorizontalAlignment(SwingConstants.CENTER);
		lblBookList.setBounds(0, 11, 623, 31);
		contentPane.add(lblBookList);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(10, 66, 613, 358);
		contentPane.add(scrollPane);
		
		arr=FileIO.library.displayBooks();
		JList<String> list = new JList<String>(arr);
		scrollPane.setViewportView(list);
		
	

	}
}
