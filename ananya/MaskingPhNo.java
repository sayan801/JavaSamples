import java.util.Scanner;
public class MaskingPhNo
{
	public static void main(String args[])
	{
 		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter any phone number: ");
		String PhoneNo = scnr.nextLine();

		String Strg1 = "****";
		String Strg2 = PhoneNo.substring(4);

		Strg1 = Strg1.concat(Strg2);

		System.out.println("After masking: " + Strg1);
		
	}
}
