import java.util.Scanner;
public class Capitalization
{
	public static void main(String args[])
	{
	Scanner scnr = new Scanner(System.in);
	System.out.println("Enter any string: ");
	
	String strUpper = scnr.nextLine();
	
	String strLower = strUpper.toUpperCase();
	System.out.println("The input string in upper case is " +strLower);
	}
}
