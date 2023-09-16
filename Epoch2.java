public class Epoch2
{
	public static void main(String[] args) 
	{
		long seconds = date2sec(0, 10, 24);


		if ((seconds >= (month2sec(11) + days2sec(24)) && (seconds < (month2sec(11) + days2sec(25)))) )
		{
			System.out.println(" Is ChRiSmAs! ");
		}
		else
		{
			long diff = date2sec(0, 11, 24) - seconds;
			long years = diff/year2sec(1);
			long months = (diff - year2sec(years))/month2sec(1);
			long days = (diff - year2sec(years) - month2sec(months))/days2sec(1);
			System.out.println(" there is " + months + " months and " + days + " days until ChRiSmaS!");
		}

	}

	public static long date2sec(long year, long month, long day)
	{
		return year2sec(year) + month2sec(month) + days2sec(day);
	}
	public static long year2sec(long year)
	{
		return year * month2sec(12); 
	}
	/**
	 * @param month index from 0 to 11.
	 * @return number of seconds in months 
	 */
	public static long month2sec(long month)
	{
		long result = month * days2sec(30); //based on 0 to 11
		return result;
	}
	public static long days2sec(long days)
	{
		long result = days * hours2sec(24);
		return result;
	}
	public static long hours2sec(long hours)
	{
		return hours * minutes2sec(60);
	}
	public static long minutes2sec(long minutes)
	{
		return minutes * 60;
	}
}