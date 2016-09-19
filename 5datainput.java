/*http://ideone.com/Q27cfj
*Reading data from keyboard.......
*/

import java.io.DataInputStream;

class Reading
{
public static void main(String args[])
{
DataInputStream in= new DataInputStream(System.in);
int intno=0;
float fltno=0.0f;

try
{
System.out.println("Enter interger no:  ");
intno=Integer.parseInt(in.readLine());
System.out.println("Enter float no:  ");
fltno=Float.valueOf(in.readLine()).floatValue();

}
catch(Exception e){}
System.out.println("Interger no u put : "+intno);
System.out.println("Float no u put : "+fltno);

}

}