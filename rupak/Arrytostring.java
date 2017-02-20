package arrytostring;
public class Arrytostring
{

    public static void main(String[] args) 
    {
        char ch[]={'m','y','j','a','v','a','a','p','p'};
        String chstr=String.copyValueOf(ch);
        System.out.println(chstr);
        
        String substr=String.copyValueOf(ch,2,4);
        System.out.println(substr);
        
    }
    
}
