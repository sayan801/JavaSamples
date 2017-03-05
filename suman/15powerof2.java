/*http://ideone.com/m1XdQm
*power of 2
*/

class PowerOf
{
public static void main(String args[])
{
double a;
double b;
double c;
System.out.println("2 to power -n     n    2 to power n");
a=1;
for(b=0;b<10;b++)
{
if(b==0)
a=1;
else
a=a*2;
c=1.0/a;
System.out.println("      "+c+"       "+b+"      "+a);
}


}

}
