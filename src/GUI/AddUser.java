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

public class AddUser extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public AddUser() {
		setTitle("Add User");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAddStudentUser = new JButton("Add Student User");
		btnAddStudentUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!GUIForm.addstudentuser.isVisible())
				{
					GUIForm.addstudentuser.setVisible(true);
					dispose();
				}
				else
				{
					JOptionPane.showMessageDialog(getComponent(0), "Already Opened", "Warning", 0);
				}
			}
		});
		btnAddStudentUser.setBounds(118, 56, 193, 38);
		contentPane.add(btnAddStudentUser);
		
		JButton btnAddPremiumUser = new JButton("Add Premium User");
		btnAddPremiumUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!GUIForm.addpremiumuser.isVisible())
				{
					GUIForm.addpremiumuser.setVisible(true);
					dispose();
				}
				else
				{
					JOptionPane.showMessageDialog(getComponent(0), "Already Opened", "Warning", 0);
				}
			}
		});
		btnAddPremiumUser.setBounds(118, 124, 193, 38);
		contentPane.add(btnAddPremiumUser);
		
		JButton btnAddAdminUser = new JButton("Add Admin User");
		btnAddAdminUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!GUIForm.addadminuser.isVisible())
				{
					GUIForm.addadminuser.setVisible(true);
					dispose();
				}
				else
				{
					JOptionPane.showMessageDialog(getComponent(0), "Already Opened", "Warning", 0);
				}
			}
		});
		btnAddAdminUser.setBounds(118, 190, 193, 38);
		contentPane.add(btnAddAdminUser);
		
		JLabel lblAddUser = new JLabel("Add User");
		lblAddUser.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAddUser.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddUser.setBounds(108, 11, 210, 34);
		contentPane.add(lblAddUser);
	}
}
