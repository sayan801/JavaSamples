import java.util.Scanner;
public class ReverseString
{
	public static void main(String args[])
	{
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter any String: ");
		String myString = scnr.nextLine();
		String reverse = "";
		int length = myString.length();
		for(int i = length - 1; i >= 0; i--)
		 reverse = reverse + myString.charAt(i);
		System.out.println("Reverse of entered string is " + reverse);

	}
}
