/*http://ideone.com/jys9ek
*celcious farhenhiet conversion
*
*/
import java.util.Scanner;
import java.lang.Math;
import java.io.DataInputStream;
class Cel2Far
{
public static void main(String args[])
{
double c;
double f;
Scanner in = new Scanner(System.in);
String name="";  
while(!name.equals("stop"))
{
System.out.println("enter the value of fahrenheit u want 2 convert in celsius : ");
f = in.nextDouble();
c=(f-32)/1.8;
System.out.println("the value in celsius : "+c);
}

}


}