import java.util.Scanner;
public class CompareString
{
	public static void main(String args[])
	{
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter String1:");
		String S1 = scnr.nextLine();
		
		System.out.println("Enter String2:");
		String S2 = scnr.nextLine();
		
		if(S1.compareTo(S2) == 0)
			System.out.println("String1 is equal to String2.");
		
		else 
			System.out.println("String1 is not equal to String3.");
		
	}
}
