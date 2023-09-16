public class ChristSale
{
	public static void main(String[] args) 
	{
		long seconds = 21816000; // Theres 252.5 days or 12 september
		long month = 30 * 24 * 60 * 60;

		seconds = month * 10 + (29 * 24 * 60 * 60); //30 november
		//seconds = month * 11; //december 
		//seconds = month * 11 + (23 * 24 * 60 * 60); //24 december
		//seconds = month * 11 + (24 * 24 * 60 * 60); //25 december

		long JulStart = 11 * month;
		long JulSlut = 11 * month + (24 * 24 * 60 * 60);
		double price = 599.95;

		if ((seconds > JulStart) && (seconds < JulSlut)) 
		{
			price += ((price*30)/100);
		}

	System.out.println(price);
		
	}
}