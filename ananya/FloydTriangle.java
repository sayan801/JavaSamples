import java.util.Scanner;
public class FloydTriangle
{
	public static void main(String args[])
	{
		System.out.println("Enter the no of rows: ");
		Scanner scnr = new Scanner(System.in);
		int n = scnr.nextInt();
		int num = 1, c, d;
		
		System.out.println("Floyd's Triangle: ");
		for(c = 1; c <= n; c++)
		{
			for(d = 1; d <= c; d++)
			{
				System.out.print(num+ " ");
				num++;
			}
				System.out.println( );
		}
	}
}
