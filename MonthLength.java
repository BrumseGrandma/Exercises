public class MonthLength
{
	public static void main(String[] args) 
	{
		//month from 1 to 12
		for (int month = 1; month <= 12; month++)
		{
			int days = DaysInMonth(month);

			System.out.println( "month " + month + " has " + days + " days.");
		}

	}

	public static int DaysInMonth(int month)
	{
		int days;


		if (month == 2)
		{
			days = 28;
		}

		else if (month == 4 || month == 6 || month == 9 || month == 11)
		{
			days = 30;
		}

		else 
		{
			days = 31;
		}

		return days;
	}
}