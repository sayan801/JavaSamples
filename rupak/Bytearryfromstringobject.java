package bytearryfromstringobject;
public class Bytearryfromstringobject 
{
    public static void main(String[] args) 
    {
        String str="my first java app";
        byte[] byt=str.getBytes();
        System.out.println("String length:"+str.length());
        System.out.println("Byte length:"+byt.length);
        
    }
    
}
