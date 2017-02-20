package stringreplace;
public class Stringreplace 
{
    public static void main(String[] args) 
    {
        String str="Rupak Sarkar";
        System.out.println("in name a replace with o: "+str.replace('a','o'));
        System.out.println("in name rupak replace with prativa: "+str.replaceFirst("Rupak","prativa"));
        System.out.println("in name k replace with pk: "+str.replaceAll("ak","pk"));
    }
    
}
