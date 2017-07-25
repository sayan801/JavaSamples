import java.util.Base64;
public class Base64Encoding
{
	public static void main(String args[])
	{
		Base64.Encoder encoder = Base64.getUrlEncoder();
		String eStr = encoder.encodeToString("http://www.javatpoint.com/java-tutorial/".getBytes());
		System.out.println("Encoded Url: " + eStr);
	}
}



