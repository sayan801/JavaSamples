import java.util.Scanner;
public class SecondConverter
{
	public static void main(String args[])
	{
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter hr: ");
		int hr = scnr.nextInt();
		int sec1 = hr * 3600;
		
		System.out.println("Enter minutes: ");
		int minutes = scnr.nextInt();
		int sec2 = minutes * 60;
		
		System.out.println("Enter seconds: ");
		int seconds = scnr.nextInt();
		int sec3 = seconds; 
		
		int sec4 = sec1 + sec2 + sec3;
		System.out.println("Time in second is " +sec4);
	}
}
