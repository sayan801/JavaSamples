

import java.util.Scanner;

public class StringLength
{
	private static Scanner scnr;
	public static void main(String args[])
	{
		System.out.println("Enter a string: ");
		Scanner scnr = new Scanner(System.in);
		String strg1 = scnr.nextLine();
		PrintString(strg1);
	}
		public static void PrintString(String strg2)
		{
			
		String[] splitStr = strg2.split("\\s+");
		int length = splitStr.length;
		System.out.println("Length of the string is " +length);
		}
}
