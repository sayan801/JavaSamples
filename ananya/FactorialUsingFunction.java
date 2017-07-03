import java.util.Scanner;

public class FactorialUsingFunction
{
	private static Scanner scnr;
	public static void main(String args[])
	{
		System.out.println("Enter the number: ");
		Scanner scnr = new Scanner(System.in);
		int number = scnr.nextInt();
		PrintFact(number);
	}
	public static void PrintFact(int no)
	{
		int i;
		int fact = 1;	
		
		for(i = 1; i <= no; i++)
		{
			fact=fact*i;
		}
		System.out.println("The Factorial is:"+fact);
			
	}

}
