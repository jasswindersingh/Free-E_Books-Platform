package GUI;
import java.awt.Point;

public class GUIForm {

	public static Login login= new Login();
	public static Menu menu= new Menu();
	public static AddUser adduser= new AddUser();
	public static AddStudentUser addstudentuser= new AddStudentUser();
	public static AddPremiumUser addpremiumuser = new AddPremiumUser();
	public static AddAdminUser addadminuser = new AddAdminUser();
	public static AddBook addbook= new AddBook();
	public static AddFictionBook addfictionbook= new AddFictionBook();
	public static AddNonFictionBook addnonfictionbook = new AddNonFictionBook();
	public static AddAcademicBook addacademicbook = new AddAcademicBook();
	public static DisplayList displaylist= new DisplayList();
	public static BorrowBook borrowbook= new BorrowBook();
	public static ReturnBook returnbook = new ReturnBook();
	public static SearchBooks searchbooks = new SearchBooks();
	public static BookViewer bookviewer = new BookViewer();
	
	public static void UpdateDisplay()
	{
		
		if(displaylist.isVisible())
		{
			Point O= displaylist.getLocation();
			displaylist.dispose();
			displaylist = new DisplayList();
			displaylist.setVisible(true);
			displaylist.setLocation(O);;
		}
		
		else {
			displaylist = new DisplayList();
		}
		
	}
	
	
}
