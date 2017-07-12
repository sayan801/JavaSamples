import java.util.Scanner;
public class CharToAscii2
{
public static void main(String args[])
	{
	System.out.println("Enter any string: ");
	Scanner scnr = new Scanner(System.in);
	 String ex=scnr.nextLine();
        char a[]=ex.toCharArray();

        for(int i=0;i<a.length;i++)
        {
	int x = (int)a[i];
	System.out.println(x);
	System.out.println("\n");
        
	}

	}
}
