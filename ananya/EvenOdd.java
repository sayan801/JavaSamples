import java.util.Scanner;
	public class EvenOdd
		{
			public static void main(String args[])
		{
			int x;
			System.out.println("Enter any no to check if it is odd or even");
			Scanner in = new Scanner(System.in);
			x = in.nextInt();
			
			if(x % 2 == 0)
				System.out.println("Even no");
			else
				System.out.println("Odd no");
		
	}
}
