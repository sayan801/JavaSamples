package equalstring;
public class Equalstring 
{
public static void main(String[] args) 
{
        String a= "RUPAK";
        String b= "rupak";
        if(a.equals(b))
        { 
            System.out.println("Both are equal");
        }
        else
        {
            System.out.println("Both are not equal");
        }
        if(a.equalsIgnoreCase(b))
        {
            System.out.println("Both are equal");
            
        }
        else
        {
            System.out.println("Both are not equal");
        }
            
}
    
}
