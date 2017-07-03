import java.util.Scanner;
public class Armstrong
{
	public static void main(String args[])
	{
		System.out.println("Enter the no which you want check armstrong number or not: ");
		Scanner scnr = new Scanner(System.in);
		int n = scnr.nextInt();
		PrintArmstrongNo(n);
	}
		public static void PrintArmstrongNo(int no)
			{
				
				int temp, a, c = 0;
				temp = no;
				while(no > 0)
				{
					a = no % 10;
					n = no / 10;
					c = c + (a * a * a);
				}
					if(temp == c)
					System.out.println("This no is armstrong no.");
					else
					System.out.println("This is not armstrong no.");
			}
}
