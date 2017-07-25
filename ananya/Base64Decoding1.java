import java.util.Base64;
public class Base64Decoding1
{
	public static void main(String args[])
	{
		Base64.Decoder decoder = Base64.getUrlDecoder();
		String dStr = new String(decoder.decode("aHR0cDovL3d3dy5qYXZhdHBvaW50LmNvbS9qYXZhLXR1dG9yaWFsLw=="));
		System.out.println("Decoded Url: " + dStr);	
	}
}
