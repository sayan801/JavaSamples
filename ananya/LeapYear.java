import java.util.Scanner;
	public class LeapYear
	{
		public static void main(String args[])
		{	
			System.out.println("Enter any year");
			Scanner scnr = new Scanner(System.in);
			int year = scnr.nextInt(); 
			
			if((year % 400 == 0)||((year % 4 == 0)&&(year % 100 != 0)))
			System.out.println("This year is leap year"+year);
			else
			System.out.println("This is not leap year"+year);
		}
	}
