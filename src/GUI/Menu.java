package GUI;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Data.FileIO;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import javax.swing.Icon;

public class Menu extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Menu() {
		setTitle("E-Books Platform");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 649, 474);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setForeground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblEBooksPlatform = new JLabel("E-Books Platform");
		lblEBooksPlatform.setHorizontalAlignment(SwingConstants.CENTER);
		lblEBooksPlatform.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblEBooksPlatform.setBounds(0, 69, 613, 59);
		contentPane.add(lblEBooksPlatform);
		
		FileIO.Read();
		
//		JButton btnAddAccount = new JButton("Add Account");
//		btnAddAccount.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				if(!GUIForm.addaccount.isVisible())
//				{
//					GUIForm.addaccount.setVisible(true);
//				}
//				else
//				{
//					JOptionPane.showMessageDialog(getComponent(0), "Already Opened", "Warning", 0);
//				}
//				
//			}
//		});
//		btnAddAccount.setBounds(217, 162, 194, 40);
//		contentPane.add(btnAddAccount);
		
		JButton btnBorrowBook = new JButton("Borrow Book");
		btnBorrowBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!GUIForm.borrowbook.isVisible())
				{
					GUIForm.borrowbook.setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(getComponent(0), "Already Opened", "Warning", 0);
				}
				
			}
		});
		btnBorrowBook.setBounds(217, 213, 194, 33);
		contentPane.add(btnBorrowBook);
		
		JButton btnReturnBook = new JButton("Return Book");
		btnReturnBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!GUIForm.returnbook.isVisible())
				{
					GUIForm.returnbook.setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(getComponent(0), "Already Opened", "Warning", 0);
				}
				
				
			}
			
		});
		btnReturnBook.setBounds(217, 256, 194, 33);
		contentPane.add(btnReturnBook);
		
		JButton btnDisplayBookList = new JButton("Display Book List");
		btnDisplayBookList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if(!GUIForm.displaylist.isVisible())
				{
					GUIForm.displaylist.setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(getComponent(0), "Already Opened", "Warning", 0);
				}
				
			}
		});
		btnDisplayBookList.setBounds(217, 300, 194, 32);
		contentPane.add(btnDisplayBookList);
		
		JButton btnAddUser = new JButton("Add User");
		btnAddUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(!GUIForm.adduser.isVisible())
			{
				GUIForm.adduser.setVisible(true);
			}
			else
			{
				JOptionPane.showMessageDialog(getComponent(0), "Already Opened", "Warning", 0);
			}
				
				
			}
			
		});
		btnAddUser.setBounds(217, 166, 194, 36);
		contentPane.add(btnAddUser);
		
		JButton btnAddBook = new JButton("Add Book");
		btnAddBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(!GUIForm.addbook.isVisible())
			{
				GUIForm.addbook.setVisible(true);
			}
			else
			{
				JOptionPane.showMessageDialog(getComponent(0), "Already Opened", "Warning", 0);
			}
				
				
			}
			
		});
		btnAddBook.setBounds(217, 343, 194, 36);
		contentPane.add(btnAddBook);
		
		JButton btnSearchBooks = new JButton("Search Books");
		btnSearchBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(!GUIForm.searchbooks.isVisible())
			{
				GUIForm.searchbooks.setVisible(true);
			}
			else
			{
				JOptionPane.showMessageDialog(getComponent(0), "Already Opened", "Warning", 0);
			}
				
				
			}
			
		});
		btnSearchBooks.setBounds(217, 390, 194, 36);
		contentPane.add(btnSearchBooks);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(getComponent(0), "Thanks For Using") ;
				FileIO.Write();
				System.exit(0);
			}
		});
		btnExit.setBounds(217, 437, 194, 33);
		contentPane.add(btnExit);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Menu.class.getResource("/img/1.png")));
		lblNewLabel.setBounds(397, 166, 216, 213);
		contentPane.add(lblNewLabel);
		
		//Image image=GenerateImage.toImage(true);  //this generates an image file
		ImageIcon icon = new ImageIcon("1.png");
	}
}
