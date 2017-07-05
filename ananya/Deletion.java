import java.util.Scanner;
public class Deletion
{
	public static void main(String args[])
	{
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter a word:");
		String word = scnr.nextLine();
		
		int l =  word.length();
		int odd = (l+1)/2;
		int even = l/2;
		if(l % 2 == 0)
		{			
			StringBuffer sb = new StringBuffer(word);
			sb.delete(even - 1, even + 2);
			System.out.println(sb);
		}
		else
			{
				StringBuffer sb = new StringBuffer(word);
				sb.delete(odd - 1, odd + 2);
				System.out.println(sb);
			
			}
			
		
	}
}
