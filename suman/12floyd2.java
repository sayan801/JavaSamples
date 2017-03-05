/*http://ideone.com/aL9sL5
*floyd's binary triangle
*/

import java.util.Scanner;
class FloydBinary
{
public static void main(String args[])
{
int row,col,n,num=49,a;
//int num 50;
Scanner R= new Scanner(System.in);
System.out.println("Enter the no line u want Floyd binary triangle");
n = R.nextInt();
System.out.println("Floyd Binary Triangle------------");
for(row=1;row<=n;row++){
	for(col=1;col<=row;col++){
		a=num%2;
//		a=num%2;  //when num is even and triangle starts with 0
		System.out.print(a+ " ");
		num--;

				}
		System.out.println(" ");
			}




}
}