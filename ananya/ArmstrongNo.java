import java.util.Scanner;
public class ArmstrongNo
{
	public static void main(String args[])
	{
		System.out.println("Enter the no which you want check armstrong number or not: ");
		Scanner scnr = new Scanner(System.in);
		int n = scnr.nextInt();
		int temp, a, c = 0;
		temp = n;
		while(n > 0)
		{
			a = n % 10;
			n = n / 10;
			c = c + (a * a * a);
		}
			if(temp == c)
			System.out.println("This no is armstrong no.");
			else
			System.out.println("This is not armstrong no.");
	}
}
