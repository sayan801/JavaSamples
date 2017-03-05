/*
*http://ideone.com/DQFpbQ
*Multiplication Table
*/


class DoWhile
{
public static void main(String args[])
{
int row=1,col=1,y;
System.out.println("Multiplication table......");
do{
col=1;
do	{
y= row*col;
System.out.print(" "+y);
col=col+1;
	}
while(col<=10);
System.out.println("\n");
row=row+1;
		
}
while(row<10);
}
}