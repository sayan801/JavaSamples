package indexof;
public class Indexof 
{

    public static void main(String[] args) 
    {
        String str = "Use this string for testing this";
        System.out.println("Basic indexOf() example");
        System.out.println("Char 's' at first occurance: "+str.indexOf('s'));
        System.out.println("String \"this\" at first occurance: "+str.indexOf("this"));
        
        System.out.println("First occurance of char 's' from 4th index onwards : "+str.indexOf('s',4));
  System.out.println("First occurance of String \"this\" from 6th index onwards: "+str.indexOf("this",6));
   }
    
}
