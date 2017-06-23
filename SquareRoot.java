import java.util.Scanner;
public class SquareRoot
{
	public static void main(String args[])
	{
		double number;
		System.out.println("Enter any no");
		Scanner in = new Scanner(System.in);
		number = in.nextInt();
		double squareRoot = Math.sqrt(number);
		System.out.println("number : " +number);
		System.out.println("Square root : "+squareRoot);
	}
}
