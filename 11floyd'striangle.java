/*http://ideone.com/ezUCzv
*Floyd's triangle...........
*/
import java.util.Scanner;
class FloydTriangle
{
public static void main(String args[])
{
int row,col,num=1,n;
Scanner in= new Scanner(System.in);
System.out.println("Enter the no of lines u want d Floyd triangle - ");
n= in.nextInt();
System.out.println("Floyd triangle ----");
 for(row=1;row<=n;row++)
{
for(col=1;col<=row;col++)
{
System.out.print(num+ " ");
num++;

}
System.out.println(" ");
}
}

}