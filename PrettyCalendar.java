public class PrettyCalendar
{
	public static void main(String[] args) 
	{
		
		String[] weekdays = {
			"Monday",
			"Tuesday",
			"Wednesday",
			"Thursday",
			"Friday",
			"Saturday",
			"Sunday"
		};

		int year = 2023;

		int[][] calendar = new int [12][31];

		int weekday = 6;

		for (int month = 0; month < 12; month++)
		{
			for (int day = 0; day < MonthLength(year, month); day++)
			{
				calendar[month][day] = weekday;
				weekday = (weekday + 1) % 7;
			}
		}

		for (int month = 0; month < 12; month++)
		{
			for (int day = 0; day < MonthLength(year, month); day++)
			{
				System.out.printf("%4d-%02d-%02d is a %s%n", year, month+1, day+1, weekdays[calendar[month][day]]);		
			}
		}

	}

	public static int MonthLength(int year, int month)
	{
		int[] normal_year = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		int[] leap_year = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		
		int[] arr = normal_year;

		if (year%4 == 0)
		{
			arr = leap_year;			
		}

		return arr[month];
	}
}