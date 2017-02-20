package matchastring;
public class Matchastring 
{
    public static void main(String[] args) 
    {
      String[] str = {"www.java2novice.com", "http://java2novice.com"};
           for(int i=0;i < str.length;i++)
            {
              if(str[i].matches("^www\\.(.+)"))
               {
                System.out.println(str[i]+" is Starts with 'www'");
               } 
              else 
               {
                System.out.println(str[i]+" is not starts with 'www'");
               }      
            }
    }
}
