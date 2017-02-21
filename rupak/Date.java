import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Date 
{
    public static void main(String[] args) 
    {
        String strDate = "21/08/2011";
               
           try
           {
              SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
              java.util.Date date = sdf.parse(strDate);
              System.out.println("Date is: " + date);
           }
           catch(ParseException e)
           {
              System.out.println("Java String could not be converted to Date: " + e);
           }
    }
}
    

