public class CelciusToFahrenheit
{
	public static void main(String[] args) 
	{
		double celcius = Double.parseDouble(args[0]);
		double fahrenheit = 32 + (9 * celcius) / 5;

		System.out.println(celcius + " degree C is " + fahrenheit + " degree F");
	}
}