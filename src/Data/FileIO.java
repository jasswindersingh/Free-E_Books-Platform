package Data;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import Library.*;

public class FileIO {
	
	
public static Library library=null;


	public static void Read()
	{
//		Library library =null;
		FileInputStream fis =null;
		ObjectInputStream oin=null;
		try {
			fis =new FileInputStream("data");
			oin=new ObjectInputStream(fis);
			FileIO.library=(Library)oin.readObject();
			}
			
		catch (Exception en) {
			FileIO.library=new Library();
				}
		
		finally{
			try{
				if(oin!=null) oin.close();
			if(fis!=null) fis.close();
			}
			catch (IOException en) {
					}
			
		}
		//return library;
	}
	
	public static void Write()
	{
		try {
			FileOutputStream fout=new FileOutputStream("data");
			ObjectOutputStream out=new ObjectOutputStream(fout);
			out.writeObject(FileIO.library);
			out.flush();
			fout.close();
			}
			catch(Exception en)
			{
				
			}
	}
}
