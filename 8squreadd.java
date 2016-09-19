/*http://ideone.com/3D97E4
*suqare series add....
*
*/


import java.lang.Math;
import java.io.DataInputStream;
class SersAdd
{
public static void main(String args[])
{
DataInputStream in= new DataInputStream(System.in);
int a=0;
int i=0;
double sum=0;
try
{
System.out.println("Enter value of n up to(1/n) which series will add: ");
a= Integer.parseInt(in.readLine());
}
catch(Exception e){}
for(i=1;i<a+1;i++)
{
sum=sum+(double)1/(i*i);
System.out.print("1/"+(i*i)); 
System.out.print("+");
}
System.out.println(" ");
System.out.println("sum of hermonic series = "+sum);


}

}