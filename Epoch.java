public class Epoch
{
	public static void main(String[] args) 
	{   
		long one_day = 24 * 60 * 60;
		long one_year = 365 * one_day;
		long seconds = (43 * one_year) + (113 * one_day);

		long years = seconds / one_year;

		long days = (seconds - (years * one_year)) / one_day;

		System.out.println(years + " years and " + days + " days");
	}
}
