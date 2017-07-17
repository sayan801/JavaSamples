import java.io.*;
class ReadBytes
{
	public static void main(String args[])
	{
	FileInputStream infile = null;
	int b;
	try
		{
			FileReader fr = new FileReader("Test.txt");
			int i;
			while((i = fr.read())!= -1)
			System.out.print((char)i);
		}
		catch (IOException ioe)
		{
			System.out.println(ioe);	
		}
	}
}
