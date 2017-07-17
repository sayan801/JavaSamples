import java.io.*;
public class SearchArray
{
	public static void main(String args[])
	{
		String[] Names = new String[]{"Chandra", "Abhishek", "Suman", "Abhik", "Rajesh", "Shyama", "Bachchha", "Pusp", "Payel", 						"Ananya"};
		String S1 = "Ananya";
		boolean contains = false;

		try
		{
		for(int i = 0; i <= Names.length; i++)
		{
			if 
			(Names[i].equals(S1))
			{
				contains = true;
				break;
			}
		}
		}
		catch (Exception ioe)

		{
		ioe.printStackTrace();
		}
			if(contains)
				System.out.println("Names contain Ananya...");
			else
				System.out.println("Names does not contain Ananya...");
		
	}
}
