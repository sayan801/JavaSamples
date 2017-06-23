import java.util.Scanner;
public class Palindrome
{
	public static void main(String args[])
	{
		int r, n, sum = 0, temp;
		System.out.println("Enter any no to check if it is palindrome or not");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		
		temp = n;
		while(n > 0)
		{
			r = n % 10;
			sum = (sum * 10) + r;
			n = n/10;
		}
		if(temp==sum)
		System.out.println("Palindrome");
		
		else
		System.out.println("Not Palindrome");
		
	}
}
