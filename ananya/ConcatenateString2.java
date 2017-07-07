import java.util.Scanner;
public class ConcatenateString2
{    
public static void main(String args[])   
 { 
        String string1;    
        Scanner scan = new Scanner(System.in);
        string1 = "AnanyaSinha";  
        System.out.println("After concatination: \n" );
        System.out.print(string1.substring(0,6).concat("Technicise").concat(string1.substring(6))); 
        System.out.println(" \n" );
        
 }
}
