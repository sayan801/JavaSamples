/* Test Changes by Sayan
*  http://ideone.com/pg6PTj
*  switch case
*/


class Citychoice
{
public static void main(String args[])
{
char choice;
System.out.println("select your choice");
System.out.println("press M-- for Madras");
System.out.println("press B-- for Bombay");
System.out.println("press K-- for kolkata");
System.out.println("\tyour choice------------");
try{
switch(choice = (char)System.in.read())
{
case 'M':
case 'm':System.out.println("\t\t\t\t Madrass  ");
break;

case 'B':
case 'b':System.out.println("\t\t\t\tBombay   ");
break;

case 'K':
case 'k':System.out.println("\t\t\t\tKolkata   ");
break;

default: System.out.println("Invalid choice.............");

}

}
catch (Exception e) {System.out.println("I/O error");}

}


}
