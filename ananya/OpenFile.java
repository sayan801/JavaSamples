import java.awt.Desktop;
import java.io.IOException;
import java.io.File;
public class OpenFile
{
	public static void main(String args[])
	{
		File file = new File("Test.txt");		
		try
		{
			Desktop desktop = null;
			if(Desktop.isDesktopSupported())
			{
				desktop = Desktop.getDesktop();
			}
			desktop.open(file);
		}
		catch (IOException ioe)
		{
			System.out.println(ioe);	
		}
	}
}
