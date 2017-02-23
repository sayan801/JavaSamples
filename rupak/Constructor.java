package constructor;
public class Constructor 
{   
    String name="rupak";
    public void speak()
    {
        System.out.println("My Name is: "+name);
    }
    public static void main(String[] args) 
    {
        Constructor con=new Constructor();
        con.speak();
    }
    
}
