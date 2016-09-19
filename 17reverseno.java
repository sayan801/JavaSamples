/*http://ideone.com/suFug9
*Reverse a no.
*/


import java.util.Scanner;
 
class RevNum
{
public static void main(String args[])
{
      int n, rev = 0;
 
      System.out.println("Enter any no. to reverse");
      Scanner in = new Scanner(System.in);
      n = in.nextInt();
      System.out.println("U hav entered : "+n);
      	while( n != 0 )
      	  {
          rev = rev * 10;
          rev = rev + n%10;
          n = n/10;
      	  }
      
      System.out.println("Reverse of entered number is: "+rev);
}
}