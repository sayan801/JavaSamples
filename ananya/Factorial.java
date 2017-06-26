import java.util.Scanner;

public class Factorial
{	
	private static Scanner scnr;
	
	public static void main(String args[])
	{
		int i;
		int fact = 1;
		int number = 0;
		scnr = new Scanner(System.in);
		System.out.println("Enter the number: ");
		
		number = scnr.nextInt();
		for(i = 1; i <= number; i++){
			fact=fact*i;
		}
		System.out.println("The Factorial is:"+fact);
			
	}

}
