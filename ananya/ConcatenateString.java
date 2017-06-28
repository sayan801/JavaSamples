import java.util.Scanner;
public class ConcatenateString
{
	public static void main(String args[])
	{
		String string1, string2;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the 1st string: ");
		string1 = scan.nextLine();
		string1 = string1 + " ";
		System.out.print("Enter the 2nd string; ");
		string2 = scan.nextLine();
		
		System.out.print("Concatenate string2 into string1: ");
		string1 = string1.concat(string2);
		
		System.out.println("String 1 after concatenation is: " +string1);
	}
}
