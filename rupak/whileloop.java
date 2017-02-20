package whileloop;
import java.util.Scanner;
public class whileloop
{
  public static void main(String[] args) 
  {
    
    Scanner keyboard = new Scanner(System.in);
		int pin = 12345;

		System.out.println("WELCOME TO SPRING WOODS CREDIT UNION.");
		System.out.print("ENTER YOUR PIN:: ");
		int entry = keyboard.nextInt();

		while ( entry != pin )
		{
			System.out.println("\nINCORRECT PIN. TRY AGAIN.");
			System.out.print("ENTER YOUR PIN:: ");
			entry = keyboard.nextInt();

                }
  }
}