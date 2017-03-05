/*http://ideone.com/VoWkd6
*while loop and print a string (infiinity loop)
*/
//import java.Io.*;
import java.util.Scanner;
class WhileLoop
{
public static void main(String args[])	
{
	//StringBuffer string = new StringBuffer();
	//char c;
	Scanner in = new Scanner(System.in);
	String s;
	System.out.println("Enter a string .............");
	s = in.nextLine();
	try{
		//while((c=(char)System.in.read()) != '\n'){
		while(s != null){
		
			System.out.println("U have entered a string");
//			string.append(c);
						}
		
	}
	catch(Exception e)
	{
		System.out.println("Wrong input");
	}
	System.out.println("U have entered...............");
	System.out.println("\t\t\t"+s);
}
	
}