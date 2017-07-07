import java.util.Scanner;
public class SpaceRemover2
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the string: ");
		String S1 = scan.nextLine();
		
		
		String S2 = S1.replaceAll(" " , "");
		System.out.println(S2);	
	}
}
