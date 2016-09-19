/*http://ideone.com/d8UzUY
*continue and break 
*/

class Contbreak
{
public static void main(String args[])
{
int i,j;
LOOP1: for(i=1;i<100;i++)
	{System.out.println(" ");
	if(i>=10) 
	break;
	for(j=1;j<i+1;j++)
	{System.out.print(" * ");
	if(i==j) 
	continue LOOP1;
	}
	}
System.out.println("termination by break.........");


}
}