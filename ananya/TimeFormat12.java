import java.util.Date;
import java.text.*;

public class TimeFormat12
{
	public static void main(String args[])
	{
		Date Time = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a z");		
		System.out.println("Current Time: " + ft.format(Time));
	}
}
