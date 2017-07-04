import java.util.Scanner;
public class StringComparison
{
	private static Scanner scnr;

	public static void main(String args[])
	{ 
		scnr = new Scanner(System.in);
		
		System.out.println("Enter String1: ");
		String S1 = scnr.nextLine();
		
		System.out.println("Enter String2: ");
		String S2 = scnr.nextLine();
		
		System.out.println("Enter String3: ");
		String S3 = scnr.nextLine();
		
		System.out.println(S1 == S2);
		System.out.println(S1 == S3);  
		System.out.println(S3 == S1);
		
	}
}
