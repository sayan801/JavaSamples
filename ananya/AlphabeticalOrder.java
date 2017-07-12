import java.util.Scanner;
public class AlphabeticalOrder
{
public static void main(String args[])
{
Scanner scnr = new Scanner(System.in);
System.out.print("Enter the String : ");
String st = scnr.nextLine();
int l = st.length();
st=st.toUpperCase();
for(int i = 65;i<=90;i++)
{
for(int j=0;j<l;j++)
{
char ch = st.charAt(j);
if(i==ch)
System.out.println((char)i+"");
}
}
}
}
