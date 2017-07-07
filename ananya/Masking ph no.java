import java.util.Scanner;
public class Masking
{
	public static void main(String args[])
	{
		String PhoneNo = "9333112611";

		String Strg1 = "****";
		String Strg2 = PhoneNo.substring(4);

		
		Strg1 = Strg1.concat(Strg2);

		System.out.println("After masking: " + Strg1);
		
	}
}
