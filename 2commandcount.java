/*
* http://ideone.com/Sxr7pR
*input arguments and display it with no of arguments
*/

class ComLineTest
{
public static void main(String args[])
	{
		int count,i=0;
		String string;
		count = args.length;
		System.out.println("Number of Arguments = " + count);
		while(i<count)
		{
			string = args[i];
			i = i + 1;
			System.out.println(i+ ":" +" java is " +string);   
			
			}
	}
}