package stringformat;
import java.util.Locale;
public class Stringformat 
{
    public static void main(String[] args) 
    {
        String str = "This is %s format example";
        System.out.println(String.format(str, "string"));
        String str1 = "We are displaying no %d";
        System.out.println(String.format(str1, 10));
       
        System.out.println("String format with Locale info:");
        System.out.println(String.format(Locale.US, str1, 10));

    }
    
}
