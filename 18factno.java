
/*http://ideone.com/iEl5hL
*Factorial of a no.
*/
import java.util.Scanner;
 
class FactNo
{
public static void main(String args[])
{
      int n, fact = 1;
 
      System.out.println("Enter any no. to reverse");
      Scanner in = new Scanner(System.in);
      n = in.nextInt();
      System.out.println("U hav entered : "+n);
      	while(n>1 && n != 0 )
      	  {
          fact =fact* n*(n-1);
          n = n-2;
      	  }
      
      System.out.println("factorial of entered number is: "+fact);
}
}