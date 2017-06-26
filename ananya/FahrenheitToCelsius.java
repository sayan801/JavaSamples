import java.util.Scanner;

public class FahrenheitToCelsius
{
	private static Scanner scnr;

	public static void main(String args[])
	{
		float temperature;
		scnr = new Scanner(System.in);
		
		System.out.println("Enter temperature in Fahrenheit: ");
		//temperature = scnr.nextInt();
		temperature = scnr.nextFloat();
		
		temperature = ((temperature - 32)*5/9);
		
		System.out.println("Temperature in Celsius: " + temperature);
	}
}



