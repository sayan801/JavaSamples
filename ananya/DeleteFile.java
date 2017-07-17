import java.io.File;
public class DeleteFile
{
	public static void main(String args[])
	{
		File f = null;
		boolean bool = false;
		try	
		{
			f = new File("Test2.txt");
			bool = f.delete();
			System.out.println("File deleted..." + bool);
		}
		catch(Exception ioe)
		{
		System.out.println(ioe);
		}
	}
}
